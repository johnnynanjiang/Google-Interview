package io.github.johnnynanjiang.google_interview.dynamicprogramming;

import io.github.johnnynanjiang.google_interview.util.Print;

/**
 * Created by nanjiang on 16/12/17.
 */

public class Fibonacci {
    public static long[] generate(int i) {
        if (i<0) {
            return null;
        }

        long[] result = new long[i];

        if (i==0) {
            return result;
        }

        if (i>=1) {
            result[0] = 1;
        }

        if (i>=2) {
            result[1] = 1;
        }

        if (i>=3) {
            int ii = 2;
            while (ii < i) {
                result[ii] = result[ii-2] + result[ii-1];
                ii++;
            }
        }

        return result;
    }

    public static long getLastOne(int n) {
        Print.toConsole("%s.getLastOne(%d)", Fibonacci.class.getSimpleName(), n);

        if (n < 3) {
            return 1;
        }

        return getLastOne(n-2) + getLastOne(n-1);
    }
}
