package com.example.demo.Models;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="booking")


public class bookingModel implements Serializable  {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String name;
    private Integer tableSize;
    private Date dateBooking;
 

}