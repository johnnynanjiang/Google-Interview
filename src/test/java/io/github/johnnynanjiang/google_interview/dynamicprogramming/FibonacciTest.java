package io.github.johnnynanjiang.google_interview.dynamicprogramming;

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
    public void testGetLastNumberRecursiveVersion() {
        assertEquals(832040, Fibonacci.getLastOne(30));
        //increase from 7 to 25 will significantly reduce the performance on recursive getLastOne()
    }

    @Test
    public void testGetLastNumberDynamicProgrammingTopDownVersion() {
        assertEquals(832040, FibonacciV2.getLastOne(30));
    }

    @Test
    public void testGetLastNumberDynamicProgrammingBottomUpVersion() {
        assertEquals(832040, FibonacciV3.getLastOne(30));
    }
}