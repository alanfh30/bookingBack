package com.example.italika.services;
import java.util.ArrayList;

import com.example.demo.models.bookingModel;
import com.example.demo.repositories.bookingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;


@Service
public class cotizacionService {
    @Autowired
    bookingRepository bookingRepository;


    @Transactional(readOnly = true)
    public ArrayList<bookingModel> getBookings(){
        return (ArrayList<bookingModel>) bookingRepository.findAll();
    }

    @Transactional(readOnly = true)
    public bookingModel saveBooking(bookingModel usuario){
        return bookingRepository.save(usuario);
    }
}