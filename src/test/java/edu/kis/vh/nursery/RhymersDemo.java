package edu.kis.vh.nursery;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

class RhymersDemo {
    public static final int INPUT_COUNT = 15;
    public static final int STANDARD_RHYMERS_COUNT = 3;
    public static final int HANOI_INDEX = 3;
    public static final int RANDOM_BOUND = 20;
    public static void main(String[] args) {
        Rhymersfactory factory = new DefaultRhymersFactory();

        DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
                factory.getFIFORhymer(), factory.getHanoiRhymer()};

        for (int i = 1; i < INPUT_COUNT; i++)
            for (int j = 0; j < STANDARD_RHYMERS_COUNT; j++)
                rhymers[j].countIn(i);

        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < INPUT_COUNT; i++)
            rhymers[3].countIn(rn.nextInt(RANDOM_BOUND));

        for (int i = 0; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }

        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[HANOI_INDEX]).reportRejected());

    }

}