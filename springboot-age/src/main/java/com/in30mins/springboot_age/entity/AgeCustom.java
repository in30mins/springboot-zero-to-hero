package com.in30mins.springboot_age.entity;


import com.in30mins.springboot_age.constraint.Age;
import com.in30mins.springboot_age.constraint.Pan;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name="User_Data")
@Data
public class AgeCustom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotBlank(message = "")
    private String name;

    @Age(message = "Age still not 18 years")
    private LocalDate dob;
//    @Pattern(regexp = "[A-Z]{5}[0-9]{4}[A-Z]{1}")
    @Pan
    private String pan;
}
