package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    // TODO: Zmiana nazwy zmiennej temp na bardziej opisową
    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            temp.countIn(super.countOut());

        int ret = temp.countOut();

        while (!temp.callCheck())
            countIn(temp.countOut());

        return ret;
    }
}