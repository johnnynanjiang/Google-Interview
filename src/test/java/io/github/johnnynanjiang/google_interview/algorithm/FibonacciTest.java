package io.github.johnnynanjiang.google_interview.algorithm;

import io.github.johnnynanjiang.google_interview.util.BaseTest;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nanjiang on 16/12/17.
 */

public class FibonacciTest extends BaseTest {
    @Test
    public void test() {
        assertEquals("[1, 1, 2, 3, 5]", arrayHelper.print(Fibonacci.generate(5)));
    }

    @Test
    public void testGetLastNumber() {
        arrayHelper.print(Fibonacci.generate(6));
        assertEquals(8, Fibonacci.getLastOne(6));
    }
}