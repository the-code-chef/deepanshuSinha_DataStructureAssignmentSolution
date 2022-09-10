package com.gl.dataStructureAssignment.bst;

public class Main {

    public static void main(String[] args) {

        BSTToSkewedConverter tree = new BSTToSkewedConverter();
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(60);
        root.left.left = new Node(10);
        root.right.left = new Node(55);

        tree.flattenBSTToSkewed(root);
        System.out.print("Rightly Skewed Tree is as following: ");
        tree.traverseRightSkewed(tree.headNode);
    }
}
