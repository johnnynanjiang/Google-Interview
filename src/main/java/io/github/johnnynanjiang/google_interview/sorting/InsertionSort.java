package io.github.johnnynanjiang.google_interview.sorting;

import io.github.johnnynanjiang.google_interview.util.ArrayHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Comparator;

/**
 * Created by nanjiang on 15/11/17.
 */

@Component
public class InsertionSort {
    @Autowired
    ArrayHelper arrayHelper;

    public int[] sortDown(int[] array) {
        return sort(
                array,
                (a, b) -> (a >= b) ? 1 : -1
        );
    }

    public int[] sortUp(int[] array) {
        return sort(
                array,
                (a, b) -> (a < b) ? 1 : -1
        );
    }

    int[] sort(int[] array, Comparator<Integer> comparator) {
        if (array.length <= 0) return array;

        arrayHelper.print(array);

        int i = 0;

        while (i < array.length) {
            int currentElement = array[i];
            int j = i-1;

            while (j >= 0) {
                if (comparator.compare(currentElement, array[j]) > 0) {
                    array[j+1] = array[j];
                    array[j] = currentElement;

                    arrayHelper.print(array);
                }

                j--;
            }

            i++;
        }

        return array;
    }
}
