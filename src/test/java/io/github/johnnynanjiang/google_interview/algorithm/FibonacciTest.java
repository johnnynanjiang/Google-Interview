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
        arrayHelper.print(Fibonacci.generate(7));
        assertEquals(13, Fibonacci.getLastOne(7));
        //increase from 7 to 70 will significantly reduce the performance on recursive getLastOne()
    }
}