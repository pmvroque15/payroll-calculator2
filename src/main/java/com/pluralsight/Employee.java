package com.pluralsight;


public class Employee {
    private int id;
    private String name;

    static void main(String[] args) {

    }

    public Employee() {
    }

    public int getEmployeeId() {
        return this.id;
    };

    public void setEmployeeId(int id) {
        this.id = id;
    };

    public void setEmployeeName(String name) {
//        if (name.length() < 2) {
//            System.err.println("Name has to be at least 2 characters.");
//        }

        this.name = name;
    };

    public String getEmployeeName() {
        return this.name;
    };
}
