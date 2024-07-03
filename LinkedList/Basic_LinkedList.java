package LinkedList;

import java.util.Stack;

public class Basic_LinkedList {
    public static void main(String[] args) {
        // Singly Linked List

        LinkedList linkedList = new LinkedList();
        linkedList.insert(10);
        linkedList.insert(30);
        linkedList.insert(20);
        linkedList.insert(20);
        linkedList.insert(40);
        linkedList.print();
        linkedList.Remove();
        System.out.println();
        linkedList.print();

    }
}
class LinkedList{
    Node head,tail;
    int count = 0;


    public void DeletedMiddleNode(){
        if(head == null || head.next == null){
            System.out.println("Empty!!");
        }

        Node slow = head;
        Node fast = head.next.next;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
    }
    public void RemoveDelete(int data){
        if(head == null){
            System.out.println("Empty");
        }
        while(head != null && head.data == data){
            head = head.next;
            if(head == null){
                System.out.println("Empty");
            }
        }
        Node temp = head;
        while(temp.next != null){
            if(temp.next.data == data){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
    }
    public void insert(int data){
        // Insert Function
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void delete(int data){
        // Delete Function
        if(head == null){
            System.out.println("LinkedList is Empty");
            return;
        }
        if(head.data == data && head == tail){
            head=tail=null;
        } else if (head.data == data) {
            head = head.next;
        } else {
            Node prev = head;
            while (prev.next != null && prev.next.data != data){
                prev = prev.next;
            }
            if(prev.next == null){
                System.out.println("Value Not Present");
                return;
            }
            if(prev.next == tail){
                prev.next = null;
                tail = prev;
            }else {
                prev.next = prev.next.next;
            }
        }
    }

    public boolean update(int oldData,int newData){
        // Update Function
        if(head == null){
            System.out.println("Linked list empty");
            return false;
        }
        Node temp = head;
        while (temp != null){

            if(temp.data == oldData){
                temp.data = newData;
                System.out.println("Updated");
                return true;
            }
            temp = temp.next;
        }
        System.out.println("Not Update");
        return false;
    }

    public boolean find(int data){
        // Find Function
        if(head == null){
            System.out.println("Linked list empty");
            return false;
        }
        Node temp = head;
        while (temp != null){

            if(temp.data == data){
                System.out.println("Value is Present");
                return true;
            }
            temp = temp.next;
        }
        System.out.println("Value is Not Present");
        return false;
    }

    public int count(){
        // Count nodes / length of linked list
        int count = 0;
        Node temp = head;
        while (temp != null){
            count++;
            temp = temp.next;

        }
        return count;
    }

    public void Reverse(){
        // Print linked list in reverse
        Stack<Integer> stack = new Stack<>();
        Node current = head;
        while (current != null){
            stack.push(current.data);
            current = current.next;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }

    public void getNNode(int element){
        // Get nth node in linked list
        Node temp = head;
        for(int i=1;i<element;i++){
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public void getNNodeLast(int index){
        // Get nth node from end in linked linked list
        int count = (count() - index) + 1;
        Node temp = head;
        for(int i=1;i<count;i++){
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public void deleted(Node p){
        // Given only a pointer to a node to be deleted in a singly linked list, how do you delete it? (head not given)
        p.data = p.next.data;
        p.next = p.next.next;
    }

    public void MiddleNodePrint(){
        // Print middle node of the linked list (Single scan / loop)
        Node fast = head,slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println(slow.data);
    }

    public void DetectLoop(){
        // Detect loop in linked list
        Node fast = head,slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }

    public void countLoopElement(){
        // Find length of loop in linked list
        Node fast = head,slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast){
                Node temp = slow.next;
                int count = 1;
                while (temp != slow){
                    count++;
                    temp = temp.next;
                }
                System.out.println(count);
                return;
            }
        }

    }

    public void DuplicateRemove(){
        // Remove duplicates from a sorted linked list
        Node temp = head;
        while (temp.next != null){
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
    }

    public Node reverse() {
        // Reverse a linked list (change all the pointer and head)
        Node previous = null;
        Node next = null;
        Node current = head;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
        return head;
    }

    public void Remove(){
        // Remove duplicates from singly linked list (Unsorted)
        Node current = head,temp = null;

        while (current != null && current.next != null){
            temp = current;
            while (temp != null && temp.next != null){
                if(current.data == temp.next.data){
                    temp.next = temp.next.next;
                }
                else {
                    temp = temp.next;
                }
            }
            current = current.next;
        }
    }

    public void print(){
        // Print Function
        if(head == null){
            System.out.println("Empty!!");
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
    }
}
