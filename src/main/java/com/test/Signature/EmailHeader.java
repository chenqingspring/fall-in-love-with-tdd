package com.test.Signature;

public class EmailHeader extends Decorator {
    String header;
    public EmailHeader(Email email,String header) {
        super(email);
        this.header = header;
    }

    @Override
    public void printSignature() {
        System.out.println(header);
        super.printSignature();    //To change body of overridden methods use File | Settings | File Templates.
    }
}
