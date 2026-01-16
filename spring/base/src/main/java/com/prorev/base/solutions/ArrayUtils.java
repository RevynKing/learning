package com.prorev.base.solutions;

import java.util.Arrays;
// import java.lang.reflect.Array; //look into and learn more

public class ArrayUtils {
    public static int[] getConcatenation(int[] a) {
        int[] b = Arrays.copyOf(a, 2 * a.length); // faster than manual loop
        System.arraycopy(a, 0, b, a.length, a.length); // faster than manual loop
        return b;
    }
    public static <T> T[] getConcatenation(T[] a) {
        T[] b = Arrays.copyOf(a, 2 * a.length); // faster than manual loop
        System.arraycopy(a, 0, b, a.length, a.length); // faster than manual loop
        return b;
    }

    /**
     * Short one-line summary of what the method does.
     *
     * Optional longer description if the method is non-trivial.
     *
     * @param a description of parameter a
     * @param n description of parameter n
     * @return description of return value
     * @throws IllegalArgumentException when input is invalid
    */
    public int[] getInterleaving(int[] a, int n) {
        if (a == null) throw new NullPointerException("a");
        if (a.length != 2 * n) throw new IllegalArgumentException("a.length must be 2*n");

        int[] b = new int[a.length];
        for(int i=0;i<n;i++){
            b[2*i]=a[i];
            b[2*i+1]=a[n+i];
        }
        return b;
    }

    /* 
    public static <T> T[] getInterleaving(Class<T> type, T[] a, int n) {
        if (a == null) throw new NullPointerException("a");
        if (a.length != 2 * n) throw new IllegalArgumentException("a.length must be 2*n");

        @SuppressWarnings("unchecked")
        T[] b = (T[]) Array.newInstance(type, a.length);
        for(int i=0;i<n;i++){
            b[2*i]=a[i];
            b[2*i+1]=a[n+i];
        }
        return b;
    }
    */
}
