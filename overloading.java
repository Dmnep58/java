// overloading of methods
// the overloading of methods means the name of the function is same, but it has different parameters.
//this has return type
package com.devi;

public class overloading {
    public static int sum(int a,int b){  // this method contains two variable
        return a+b;
    }
    public static int sum(int a,int b,int c){ //this has three variables but the name of the method is same as above.
        return a+b+c;
    }
    public static void main(String[] args)
    {
        //methods called ..
        System.out.println("the sum is:" +sum(2,3));
        System.out.println("the sum is:" +sum(2,3,4));
    }
}
