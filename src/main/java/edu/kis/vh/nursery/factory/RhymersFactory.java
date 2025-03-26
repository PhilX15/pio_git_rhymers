package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

public interface RhymersFactory {

    abstract DefaultCountingOutRhymer getStandardRhymer();

    abstract DefaultCountingOutRhymer getFalseRhymer();

    abstract DefaultCountingOutRhymer getFIFORhymer();

    abstract DefaultCountingOutRhymer getHanoiRhymer();

}
