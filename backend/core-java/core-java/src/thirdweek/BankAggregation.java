package thirdweek;

public class BankAggregation {
}

// Class 1
// Bank class
class Bank {

    // Attributes of bank
    private String name;

    // Constructor of this class
    Bank(String name)
    {
        // this keyword refers to current instance itself
        this.name = name;
    }

    // Method of Bank class
    public String getBankName()
    {
        // Returning name of bank
        return this.name;
    }
}

// Class 2
// Employee class
class Employee {
    // Attributes of employee
    private String name;
    // Employee name
    Employee(String name)
    {
        // This keyword refers to current instance itself
        this.name = name;
    }

    // Method of Employee class
    public String getEmployeeName()
    {
        // returning the name of employee
        return this.name;
    }
}

// Class 3
// Association between both the
// classes in main method
class Test {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating objects of bank and Employee class
        Bank bank = new Bank("Finansbank");
        Employee emp = new Employee("Taner");

        // Print and display name and
        // corresponding bank of employee
        System.out.println(emp.getEmployeeName()
                + " is employee of "
                + bank.getBankName());
    }
}