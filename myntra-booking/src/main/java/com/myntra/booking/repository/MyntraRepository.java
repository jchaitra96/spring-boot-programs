package com.myntra.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myntra.booking.entity.MyntraEntity;

@Repository
public interface MyntraRepository extends JpaRepository<MyntraEntity, Integer>
{
	

}