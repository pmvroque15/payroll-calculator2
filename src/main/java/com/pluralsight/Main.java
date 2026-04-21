package com.pluralsight;
import java.io.*;
import java.util.Scanner;

public class Main {


    static void main() {
        Scanner scanner = new Scanner(System.in);

        try {
            //prompts for the employee/user
            System.out.println("Enter the name of the file employee file to process: ");
            String file = "src/main/resources/" + scanner.nextLine();

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            System.out.println("Enter the name of the payroll file to create: ");
            String createFileName = "src/main/resources/" + scanner.nextLine();

            FileWriter fileWriter = new FileWriter(createFileName);
            BufferedWriter bufWriter = new BufferedWriter(fileWriter);

            String line;
            int employeeNumber = 1;

            while ((line = (bufferedReader.readLine())) != null) {
                String[] parts = line.split("\\|");
                line = line.trim();
                if (line.startsWith("id") || line.startsWith("=") || line.isEmpty()) {
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

                String output = "===============================\n"
                        + "Employee #" + employeeNumber++ + " Details\n"
                        + "===============================\n"
                        + "Employee ID: " + newEmployee.getId() + "\n"
                        + "Employee Name: " + newEmployee.getName() + "\n"
                        + "Hours worked: " + newEmployee.getHoursWorked() + "\n"
                        + "Pay Rate: $" + newEmployee.getPayRate() +"/hour\n"
                        + "Gross Pay Total: $" + newEmployee.calculateGrossPay() + "\n";

                bufWriter.write(output);
                bufWriter.newLine();
            }

            bufferedReader.close();
            bufWriter.close();

            System.out.println("File created successfully!");

        } catch (FileNotFoundException e) {
            System.err.println("The file cannot be read. Check your source path of your file name." );
        } catch (IOException e) {
            System.err.println("File not found.");
        }
    }
}
