package sorting;

import java.util.Arrays;

/**
 * Created by nanjiang on 15/11/17.
 */
public class InsertionSort {
    public static int[] sort(int[] array) {
        if (array.length <= 0) return array;

        print(array);

        int i = 0;

        while (i < array.length) {
            int currentElement = array[i];
            int j = i-1;

            while (j >= 0) {
                if (currentElement < array[j]) {
                    array[j+1] = array[j];
                    array[j] = currentElement;

                    print(array);
                }

                j--;
            }

            i++;
        }

        return array;
    }

    static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
