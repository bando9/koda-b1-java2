package com.java1;

public class PermanentEmployee extends Employee{
    public PermanentEmployee(String employeeID, String name, String position, String department,int salary){
        super(employeeID, name, position, department, salary);
    }

    @Override 
    public void increaseSalary(int amount){
        System.out.println("Salary Increase: " + "Rp." + amount);
        addSalary(amount);
        System.out.println("Current Salary: " + "Rp." + getSalary());
    }
}
