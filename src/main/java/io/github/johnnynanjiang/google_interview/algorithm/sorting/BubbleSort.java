package io.github.johnnynanjiang.google_interview.algorithm.sorting;

import io.github.johnnynanjiang.google_interview.util.ArrayHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by nanjiang on 17/11/17.
 */

@Component
public class BubbleSort {
    @Autowired
    ArrayHelper arrayHelper;

    public int[] sortUp(int[] array) {
        if ((array == null ) || (array.length == 0)) return array;

        arrayHelper.print(array);

        for (int i = 0; i < array.length; i++) {
            boolean allSorted = true;

            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;

                    allSorted = false;
                }

                arrayHelper.print(array);
            }

            if (allSorted) return array;
        }

        return array;
    }
}