package com.gl.dataStructureAssignment.bst;

public class BSTToSkewedConverter {

    Node root;
    Node prevNode = null;
    Node headNode = null;

    /**
     * Create the Skewed Tree
     *
     * @param root
     */
    void flattenBSTToSkewed(Node root) {
        if (root == null) {
            return;
        }

        flattenBSTToSkewed(root.left);

        if (headNode == null) {
            headNode = root;
        } else {
            prevNode.right = root;
        }
        root.left = null;
        prevNode = root;

        flattenBSTToSkewed(root.right);
    }

    /**
     * Traverse the Right Skewed Tree
     *
     * @param root
     */
    void traverseRightSkewed(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        traverseRightSkewed(root.right);
    }
}
