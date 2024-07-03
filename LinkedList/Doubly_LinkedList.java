package LinkedList;

public class Doubly_LinkedList {
    public static void main(String[] args) {
        // Doubly Linked List

        DoublyLL doublyLL = new DoublyLL();
        doublyLL.InsertValueSorted(30);
        doublyLL.InsertValueSorted(10);
        doublyLL.InsertValueSorted(40);
        doublyLL.InsertValueSorted(50);
        doublyLL.InsertValueSorted(20);
        doublyLL.print();
        System.out.println();
        doublyLL.Deleted(doublyLL.head.next.next);
//        System.out.println();
//        doublyLL.RemoveNode();
        doublyLL.print();

    }
}
class DoublyLL{
    Node2 head,tail;

    public void insert(int data){
        // Insert Function

        Node2 newNode = new Node2(data);
        if(head == null){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void delete(int data){
        // Delete Function

        if(head == null){
            System.out.println("LinkedList is Empty");
        }
        if(head.data == data && head == tail){
            head = tail = null;
        } else if (head.data == data) {
            head = head.next;
            head.prev = null;
        }else {
            Node2 temp = head;
            while (temp != null && temp.next.data != data){
                temp = temp.next;
            }
            if(temp.next == tail){
                tail.prev = null;
                temp.next = null;
                tail = temp;
            }else{
                Node2 deleted = temp.next;
                deleted.next.prev = temp;
                temp.next = deleted.next;
                deleted.prev = null; // free the prev of deleted node
                deleted.next = null; // free the next of deleted node
            }
        }
    }

    public void FindPair(int sum){
        // Find pairs with given sum in sorted doubly linked list

        Node2 left = head,right = tail;
        while (left != right){
            if(left.data + right.data == sum){
                System.out.println("Sum is Present");
                return;
            } else if ((left.data + right.data) < sum) {
                left = left.next;
            }else {
                right = right.prev;
            }
        }
        System.out.println("Sum is Not Present");
    }

    public void reverse(){
        // Reverse a Doubly Linked List
        Node2 current = head;
        Node2 temp = null;

        if(head == null && head.next == null){
            System.out.println("LinkedList is Empty");
            return;
        }
        while (current != null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if(temp != null){
            head = temp.prev;
        }
    }

    public void InsertValueSorted(int data) {
        // Insert value in sorted doubly linked list
        Node2 nn = new Node2(data);
        if (head == null){
            head = nn;
            tail = nn;
        } else if(head.data >= data){
            head.prev = nn;
            nn.next = head;
            head = nn;
        } else if(tail.data <= data){
            tail.next = nn;
            nn.prev = tail;
            tail = nn;
        } else {
            Node2 temp = head;
            while (temp.next.data < data){
                temp = temp.next;
            }
            Node2 lastTemp = tail;
            while (lastTemp.prev.data >= data){
                lastTemp = lastTemp.prev;
            }

            temp.next = nn;
            nn.prev = temp;
            nn.next = lastTemp;
            lastTemp.prev = nn;
        }

    }

    public void RemoveNode(){
        // Remove duplicates from a sorted doubly linked list
        Node2 current = head;
        while (current != null) {
            if (current.next != null && current.data == current.next.data) {
                current.next = current.next.next;
                if (current.next != null) {
                    current.next.prev = current;
                }
            } else {
                current = current.next;
            }
        }
    }

    public void Deleted(Node2 node){
        // Given only a pointer to a node to be deleted in a doubly linked list, delete it
        if (node.prev == null){
            head = head.next;
            node.next = null;
            return;
        }
        Node2 temp = node.prev;
        if (node.next == null){
            node.prev = null;
            temp.next = null;
            tail = temp;
            return;
        }

        temp.next = node.next;
        node.next.prev = temp;

    }

    public void RemoveDuplicate(){
        // Remove duplicates from doubly linked list (Unsorted)
        Node2 temp = head;
        while (temp != null){
            Node2 current = temp;
            while (current.next != null){
                if(current.next.data == temp.data && current.next.next != null){
                    current.next = current.next.next;
                    current.next.prev = current;
                } else if (current.next.data == temp.data) {
                    current.next = null;
                    tail = current;
                }else {
                    current = current.next;
                }
            }
            temp = temp.next;
        }
    }

    public void print() {
        // Print Function

        Node2 temp = head;
        while (temp != null){
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
    }

    public void printReverse() {
        // Print Reverse

        Node2 temp = tail;
        while (temp != null){
            System.out.print(temp.data + "  ");
            temp = temp.prev;
        }
    }
}
class Node2{
    int data;
    Node2 next,prev;

    public Node2(int data) {
        this.data = data;
    }
}
