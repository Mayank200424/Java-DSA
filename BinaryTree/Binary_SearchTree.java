package BinaryTree;

import java.util.ArrayList;
import java.util.Stack;

public class Binary_SearchTree {
    Node root;

    public static void main(String[] args) {
        Binary_SearchTree binarySearchTree = new Binary_SearchTree();
        binarySearchTree.Insert(10);
        binarySearchTree.Insert(5);
        binarySearchTree.Insert(15);
        binarySearchTree.Insert(3);
        binarySearchTree.Insert(7);
        binarySearchTree.Insert(18);

        binarySearchTree.InOrder(binarySearchTree.root);
        System.out.println();
        System.out.println(binarySearchTree.Search(binarySearchTree.root, 25));

        binarySearchTree.delete(binarySearchTree.root, 25);

        binarySearchTree.InOrder(binarySearchTree.root);
        System.out.println();
        System.out.println( binarySearchTree.rangeSumBST(binarySearchTree.root,7,15));

    }

    int sum = 0;
    public  int rangeSumBST(Node node, int low, int high) {
        if(node == null )
            return 0;

        if( node.data < low )
            return this.rangeSumBST(node.right, low, high);

        if( node.data > high )
            return this.rangeSumBST(node.left, low, high);

        return node.data + this.rangeSumBST(node.left, low, high) + this.rangeSumBST(node.right, low, high);
    }
    public void Insert(int data) {
        root = insert(root, data);
    }

    public Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        } else {
            root.left = insert(root.left, data);
        }
        return root;
    }

    public void InOrder(Node root) {
        if (root == null) {
            return;
        }
        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);
    }

    public boolean Search(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        }
        if (root.data > data) {
            return Search(root.left, data);
        }
        return Search(root.right, data);
    }

    private int MinValue(Node node) {
        int min = node.data;
        while (node.left != null) {
            min = node.left.data;
            node = node.left;

        }
        return min;
    }

    public void delete(int data) {
        root = delete(root, data);
    }

    private Node delete(Node root, int data) {
        if (root == null) {
            return root;
        }
        if (data > root.data) {
            root.right = delete(root.right, data);
        } else if (data < root.data) {
            root.left = delete(root.left, data);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            }
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.data = MinValue(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }

}


