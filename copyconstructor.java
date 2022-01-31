package com.devi;
//copy constructor copies the details of the constructor .
// it uses reference to specify the object present in the constructor from which it will copy.
public class copyconstructor {
int id;
String name;
copyconstructor(int i,String s)
{
    id=i;
    name=s;
}
copyconstructor(copyconstructor cp)
{
    id=cp.id;
    name=cp.name;
}
public static void main(String[] args){
    copyconstructor obj = new copyconstructor(1,"devi");
    System.out.println("the name and id is: "+obj.id+" "+obj.name); // parametrized constructor called
    copyconstructor obj1 =new copyconstructor(obj);
    System.out.println(obj1.id+" "+obj1.name);
}
}

