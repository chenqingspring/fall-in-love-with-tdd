package com.test.Signature;

public class DisplaySignature {

    public static void main(String args[]) {
        ConcreteEmail email1 = new ConcreteEmail();
        email1.printSignature();
        ConcreteEmail email = new ConcreteEmail();

        Email emailWithHeader = new EmailHeader(email, "Hi all,");
        Email emailWithFooter = new EmailFooter(email, "Thanks");

        Email emailWithHeaderAndFooter = new EmailFooter(emailWithHeader, "Thanks");

        Email emailWithFooterAndHeader = new EmailHeader(emailWithFooter,"Hi all");

        emailWithHeaderAndFooter.printSignature();

    }
}
