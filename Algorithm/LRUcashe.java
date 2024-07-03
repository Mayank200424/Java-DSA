package Algorithm;

import java.util.HashMap;

public class LRUcashe {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insert(10);
        doublyLinkedList.insert(20);
        doublyLinkedList.insert(30);
        doublyLinkedList.insert(40);
        doublyLinkedList.insert(50);
        doublyLinkedList.insert(20);
        doublyLinkedList.print();

    }
}
class DoublyLinkedList{
    Node head,tail;
    int t1 = 0,t2 = 5;

    HashMap<Integer,Node> hashMap = new HashMap<>();
    public void insert(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = tail = newNode;
            t1++;
            hashMap.put(value,head);
        } else if (!hashMap.containsKey(value) && t1 == t2) {
            hashMap.remove(value,head);
            head = head.next;
            head.prev = null;
            tail.next = newNode;
            newNode.prev =  tail;
            tail = newNode;
            hashMap.put(value,tail);
        }  else if (hashMap.containsKey(value)) {
            Node get = hashMap.get(value);
            if (get == tail) {
                return;
            }
            if (get == head) {
                head = head.next;
                head.prev = null;
            } else {
                hashMap.remove(value, get);
                get.prev.next = get.next;
                get.next.prev = get.prev;
            }
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            hashMap.put(value, tail);
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            hashMap.put(value, tail);
            t1++;
        }
    }
    public void print(){
        if(head == null){
            System.out.println("LinkedList is Empty!!");
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }
    public void search(int value){
        Node node = new Node(value);
        if (!hashMap.containsKey(value)) {
            System.out.println("Not Present");
        }
        Node get = hashMap.get(value);
        if (get == tail) {
            return;
        }
        if (get == head) {
            head = head.next;
            head.prev = null;

        } else {
            hashMap.remove(value, get);
            get.prev.next = get.next;
            get.next.prev = get.prev;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
        hashMap.put(value, tail);
    }

}
class Node{
    Node next,prev;
    int value;

    public Node(int value) {
        this.value = value;
    }
}
