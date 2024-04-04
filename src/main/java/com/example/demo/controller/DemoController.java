package com.example.demo;

import com.example.demo.models.bookingModel;
import com.example.demo.services.bookingService;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.ui.Model;

@RestController
public class DemoController {

    @Autowired
    bookingService bookingService;



	 @GetMapping ("/booking")
        public String inicio(Model model){

        var bookings = bookingService.getBookings();    
        model.addAttribute("bookings", bookings);

        return bookings;
    }


        @PostMapping("/save")
        public String guardar(bookingModel  bookingModel){
        return cotizacionService.saveBooking(bookingModel);
    }
}
