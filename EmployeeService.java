package com.swarnalatha.ems;

import java.util.ArrayList;

public class EmployeeService {

    private ArrayList<Employee> employeeList = new ArrayList<>();

    // Add Employee
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
        System.out.println("Employee Added Successfully...");
    }

    // Display All Employees
    public void displayEmployee() {

        if (employeeList.isEmpty()) {
            System.out.println("No Employee Records Found.");
            return;
        }

        for (Employee emp : employeeList) {

            System.out.println("-----------------------");
            System.out.println("Employee ID : " + emp.getEmployeeId());
            System.out.println("Employee Name : " + emp.getEmployeeName());
            System.out.println("Department : " + emp.getDepartment());
            System.out.println("Salary : " + emp.getSalary());
        }
    }

    // Search Employee
    public void searchEmployee(int employeeId) {

        for (Employee emp : employeeList) {

            if (emp.getEmployeeId() == employeeId) {

                System.out.println("Employee Found");
                System.out.println("Employee ID : " + emp.getEmployeeId());
                System.out.println("Employee Name : " + emp.getEmployeeName());
                System.out.println("Department : " + emp.getDepartment());
                System.out.println("Salary : " + emp.getSalary());

                return;
            }
        }

        System.out.println("Employee Not Found");
    }
 // Update Employee
    public void updateEmployee(int employeeId, String employeeName, String department, double salary) {

        for (Employee emp : employeeList) {

            if (emp.getEmployeeId() == employeeId) {

                emp.setEmployeeName(employeeName);
                emp.setDepartment(department);
                emp.setSalary(salary);

                System.out.println("Employee Updated Successfully...");
                return;
            }
        }

        System.out.println("Employee Not Found");
    }
 // Delete Employee
    public void deleteEmployee(int employeeId) {

        for (Employee emp : employeeList) {

            if (emp.getEmployeeId() == employeeId) {

                employeeList.remove(emp);
                System.out.println("Employee Deleted Successfully...");
                return;
            }
        }

        System.out.println("Employee Not Found");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}