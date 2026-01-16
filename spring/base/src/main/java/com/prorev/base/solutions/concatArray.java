package com.prorev.base.solutions;

import java.util.Arrays;

public class concatArray {
        public int[] getConcatenation(int[] a) {
        int[] b = Arrays.copyOf(a, 2 * a.length);
        System.arraycopy(a, 0, b, a.length, a.length);
        return b;
    }
}
