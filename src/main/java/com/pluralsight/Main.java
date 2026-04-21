package com.pluralsight;
import java.io.*;
import java.util.Scanner;

public class Main {


    static void main() {
        Scanner scanner = new Scanner(System.in);

        try {
//            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
            //prompts for the employee/user
            System.out.println("Enter the name of the file employee file to process: ");
            String file = scanner.nextLine();
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufWriter = new BufferedWriter(fileWriter);

            bufWriter.close();
            Employee[] employees = new Employee[8];
            int index = 0;
            String line;
            int employeeNumber = 1;
            while ((line = (bufWriter.readLine())) != null) {
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

                //Adding in arrays of employees
                employees[index] = newEmployee;
                index++;

                System.out.println("===============================");
                System.out.printf("      Employee #%s Details        \n", employeeNumber++);
                System.out.println("===============================");
                System.out.printf("Employee ID: %s\n", newEmployee.getId());
                System.out.printf("Employee Name: %s\n", newEmployee.getName());
                System.out.printf("Hours worked: %s\n", newEmployee.getHoursWorked());
                System.out.printf("Pay Rate: $%s/hour\n", newEmployee.getPayRate());
                System.out.printf("Gross Pay Total: $%s\n", newEmployee.calculateGrossPay());
                System.out.println(" ");
                
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.err.println("The file cannot be read. Check your source path of your file name." );
        } catch (IOException e) {
            System.err.println("File not found.");
        }
    }
}
