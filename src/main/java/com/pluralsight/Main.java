package com.pluralsight;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {


    static void main() {
        Scanner scanner = new Scanner(System.in);
        Employee employee1 = new Employee();

        System.out.println("Please Type your name: ");
        String employeeName = scanner.nextLine();
        employee1.setEmployeeName(employeeName);

        System.out.println("Please type your employeeID: ");
        int employeeID = scanner.nextInt();
        employee1.setEmployeeId(employeeID);


        System.out.println(employee1.getEmployeeName());
        System.out.println(employee1.getEmployeeId());
//        try {
//            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
    }
}
