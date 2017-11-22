package io.github.johnnynanjiang.google_interview.sorting;

import io.github.johnnynanjiang.google_interview.util.ArrayHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by nanjiang on 18/11/17.
 */

//ToDo it is crap, need to come up with a much better solution
@Component
public class MergeSort {
    @Autowired
    ArrayHelper arrayHelper;

    public int[] sortUp(int[] array) {
        Range range = new Range(0, array.length - 1);
        divideAndConquer(array, range);
        return array;
    }

    Range divideAndConquer(int[] array, Range range) {
        arrayHelper.print(array);
        System.out.println(String.format("%d, %d", range.start, range.end));

        Range[] ranges = divide(range);

        if (ranges == null) return range;

        if (divide(ranges[0]) != null) {
            divideAndConquer(array, ranges[0]);
        }

        if (divide(ranges[1]) != null) {
            divideAndConquer(array, ranges[1]);
        }

        return conquer(array, ranges[0], ranges[1]);
    }

    public Range[] divide(Range range) {
        if (range.start == range.end) return null;

        int start = range.start;
        int middle = range.start + (range.end - range.start) / 2;
        int end = range.end;

        Range[] ranges = new Range[] {
                new Range(start, middle),
                new Range(middle + 1, end)
        };

        return ranges;
    }

    public Range conquer(int[] array, Range range0, Range range1) {
        int[] arrayNew = new int[range0.getSize() + range1.getSize()];
        int i = 0;

        int index0 = range0.start;
        int index1 = range1.start;

        while(i < arrayNew.length) {
            if (index0 > range0.end) {
                arrayNew[i++] = array[index1++];
                continue;
            }

            if (index1 > range1.end) {
                arrayNew[i++] = array[index0++];
                continue;
            }

            if (array[index1] <= array[index0]) {
                arrayNew[i++] = array[index1++];
                continue;
            }

            if (array[index0] < array[index1]) {
                arrayNew[i++] = array[index0++];
                continue;
            }
        }

        System.arraycopy(arrayNew, 0, array, range0.start, arrayNew.length);

        return new Range(range0.start, range1.end);
    }
}

class Range {
    public int start;
    public int end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getSize() {
        return end - start + 1;
    }
}
