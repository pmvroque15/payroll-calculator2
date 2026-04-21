package com.pluralsight;


public class Employee {
    private int id;
    private String name;
    private double hoursWorked;
    private double payRate;
    private double grossPay;
    static void main(String[] args) {

    }
    //region getters/setters
    public double getPayRate() {
        return this.payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return this.hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public double getGrossPay(double hoursWorked, double payRate) {
        return grossPay = hoursWorked * payRate;
    }

    public void setGrossPay(double grossPay) {

        this.grossPay = grossPay;
    }


    //endregion
}
