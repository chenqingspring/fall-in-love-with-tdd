package com.test.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 11/25/12
 * Time: 12:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class Header2 extends Decorator {
    public Header2(Component myComp) {
        super(myComp);
    }

    public void prtTicket() {
        System.out.println("header style 2");
        super.prtTicket();
    }
}