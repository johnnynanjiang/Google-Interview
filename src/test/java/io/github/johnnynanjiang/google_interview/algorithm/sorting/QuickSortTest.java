package io.github.johnnynanjiang.google_interview.algorithm.sorting;

import io.github.johnnynanjiang.google_interview.util.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by nanjiang on 25/11/17.
 */

public class QuickSortTest extends BaseTest {
    @Autowired
    QuickSort quickSort;

    @Test
    public void testSortUp() throws Exception {
        int[] arrayToSort = new int[] {7, 6, 5, 4, 3, 1, 2};

        assertEquals(
                "[1, 2, 3, 4, 5, 6, 7]",
                Arrays.toString(quickSort.sortUp(arrayToSort))
        );
    }

    @Test
    public void testSortUpWithOneElement() throws Exception {
        int[] arrayToSort = new int[] {0};

        assertEquals(
                "[0]",
                Arrays.toString(quickSort.sortUp(arrayToSort))
        );
    }

    @Test
    public void testSortUpWithTwoElement() throws Exception {
        int[] arrayToSort = new int[] {1, 0};

        assertEquals(
                "[0, 1]",
                Arrays.toString(quickSort.sortUp(arrayToSort))
        );
    }

    @Test
    public void testSortUpWithArrayAlreadyInOrder() throws Exception {
        int[] arrayToSort = new int[] {1, 2, 3, 4, 5, 6, 7};

        assertEquals(
                "[1, 2, 3, 4, 5, 6, 7]",
                Arrays.toString(quickSort.sortUp(arrayToSort))
        );
    }

    @Test
    public void testSortUpWithArrayAlreadyInReverseOrder() throws Exception {
        int[] arrayToSort = new int[] {7, 6, 5, 4, 3, 2, 1};

        assertEquals(
                "[1, 2, 3, 4, 5, 6, 7]",
                Arrays.toString(quickSort.sortUp(arrayToSort))
        );
    }
}