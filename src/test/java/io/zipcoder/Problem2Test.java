package io.zipcoder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem2Test {
    @Test
    void testFibIterative() {
        int input = 150;

        String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        String actual = Problem2.fiberative(input);

        assertEquals(expected, actual);
    }

    @Test
    void testFibRecursive() {
        int input = 150;

        String expected = "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144";
        String actual = Problem2.fibcursive(input);

        assertEquals(expected, actual);
    }
}
