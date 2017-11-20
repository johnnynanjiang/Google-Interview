package util;

import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by nanjiang on 16/11/17.
 */

@Component
public class ArrayHelper {
    public void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public void print(Object[] array) {
        System.out.println(Arrays.toString(array));
    }
}
