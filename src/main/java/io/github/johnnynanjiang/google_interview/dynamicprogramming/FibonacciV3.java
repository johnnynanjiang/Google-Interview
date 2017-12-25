package io.github.johnnynanjiang.google_interview.dynamicprogramming;

import io.github.johnnynanjiang.google_interview.util.Print;

/**
 * Created by nanjiang on 16/12/17.
 */

//Bottom-up solution
public class FibonacciV3 {
    public static long getLastOne(int n) {
        Print.toConsole("%s.getLastOne(%d)", FibonacciV3.class.getSimpleName(), n);

        long[] results = new long[n];

        for (int i=0; i<n; i++) {
            if (i<2) {
                results[i] = 1;
                continue;
            }

            results[i] = results[i-1] + results[i-2];
        }

        return results[n-1];
    }
}
