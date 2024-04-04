package com.example.demo.repositories;

import com.example.demo.models.bookingModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.ArrayList;

@Repository

public interface bookingRepository extends CrudRepository<bookingModel, Long>{
 
}