package com.test.Polymorphism;

public class Run {
    public static void main(String arg[]){
        ChildOne c = new ChildOne();
        Farther f =new ChildOne();
        Farther farther = new Farther();
        c.func1();
        c.func2();
        System.out.println("=========================");
        f.func1();
        f.func2();
        System.out.println("=========================");
        farther.func1();
        farther.func2();
    }
}