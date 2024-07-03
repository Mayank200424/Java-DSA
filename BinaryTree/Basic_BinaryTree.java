package BinaryTree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


import static javax.swing.Spring.height;

public class Basic_BinaryTree{
    static int count = 0;

    public static void main(String[] args) {
        /*
                    10
                 20    30
              40   50 60   70
        * */
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(10);
        binaryTree.root.left = new Node(20);
        binaryTree.root.right = new Node(30);
        binaryTree.root.left.left = new Node(40);
        binaryTree.root.left.right = new Node(50);
        binaryTree.root.right.left = new Node(60);
        binaryTree.root.right.right = new Node(70);
        System.out.println("level order: "); // breadth first
        binaryTree.levelOrder();
        System.out.println();
        System.out.println("pre order: "); // depth first
        binaryTree.preOrder(binaryTree.root);
        System.out.println();
        System.out.println("In order: "); // depth first
        binaryTree.inOrder(binaryTree.root);
        System.out.println();
        System.out.println("post order: "); // depth first
        binaryTree.postOrder(binaryTree.root);
        System.out.println();
        System.out.print("Count Node : " + countNode(binaryTree.root));
        System.out.println();
        printnNode(binaryTree.root, 3);
        System.out.println();
        System.out.println(findElement(binaryTree.root, 700));
        System.out.println(heightOfMax(binaryTree.root));
        System.out.println("Spiral Order traversal : ");
        binaryTree.Spiral(binaryTree.root);
        System.out.println();
        System.out.println("Pre Order traversal without recursion : ");
        binaryTree.PreOrderWithoutRecursion(binaryTree.root);
        System.out.println();
        System.out.println("Post Order traversal without recursion : ");
        binaryTree.PostOrderWithoutRecursion(binaryTree.root);
        System.out.println();
        System.out.println("In Order traversal without recursion : ");
        binaryTree.InOrderWithoutRecursion(binaryTree.root);
        System.out.println();
        binaryTree.sumOfLeftLeaves(binaryTree.root);

    }

    private static int heightOfMax(Node root) {
        // Find the Maximum Depth / Height of given Binary Tree
        if (root == null) {
            return 0;
        }
        int leftHeight = heightOfMax(root.left);
        int rightHeight = heightOfMax(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    private static boolean findElement(Node root, int value) {
        // Find an element from Binary tree
        if (root == null) {
            return false;
        }
        if (root.data == value) {
            return true;
        }
        return findElement(root.left, value) || findElement(root.right, value);
    }

    private static void printnNode(Node root, int i) {
        // Find n-th node of inorder traversal
        if (root == null) {
            return;
        }
        printnNode(root.left, i);
        count++;
        if (count == i) {
            System.out.print(root.data + " ");
        }
        printnNode(root.right, i);
    }

    private static int countNode(Node root) {
        // Count nodes in binary tree
        if (root == null) {
            return 0;
        }
        return 1 + countNode(root.left) + countNode(root.right);
    }
}

class BinaryTree {
    Node root;

    public void levelOrder() {
        // Level Order Traversals

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node n = queue.poll();
            System.out.print(n.data + " ");

            if (n.left != null) {
                queue.add(n.left);
            }
            if (n.right != null) {
                queue.add(n.right);
            }
        }
    }

    public void preOrder(Node root) {
        // Pre Order Traversals
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root) {
        // In Order Traversals
        if (root == null) {
            return;
        }
        preOrder(root.left);
        System.out.print(root.data + " ");
        preOrder(root.right);
    }

    public void postOrder(Node root) {
        // Post Order Traversals
        if (root == null) {
            return;
        }
        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.data + " ");
    }

    public void Spiral(Node root) {
        // Spiral level order traversal
        Deque<Node> deque = new LinkedList<>();
        deque.add(root);
        boolean flag = true;

        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                if (flag == true) {
                    Node temp = deque.pollFirst();
                    System.out.print(temp.data + " ");
                    if (temp.left != null) {
                        deque.addLast(temp.left);
                    }
                    if (temp.right != null) {
                        deque.addLast(temp.right);
                    }
                } else {
                    Node temp = deque.pollLast();
                    System.out.print(temp.data + " ");
                    if (temp.right != null) {
                        deque.addFirst(temp.right);
                    }
                    if (temp.left != null) {
                        deque.addFirst(temp.left);
                    }
                }
            }
            flag = !flag;
        }
    }

    public void PreOrderWithoutRecursion(Node root) {
        // pre-order Tree Traversal without Recursion
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node temp = stack.pop();
            System.out.print(temp.data + " ");

            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }

    public void PostOrderWithoutRecursion(Node root) {
        // post-order Tree Traversal without Recursion
        Stack<Node> stack = new Stack<>();
        Stack<Node> temp = new Stack<>();

        stack.push(root);

        while (!stack.isEmpty()) {
            Node n = stack.pop();
            temp.push(n);

            if (n.left != null) {
                stack.push(n.left);
            }

            if (n.right != null) {
                stack.push(n.right);
            }
        }
        while (!temp.isEmpty()) {
            System.out.print(temp.pop().data + " ");
        }
    }

    public void InOrderWithoutRecursion(Node root) {
        // in-order Tree Traversal without Recursion
        Stack<Node> stack = new Stack<>();
        Node temp = root;

        while (temp != null || stack.size() > 0) {
            while (temp != null) {
                stack.push(temp);
                temp = temp.left;
            }
            temp = stack.pop();
            System.out.print(temp.data + " ");
            temp = temp.right;
        }
    }

    public int sumOfLeftLeaves(Node root) {
        if(root == null){
            return 0;
        }
        int sum = 0;
        if(root.left != null && root.left.left == null && root.left.right == null){
            sum = sum + root.left.data;
        }
        sum = sum + sumOfLeftLeaves(root.left);
        sum = sum + sumOfLeftLeaves(root.right);

        return sum;

    }
}

