package com.gl.dataStructureAssignment.bst;

public class Main {

    public static void main(String[] args) {

        BSTToSkewedConverter tree = new BSTToSkewedConverter();
        tree.insert(50);
        tree.insert(30);
        tree.insert(60);
        tree.insert(10);
        tree.insert(55);

        tree.flattenBSTToSkewed(tree.root);
        System.out.print("Rightly Skewed Tree is as following: ");
        tree.traverseRightSkewed(tree.headNode);
    }
}
