package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int CAPACITY = 12;
    public static final int EMPTY_INDEX = -1;
    public static final int ERROR_VALUE = -1;

    private final int[] numbers = new int[CAPACITY];
    public int total = EMPTY_INDEX;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_INDEX;
    }

    public boolean isFull() {
        return total == CAPACITY - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR_VALUE;
        return numbers[total--];
    }

}
