package com.test.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 11/25/12
 * Time: 12:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class Header1 extends Decorator {
    public Header1(Component myComp) {
        super(myComp);
    }

    public void prtTicket() {
        System.out.println("header style 1");
        super.prtTicket();
    }
}