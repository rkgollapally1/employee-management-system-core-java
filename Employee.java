package com.swarnalatha.ems;

public class Employee {

    // Instance Variables
    private int employeeId;
    private String employeeName;
    private String department;
    private double salary;

    // Constructor
    public Employee(int employeeId, String employeeName, String department, double salary) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
    }

    // Getter Methods
    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    // Setter Methods
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}