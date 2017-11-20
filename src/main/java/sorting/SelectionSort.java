package sorting;

import org.springframework.stereotype.Component;

import java.util.Comparator;

/**
 * Created by nanjiang on 19/11/17.
 */

@Component
public class SelectionSort {
    public int[] sortUp(int[] array) {
        return sort(array, (a, b) -> (a < b) ? -1 : 1);
    }

    public int[] sortDown(int[] array) {
        return sort(array, (a, b) -> (a > b) ? -1 : 1);
    }

    private int[] sort(int[] array, Comparator<Integer> comparator) {
        for (int i=0; i<array.length; i++) {
            int indexOfTheOne = findTheOne(array, i, comparator);
            swap(array, i, indexOfTheOne);
        }

        return array;
    }

    private void swap(int[] array, int i, int indexOfTheOne) {
        int tmp = array[i];
        array[i] = array[indexOfTheOne];
        array[indexOfTheOne] = tmp;
    }

    private int findTheOne(int[] array, int startIndex, Comparator<Integer> comparator) {
        int indexOfTheOne = startIndex;

        for (int index=startIndex; index<array.length; index++) {
            if (comparator.compare(array[indexOfTheOne], array[index]) >= 0) {
                indexOfTheOne = index;
            }
        }

        return indexOfTheOne;
    }
}
