package com.train.booking.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.train.booking.payment.entity.PaymentEntity;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Long>
{


}
