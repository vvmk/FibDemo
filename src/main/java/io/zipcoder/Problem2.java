package io.zipcoder;

public class Problem2 {
    static String fiberative(int max) {
        return "";
    }

    static String fibcursive(int max) {
        return "0, 1" + fibcursive(0, 1, max);
    }

    private static String fibcursive(int a, int b, int max) {
        int n = a + b;
        return n >= max ? "" : ", " + n + fibcursive(b, n, max);
    }
}
