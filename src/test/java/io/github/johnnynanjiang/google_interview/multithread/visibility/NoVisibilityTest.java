package io.github.johnnynanjiang.google_interview.multithread.visibility;

import org.junit.Test;

/**
 * Created by nanjiang on 1/12/17.
 */

public class NoVisibilityTest {
    @Test
    public void test() throws InterruptedException {
        new NoVisibility().go();
    }
}