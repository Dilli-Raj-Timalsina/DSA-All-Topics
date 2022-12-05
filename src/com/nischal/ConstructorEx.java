package com.nischal;
import java.util.Scanner;
public class ConstructorEx {
    private int l,b,h;
    public ConstructorEx()
    {
        l=10;b=19;h=76;
    }
    public static void main(String[]args)
    {
        ConstructorEx c1=new ConstructorEx();
        System.out.println(c1.l);
//        System.out.println(c1);
        Student s=new Student();
   s.show();
    }
}
abstract class Person{
     void show(){
         System.out.println("Hello guys this is Person");
     };
}
class Student extends Person{
    void show()
    {
        System.out.println("Hello Guys this is Student");
    }
}
