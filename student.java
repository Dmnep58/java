package com.devi;

import java.util.Scanner;

public class student {
    int roll,i,n;
    double total,percentage;
    String name;

    void data()
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("----------------------student details----------------");
            System.out.print("Enter the name of the student: ");
            name = sc.next();
            System.out.print("Enter the roll number of the student: ");
            roll = sc.nextInt();
            System.out.println("enter the marks :");
            double[] marks = new double[5];
            for (i = 0; i < 5; i++) {
                marks[i] = sc.nextDouble();
                total = total + marks[i];
            }
            percentage=total/5;

        sc.close();
    }

    void display()
    {
        System.out.println("the name of the student is: "+name);
        System.out.println("the roll number of the students is:"+roll);
        System.out.println("the total marks of the student is: "+total);
        System.out.println("the percentage of the student is: "+percentage+"%");

    }

}
