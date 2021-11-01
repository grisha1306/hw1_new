package com.company.work;

import com.company.figures.Circle;

public class Employee {
    private int id;
    private String firstName ;
    private String lastName;
    private int salary;

    public Employee (int id, String firstName, String lastName , int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return 12*salary;
    }

    public int raiseSalary ( int percent ) {
        return ((salary/100) * (100 + percent));
    }

    @Override
    public String toString() {
        return "Employee[id = " + id + ", name = " + getName() + ", salary = " + salary + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // первый шаг

        if (!(obj instanceof Employee)) return false; // второй шаг

        if(obj == null) return false;

        Employee employee = (Employee) obj; // третий шаг

        return this.id == employee.id && this.salary == employee.salary &&
                            this.firstName.equals(employee.firstName) && this.lastName.equals(employee.lastName); // вывод
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31*result + id;
        result = 31*result + firstName.hashCode();
        result = 31*result + lastName.hashCode();
        result = 31*result + salary;

        return result;
    }

}
