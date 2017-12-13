package io.github.johnnynanjiang.google_interview.datastructure;

import io.github.johnnynanjiang.google_interview.util.Print;

import java.util.Comparator;

/**
 * Created by nanjiang on 8/12/17.
 */

public class BinaryTree<T, U> {
    public class Node {
        public final T key;
        public U content;

        public Node leftChild;
        public Node rightChild;

        public Node(T key, U content) {
            this.key = key;
            this.content = content;

            this.leftChild = null;
            this.rightChild = null;
        }
    }

    public Comparator<T> comparator;
    private Node root;

    public BinaryTree(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Node find(T key) {
        Node currentNode = root;

        while (currentNode != null) {
            if (comparator.compare(key, currentNode.key) == 0) {
                return currentNode;
            } else if (comparator.compare(key, currentNode.key) < 0) {
                currentNode = currentNode.leftChild;
            } else {
                currentNode = currentNode.rightChild;
            }
        }

        return null;
    }

    public void insert(Node node) {
        if (root == null) {
            root = node;
            return;
        } else {
            Node currentNode = root;
            while (currentNode != null) {
                int res = comparator.compare(node.key, currentNode.key);
                if (res == 0) {
                     throw new RuntimeException(
                             String.format("Failed to insert node with duplicate key: %s", node.key)
                     );
                } else if (res < 0) {
                    if (currentNode.leftChild == null) {
                        currentNode.leftChild = node;
                        return;
                    } else {
                        currentNode = currentNode.leftChild;
                    }
                } else {
                    if (currentNode.rightChild == null) {
                        currentNode.rightChild = node;
                        return;
                    } else {
                        currentNode = currentNode.rightChild;
                    }
                }
            }
        }
    }

    public void delete(T key) {

    }

    @Override
    public String toString() {
        return printNodes(root);
    }

    private String printNodes(Node... nodes) {
        StringBuilder sb = new StringBuilder();

        for(Node node : nodes) {
            sb.append(Print.toString("(%s, %s)   ", node.key, node.content));
        }

        sb.append("\n");

        return sb.toString();
    }
}
