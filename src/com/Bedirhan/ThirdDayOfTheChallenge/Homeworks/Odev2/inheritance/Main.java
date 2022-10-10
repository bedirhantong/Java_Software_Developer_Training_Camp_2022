package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev2.inheritance;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();
        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();
        customerManager.add();
        employeeManager.add();
    }
}
