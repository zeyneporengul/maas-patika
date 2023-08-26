package org.example;

public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;
    double taxAmount;
    double bonus;
    double extra;
    int difference;


    Employee(String name, double salary, double workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public void tax(){
        if(this.salary>=1000){
            this.taxAmount = (this.salary*3)/100;
            System.out.println("Vergi: " + this.taxAmount);
        }
        else{
            this.taxAmount = 0.0;
            System.out.println("Vergi: " + this.taxAmount);
        }
    }

    public void bonus(){
        if(this.workHours>40){
            this.bonus = (workHours-40)*30;
        }
        System.out.println("Bonus: " + this.bonus);
    }

    public void raiseSalary(){
        this.difference = 2021 - this.hireYear;
        if(this.difference<10){
            this.extra = (this.salary*5)/100;
        } else if(this.difference>9 && this.difference<20){
            this.extra = this.salary/10;
        } else if(this.difference > 19){
            this.extra = (this.salary*15)/100;
        }
        System.out.println("Maaş artışı: " + this.extra);
        System.out.println("Vergi ve bonuslar ile birlikte maaş: " + (this.salary-this.taxAmount+this.bonus));
        System.out.println("Aylık toplam maaş: " + (this.salary-this.taxAmount+this.extra+this.bonus));
    }

    public void printEmployee(){
        System.out.println("Çalışan: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
    }
}
