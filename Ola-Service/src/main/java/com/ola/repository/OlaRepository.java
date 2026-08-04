package com.ola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ola.entity.OlaEntity;

@Repository
public interface OlaRepository extends JpaRepository<OlaEntity, Integer>
{
	

}
