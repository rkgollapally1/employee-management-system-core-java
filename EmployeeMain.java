package com.swarnalatha.ems;

import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        while (true) {

            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");

            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

            case 1:
            

                System.out.print("Enter Employee ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Employee Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Department: ");
                String department = sc.nextLine();

                System.out.print("Enter Salary: ");
                double salary = sc.nextDouble();

                Employee emp = new Employee(id, name, department, salary);

                service.addEmployee(emp);

                break;
                      case 2:
                service.displayEmployee();
                break;

            case 3:
            

                System.out.print("Enter Employee ID to Search: ");
                int searchId = sc.nextInt();

                service.searchEmployee(searchId);

                break; 	
                         case 4:
                         

                        	    System.out.print("Enter Employee ID to Update: ");
                        	    int updateId = sc.nextInt();
                        	    sc.nextLine();

                        	    System.out.print("Enter New Employee Name: ");
                        	    String updateName = sc.nextLine();

                        	    System.out.print("Enter New Department: ");
                        	    String updateDepartment = sc.nextLine();

                        	    System.out.print("Enter New Salary: ");
                        	    double updateSalary = sc.nextDouble();

                        	    service.updateEmployee(updateId, updateName, updateDepartment, updateSalary);

                        	    break;                	 
                         case 5:
                         

                        	    System.out.print("Enter Employee ID to Delete: ");
                        	    int deleteId = sc.nextInt();

                        	    service.deleteEmployee(deleteId);

                        	    
                              break;

            case 6:
                System.out.println("Thank You...");
                sc.close();
                System.exit(0);

            default:
                System.out.println("Invalid Choice...");
            }
        }
    }
}