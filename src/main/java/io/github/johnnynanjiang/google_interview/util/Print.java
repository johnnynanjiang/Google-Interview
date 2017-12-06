package io.github.johnnynanjiang.google_interview.util;

/**
 * Created by nanjiang on 1/12/17.
 */
public class Print {
    public static void toConsole(String format, Object... objects) {
        synchronized (Print.class) {
            System.out.println(String.format(format, objects));
        }
    }
}
