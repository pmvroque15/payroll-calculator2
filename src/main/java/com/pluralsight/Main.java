package com.pluralsight;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {


    static void main() {
        Scanner scanner = new Scanner(System.in);
        Employee employee1 = new Employee();

        try {
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = (bufferedReader.readLine())) != null) {
                String[] parts = line.split("\\|");
                if (line.startsWith("id")) {
                    continue;
                }
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                double hoursWorked = Double.parseDouble(parts[2]);
                double payRate = Double.parseDouble(parts[3]);



                Employee newEmployee;
                newEmployee = new Employee();
                newEmployee.setId(id);
                newEmployee.setName(name);
                newEmployee.setHoursWorked(hoursWorked);
                newEmployee.setPayRate(payRate);

                System.out.println("===============================");
                System.out.println("      Employee Details        ");
                System.out.println("===============================");
                System.out.printf("Employee ID: %s\n", newEmployee.getId());
                System.out.printf("Employee Name: %s\n", newEmployee.getName());
                System.out.printf("Hours worked: %s\n", newEmployee.getHoursWorked());
                System.out.printf("Pay Rate: $%s\n", newEmployee.getPayRate());
                System.out.println(" ");

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
