package com.java1;

public class ContractEmployee extends Employee {
    public ContractEmployee(String employeeID, String name, String position, String department,int salary){
        super(employeeID, name, position, department, salary);
    }

    @Override
    public void increaseSalary(int amount){
        System.out.println("Salary Increase: " + "Rp." + amount);
        
        increaseSalary1(amount);

        System.out.println("Current Salary: " + "Rp." + getSalary());
    }
}
