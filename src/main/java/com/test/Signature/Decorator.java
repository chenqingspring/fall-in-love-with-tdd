package com.test.Signature;

public abstract class Decorator extends Email {
    Email email;

    protected Decorator(Email email) {
        this.email = email;
    }

    @Override
    public void printSignature() {
        if (email != null)
            email.printSignature();
    }
}
