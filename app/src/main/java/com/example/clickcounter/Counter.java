package com.example.clickcounter;

/**
 * Represents simple Java click counter
 */

public class Counter {
    private int n;

    public Counter() {
        n = 0;
    }

    public int getN() {
        return n;
    }

    public void addN() {
        n++;
    }
    public void resetN() {
        n = 0;
    }
}
