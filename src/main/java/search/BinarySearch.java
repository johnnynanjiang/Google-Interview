package search;

import util.ArrayHelper;

/**
 * Created by nanjiang on 16/11/17.
 */
public class BinarySearch {
    static final int INDEX_NOT_FOUND = -1;

   public static int search(Integer[] sortedArray, Integer key) {
       if ((sortedArray == null) || (sortedArray.length == 0)) return INDEX_NOT_FOUND;

       return search(sortedArray, 0, sortedArray.length - 1, key);
   }

   static int search(Integer[] sortedArray, int start, int end, Integer key) {
        ArrayHelper.print(sortedArray);
        System.out.println(String.format("%d %d", start, end));

        int middleIndex = (end - start) / 2;
        int middleValue = sortedArray[start + middleIndex];

        if (middleValue == key) return start + middleIndex;

        if (middleValue < key) return search(sortedArray, middleIndex + 1, end, key);

        if (middleValue > key) return search(sortedArray, start, middleIndex, key);

        return INDEX_NOT_FOUND;
    }
}
