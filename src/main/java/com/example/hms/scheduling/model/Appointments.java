package com.example.hms.scheduling.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

//this is the model class a (po go class) where it will have plain objects which we use in our service class(business logic)
//here we use wrapper class(not primitive data types) because with the wrapper class only we can create objects
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity


public class Appointments {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer appointment_id;
    private Integer patient_id;
    private Integer doctor_id;
    private LocalDate appointment_date;
    private LocalTime appointment_time;
    private Status status;

}
