package org.example;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Kemal", 2000.0, 45.0, 1985);
        e1.printEmployee();
        e1.tax();
        e1.bonus();
        e1.raiseSalary();
    }
}