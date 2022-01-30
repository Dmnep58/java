package com.devi;

import java.util.Scanner;
//WAP to enter id, name, age and basic salary of n number of employees. Calculate the
//gross salary of all the employees and display it along with all others details
// gross salary(gs)=basic salary(salary+da+hra);
//da = 80% of salary
//hra = 10% of salary

public class empdetail {
    int id;
    String name;
    double salary,gs,da,hra;
    public void employee()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------employee details----------------");
        System.out.println("Enter the name of the employee:");
        name=sc.nextLine();
        System.out.println("Enter the employee id: ");
        id= sc.nextInt();
        System.out.println("Enter the salary of the employee: ");
        salary=sc.nextDouble();
    }
    public void display()
    {
        da=(80*salary)/100;
        hra=(10*salary)/100;
        gs=salary+da+hra;
        System.out.println("the name of the employee is: "+name);
        System.out.println("the id of employee is: "+id);
        System.out.println("the salary of employee is: "+salary);
        System.out.println("the da is: "+da);
        System.out.println("the hra is: "+hra);
        System.out.println("the gross salary is: "+gs);
    }

}
