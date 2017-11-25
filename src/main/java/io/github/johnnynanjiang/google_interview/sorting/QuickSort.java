package io.github.johnnynanjiang.google_interview.sorting;

import io.github.johnnynanjiang.google_interview.util.ArrayHelper;
import io.github.johnnynanjiang.google_interview.util.Comparator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by nanjiang on 25/11/17.
 */

@Component
public class QuickSort {
    @Autowired
    ArrayHelper arrayHelper;

    java.util.Comparator<Integer> comparator;

    public int[] sortUp(int[] array) {
        return sort(array, Comparator.SORT_ASCEND);
    }

    int[] sort(int[] array, java.util.Comparator<Integer> comparator) {
        arrayHelper.print(array);
        this.comparator = comparator;
        partition(array, 0, array.length - 1);
        return array;
    }

    void partition(int[] array, int lowIndex, int highIndex) {
        if (highIndex <= lowIndex) return;

        int pivotIndex = sort(array, lowIndex, highIndex);

        partition (array, lowIndex, pivotIndex - 1);
        partition (array, pivotIndex + 1, highIndex);
    }

    int sort(int[] array, int lowIndex, int highIndex) {
        int pivotIndex = highIndex;

        for (int i = lowIndex; i < highIndex; i++) {
            if (comparator.compare(array[i], array[pivotIndex]) > 0 ) {
                int tmp = array[pivotIndex - 1];
                array[pivotIndex - 1] = array[pivotIndex];
                array[pivotIndex] = tmp;

                tmp = array[i];
                array[i] = array[pivotIndex];
                array[pivotIndex] = tmp;

                pivotIndex = pivotIndex - 1;
                i = i + 1;
            }

            arrayHelper.print(array);
        }

        return pivotIndex;
    }
}
