package com.java8.java8.Custom;

import com.java8.java8.Model.Employees;

import java.util.*;
import java.util.stream.Collectors;

public class findSecondhighestSalary {

    public static void main(String[] args) {
        List<Employees> list = new ArrayList<>(dataSetUp());
        Optional<Double> findSecondhighestSalary = list.stream().map(e-> e.getSalary())
                .sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println("findSecondhighestSalary -> "+findSecondhighestSalary.get());

        Long employeeCount = list.stream().filter(e-> e.getDept().equals("devops"))
                .collect(Collectors.counting());
        System.out.println("Department-wise Employee Count -> "+employeeCount);
    }

    public static List<Employees> dataSetUp() {
        Employees e1 = new Employees(1, "ashok", 50050,"devops");
        Employees e2 = new Employees(2, "kary", 58600,"devops");
        Employees e3 = new Employees(3, "satish", 50000,"java devloper");
        Employees e4 = new Employees(4, "akash", 59000,"devops");
        Employees e5 = new Employees(5, "veresh", 57004,"java devloper");

        List<Employees> list = Arrays.asList(e1, e2, e3, e4, e5);
        return list;
    }
}
