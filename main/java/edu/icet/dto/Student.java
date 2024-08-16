package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Student {

    private int id;
    private String name;
    private String address;
    private int age;
}
