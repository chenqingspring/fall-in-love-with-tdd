package com.test.reflection;

public class Dog {
    private String head = "big";
    private String color = "black";
    double speed = 40;

    public Dog(String head, String color, double speed) {
        this.head = head;
        this.color = color;
        this.speed = speed;
    }

    public Dog() {
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void run(){
        System.out.println("a "+getHead()+" head dog in "+getColor()
                +" color is running at speed "+getSpeed()+" km");
    }
}
