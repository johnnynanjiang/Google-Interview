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

    BinaryTree setUpAInDepthBinaryTree() {
        binaryTree = new BinaryTree(comparator);

        binaryTree.insert(binaryTree.new Node("5", "content of 5"));
        binaryTree.insert(binaryTree.new Node("3", "content of 3"));
        binaryTree.insert(binaryTree.new Node("7", "content of 7"));
        binaryTree.insert(binaryTree.new Node("4", "content of 4"));
        binaryTree.insert(binaryTree.new Node("6", "content of 6"));
        binaryTree.insert(binaryTree.new Node("8", "content of 8"));
        binaryTree.insert(binaryTree.new Node("9", "content of 9"));

        return binaryTree;
    }

    @Test
    public void testPrint() {
        binaryTree = setUpAInDepthBinaryTree();
        Print.toConsole(binaryTree.toString());
    }

    @Test
    public void testFind() {
        binaryTree = setUpAInDepthBinaryTree();

        BinaryTree.Node node = binaryTree.find("5");

        assertEquals("5", node.key);
        assertEquals("content of 5", node.content);

        node = binaryTree.find("NonExistKeny");

        assertNull(node);
    }

    @Test
    public void testHeightOfNode() {
        binaryTree = setUpAInDepthBinaryTree();

        BinaryTree.Node node = binaryTree.find("5");

        assertEquals(3, binaryTree.getHeightOf(node));

        node = binaryTree.find("7");

        assertEquals(2, binaryTree.getHeightOf(node));

        node = binaryTree.find("8");

        assertEquals(1, binaryTree.getHeightOf(node));

        node = binaryTree.find("9");

        assertEquals(0, binaryTree.getHeightOf(node));
    }
}