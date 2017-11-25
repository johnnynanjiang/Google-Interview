package io.github.johnnynanjiang.google_interview.util;

/**
 * Created by nanjiang on 26/11/17.
 */

public class Comparator {
    public final static java.util.Comparator<Integer> SORT_ASCEND = (a, b) -> (a < b) ? -1 : 1;
    public final static java.util.Comparator<Integer> SORT_DESCEND = (a, b) -> (a > b) ? -1 : 1;
}
