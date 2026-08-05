package com.ajio.billing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajio.billing.entity.AjioEntity;

@Repository
public interface AjioRepository extends JpaRepository<AjioEntity, String>
{

}
