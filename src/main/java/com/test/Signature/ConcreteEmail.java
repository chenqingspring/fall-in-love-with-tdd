package com.test.Signature;

public class ConcreteEmail extends Email {
    @Override
    public void printSignature() {
        System.out.println("This is my Email!");
    }
}
