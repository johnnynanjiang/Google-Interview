package io.github.johnnynanjiang.google_interview.dynamicprogramming;

import io.github.johnnynanjiang.google_interview.util.Print;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nanjiang on 16/12/17.
 */

//Top-down solution
public class FibonacciV2 {
    private static Map<Integer, Long> cachedResults = new HashMap<>();

    public static long getLastOne(int n) {
        Print.toConsole("%s.getLastOne(%d)", FibonacciV2.class.getSimpleName(), n);

        Long result = cachedResults.get(n);

        if ( result != null) {
            return result;
        }

        if (n < 3) {
            cachedResults.put(n, 1l);
            return 1l;
        }

        result = getLastOne(n-2) + getLastOne(n-1);
        cachedResults.put(n, result);

        return cachedResults.get(n-2) + cachedResults.get(n-1);
    }
}
