package com.test.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 11/25/12
 * Time: 12:14 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Decorator extends Component {
    private Component myComp;

    public Decorator(Component myComp) {
        this.myComp = myComp;
    }

    @Override
    public void prtTicket() {
        if(myComp != null)
            myComp.prtTicket();
    }
}