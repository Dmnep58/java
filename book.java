package com.devi;

import java.util.Scanner;

public class book {
    String name;
    int book_isbn;
    String publisher,author;
    Scanner sc = new Scanner(System.in);
    void data() {
        System.out.println("Details of the book");
        System.out.println("-------------------------------------------------");
        System.out.print("Enter the name of the book: ");
        name = sc.nextLine();
        System.out.print("Enter the name of the publisher: ");
        publisher = sc.nextLine();
        System.out.print("enter the book_isbn number: ");
        book_isbn = sc.nextInt();
        System.out.print("Enter the name of the author: ");
        author = sc.next();
    }
    void view()
    {
        System.out.println("the name of the book is: "+name);
        System.out.println("the isbn number of book is: "+book_isbn);
        System.out.println("the publisher of the book is: "+publisher);
        System.out.println("the author of the book is: "+author);
    }
}



