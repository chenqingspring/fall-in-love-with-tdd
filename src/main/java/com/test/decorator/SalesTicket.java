package com.test.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 11/25/12
 * Time: 12:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class SalesTicket extends Component{
    @Override
    public void prtTicket() {
        System.out.println("Body");
    }
}
