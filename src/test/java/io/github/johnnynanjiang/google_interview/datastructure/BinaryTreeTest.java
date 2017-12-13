package io.github.johnnynanjiang.google_interview.datastructure;

import io.github.johnnynanjiang.google_interview.util.Print;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Comparator;

import static org.junit.Assert.*;

/**
 * Created by nanjiang on 8/12/17.
 */

public class BinaryTreeTest {
    Comparator<String> comparator = (o1, o2) -> o1.compareTo(o2);
    BinaryTree<String, String> binaryTree;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void setUp() {
        binaryTree = new BinaryTree(comparator);
    }

    @Test
    public void testInsertAndFind() {
        assertTrue(binaryTree.isEmpty());

        binaryTree.insert(binaryTree.new Node("key1", "content1"));

        assertFalse(binaryTree.isEmpty());

        assertEquals("key1", binaryTree.find("key1").key);
        assertEquals("content1", binaryTree.find("key1").content);
    }

    @Test
    public void testInsertDuplicate() {
        binaryTree.insert(binaryTree.new Node("key1", "content1"));

        exception.expect(RuntimeException.class);
        exception.expectMessage("Failed to insert node with duplicate key: key1");

        binaryTree.insert(binaryTree.new Node("key1", "content1"));
    }

    @Test
    public void testPrint() {
        binaryTree.insert(binaryTree.new Node("5", "content of 5"));
        Print.toConsole(binaryTree.toString());

        binaryTree.insert(binaryTree.new Node("1", "content of 1"));
        binaryTree.insert(binaryTree.new Node("6", "content of 6"));
    }
}