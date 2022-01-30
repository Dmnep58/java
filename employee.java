package com.devi;

import java.util.Scanner;

// to calculate the employee name , id and salary using class and objects.

public class employee {
     String name;
     int id;
    double salary;

    void data() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the employee name: ");
        name = sc.nextLine();
        System.out.print("Enter the employee id: ");
        id = sc.nextInt();
        System.out.print("Enter the salary of the employee");
        salary = sc.nextDouble();
    }
    void display()
    {
        System.out.println("the employee details is : ");
        System.out.println("The name of employee is: " +name);
        System.out.println("the id of employee is :"+ id);
        System.out.println("The salary of employee is : "+ salary);

    }
}
