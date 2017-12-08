package io.github.johnnynanjiang.google_interview.datastructure;

import org.junit.Test;
import org.springframework.util.comparator.ComparableComparator;

import java.util.Comparator;

import static org.junit.Assert.*;

/**
 * Created by nanjiang on 8/12/17.
 */

public class BinaryTreeTest {
    @Test
    public void testInsertAndFind() {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        BinaryTree<String, String> binaryTree = new BinaryTree(comparator);

        assertTrue(binaryTree.isEmpty());

        binaryTree.insert(new BinaryTree(comparator).new Node("key1", "content1"));

        assertFalse(binaryTree.isEmpty());

        assertEquals("key1", binaryTree.find("key1").key);
        assertEquals("content1", binaryTree.find("key1").content);
    }
}