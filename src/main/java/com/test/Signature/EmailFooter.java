package com.test.Signature;

public class EmailFooter extends Decorator {
    String name = "";

    public EmailFooter(Email email, String name) {
        super(email);
        this.name = name;
    }

    @Override
    public void printSignature() {
        super.printSignature();
        System.out.println(name);
    }
}
