package com.iori.api;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class TestVisualAccumulator {

    public static void main(String[] args) {
        int T = Integer.parseInt("2000");
        VisualAccumulator a = new VisualAccumulator(T, 1.0);
        for (int t = 0; t < T; t++)
            a.addDataValue(StdRandom.uniform());
        StdOut.print(a);
    }

}
