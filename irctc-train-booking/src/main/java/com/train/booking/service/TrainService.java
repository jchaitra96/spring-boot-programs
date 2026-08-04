package com.train.booking.service;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.train.booking.entity.TrainEntity;
import com.train.booking.exception.InSufficientBalanceException;
import com.train.booking.payment.entity.PaymentEntity;
import com.train.booking.payment.repository.PaymentRepository;
import com.train.booking.repository.TrainRepository;
import com.train.booking.request.TrainRequest;
import com.train.booking.response.TrainResponse;

import jakarta.transaction.Transactional;

@Service
public class TrainService {

    @Autowired
    TrainRepository trainRepository;

    @Autowired
    PaymentRepository paymentRepository;

    public List<TrainResponse> getAllTickets(String userId, String pageNumber, String pageSize) {

        Pageable pageable = PageRequest.of(Integer.parseInt(pageNumber), Integer.parseInt(pageSize));

        Page<TrainEntity> tickets = trainRepository.findAll(pageable);

        List<TrainResponse> response = new ArrayList<>();

        for (TrainEntity trainEntity : tickets) {

            TrainResponse ticketResponse = new TrainResponse();

            ticketResponse.setBookingId(trainEntity.getBookingId());
            ticketResponse.setPnrNumber(trainEntity.getPnr());
            ticketResponse.setBookingStatus("CONFIRMED");
            ticketResponse.setJourneyDate(trainEntity.getJourneyDate());
            ticketResponse.setCoach("B2");
            ticketResponse.setSeatNumber("32");

            response.add(ticketResponse);
        }

        return response;
    }

    @Transactional
    public TrainResponse doBooking(TrainRequest trainRequest) {

        TrainEntity trainEntity = new TrainEntity();

        trainEntity.setFromStation(trainRequest.getFrom());
        trainEntity.setToStation(trainRequest.getTo());
        trainEntity.setJourneyDate(trainRequest.getDate());
        trainEntity.setTravelClass(trainRequest.getTravelClass());
        trainEntity.setPassengerName(trainRequest.getPassengerName());
        trainEntity.setAge(trainRequest.getAge());
        trainEntity.setGender(trainRequest.getGender());
        trainEntity.setUserId(trainRequest.getUserId());
        // trainEntity.setPnr(generatePnr());
        trainEntity.setStatus("booking_initialization............");

        // 1. Save booking
        trainEntity = trainRepository.save(trainEntity);

        // 2. Create payment
        PaymentEntity paymentEntity = new PaymentEntity();
        paymentEntity.setAmount(1235);
        paymentEntity.setBookingId(trainEntity.getBookingId());
        paymentEntity.setTransactionId("TXN12345");
        paymentEntity.setPaymentStatus("failed.....");

        try {
            String statusFromPG = null;
            paymentEntity.setPaymentStatus(statusFromPG.concat("some text..."));
        } catch (Exception e) {
            e.printStackTrace();
            throw new InSufficientBalanceException("User does not have enough balance to book ticket.");
        }

        // 3. Save payment
        PaymentEntity paymentEntityResponse = paymentRepository.save(paymentEntity);

        TrainResponse response = null;

        if (paymentEntityResponse.getPaymentId() > 0) {

            trainEntity.setPnr(generatePnr());
            trainEntity.setStatus("BOOKED");

            // 4. Update booking
            trainEntity = trainRepository.save(trainEntity);

            response = new TrainResponse();

            response.setBookingId(trainEntity.getBookingId());
            response.setPnrNumber(trainEntity.getPnr());
            response.setBookingStatus("CONFIRMED");
            response.setJourneyDate(trainEntity.getJourneyDate());
            response.setCoach("B2");
            response.setSeatNumber("32");
            response.setMessage("Ticket booked successfully.");
        }

        return response;
    }

    public static String generatePnr() {

        Random random = new Random();
        long pnr = 1000000000L + (long) (random.nextDouble() * 9000000000L);
        return String.valueOf(pnr);
    }
}