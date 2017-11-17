package sorting;

import util.ArrayHelper;

/**
 * Created by nanjiang on 17/11/17.
 */
public class BubbleSort {
    public static int[] sortUp(int[] array) {
        if ((array == null ) || (array.length == 0)) return array;

        ArrayHelper.print(array);

        for (int i = 0; i < array.length; i++) {
            boolean allSorted = true;

            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;

                    allSorted = false;
                }

                ArrayHelper.print(array);
            }

            if (allSorted) return array;
        }

        return array;
    }
}