package com.test.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 11/25/12
 * Time: 12:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class Footer1 extends Decorator {
    public Footer1(Component myComp) {
        super(myComp);
    }
    public void prtTicket() {
        super.prtTicket();
        System.out.println("footer style 1");
    }
}
