package com.java8.java8.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employees {

    private int empNo;

    private String name;

    private double salary;

    private String dept;
}