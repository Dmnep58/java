package com.devi;  // package name of this project.


import java.util.Scanner;
public class Main {


    public static <s> void main(String[] args) {
        Scanner sc =new Scanner(System.in);

       // for employee portion or details

      employee obj = new employee();//created object for the class employee
      obj.data();// called the data method.
      obj.display();//called the display method.

         // for the book information.
        System.out.println("----------------------------------------------------------------");
        book obj1 = new book(); // created the object for class book.
        obj1.data(); // called the data method using the dot operator.
        obj1.view();// called the view method using dot operator.


       // for the student having marks in 5 subjects.
        student obj2 =new student(); //created object for student class
        obj2.data();//called data method
        obj2.display();//called display method
        
    // calculation of basic salary , gross salary , da and hra of employee through user input.
       empdetail[] s=new empdetail[3];
       for(int i=0;i <= 3;i++)
       {
           s[i]=new empdetail();
           s[i].employee();
           s[i].display();
       }

    }
}
