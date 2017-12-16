package io.github.johnnynanjiang.google_interview.util;

import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by nanjiang on 16/11/17.
 */

@Component
public class ArrayHelper {
    public String print(int[] array) {
        String result = Arrays.toString(array);
        System.out.println(result);
        return result;
    }

    public String print(long[] array) {
        String result = Arrays.toString(array);
        System.out.println(result);
        return result;
    }

    public String print(Object[] array) {
        String result = Arrays.toString(array);
        System.out.println(result);
        return result;
    }
}
