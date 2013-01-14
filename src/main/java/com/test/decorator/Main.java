package com.test.decorator;

public class Main {
    public static void main(String args[]) {
        Component com = new SalesTicket();
        Component headCom = new Header2(com);
        Component headCom2 = new Header1(headCom);
        Footer1 footer1 = new Footer1(headCom2);
        footer1.prtTicket();
    }
}