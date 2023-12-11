package com.iori.api;


import edu.princeton.cs.algs4.StdDraw;

/**
 * 一种能够累加数据的抽象数据类型(可视版本)
 */
public class VisualAccumulator {
    private double total;
    private int N;

    public VisualAccumulator(int trials, double max) {
        StdDraw.setXscale(0, trials);
        StdDraw.setYscale(0, max);
        StdDraw.setPenRadius(.005);
    }

    public void addDataValue(double val) {
        N++;
        total += val;
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.point(N, val);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(N,total / N);
    }

    @Override
    public String toString() {
        return "VisualAccumulator{" +
                "total=" + total +
                ", N=" + N +
                '}';
    }
}
