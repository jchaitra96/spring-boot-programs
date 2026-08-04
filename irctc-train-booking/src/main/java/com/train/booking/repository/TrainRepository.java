package com.train.booking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.train.booking.entity.TrainEntity;

@Repository
public interface TrainRepository extends JpaRepository<TrainEntity, Long>
{
	// List<TrainEntity> findByUserId(String userId);

}