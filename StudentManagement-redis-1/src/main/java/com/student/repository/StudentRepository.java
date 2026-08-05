package com.student.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.student.entity.StudentEntity;

@Repository
public interface StudentRepository extends MongoRepository<StudentEntity, String>
{
	Optional<StudentEntity>  findByName(String name);

}