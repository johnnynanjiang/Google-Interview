package io.github.johnnynanjiang.google_interview.sorting;

import io.github.johnnynanjiang.google_interview.util.AppConfig;
import io.github.johnnynanjiang.google_interview.util.ArrayHelper;
import io.github.johnnynanjiang.google_interview.util.Comparator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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

    private int[] sort(int[] array, java.util.Comparator<Integer> comparator) {
        arrayHelper.print(array);
        this.comparator = comparator;
        partition(array, 0, array.length - 1);
        return array;
    }

    private void partition(int[] array, int lowIndex, int highIndex) {
        if (highIndex <= lowIndex) return;

        int pivotIndex = sortAndSwap(array, lowIndex, highIndex);

        partition (array, lowIndex, pivotIndex - 1);
        partition (array, pivotIndex + 1, highIndex);
    }

    private int sortAndSwap(int[] array, int lowIndex, int highIndex) {
        int pivotIndex = highIndex;
        int startIndex = lowIndex;

        while (startIndex < pivotIndex) {
            if (comparator.compare(array[startIndex], array[pivotIndex]) > 0) {
                int tmp = array[pivotIndex - 1];
                array[pivotIndex - 1] = array[pivotIndex];
                array[pivotIndex] = tmp;

                if (pivotIndex - startIndex > 1) {
                    tmp = array[startIndex];
                    array[startIndex] = array[pivotIndex];
                    array[pivotIndex] = tmp;
                }

                pivotIndex = pivotIndex - 1;

            } else {
                startIndex = startIndex + 1;
            }

            arrayHelper.print(array);
        }

        return pivotIndex;
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        QuickSort quickSort = context.getBean(QuickSort.class);
        quickSort.sortUp(new int[] {3, 2, 1});
    }
}
