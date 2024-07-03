package LinkedList;


class Single_CircularLinkedList {
    public static void main(String[] args) {
        // Singly Circular Linked List

        SinglyCircularList singlyCircularList = new SinglyCircularList();
        singlyCircularList.insert(10);
        singlyCircularList.insert(20);
        singlyCircularList.insert(30);
        singlyCircularList.insert(40);
        singlyCircularList.insert(50);
        singlyCircularList.print();
        singlyCircularList.isCheck();
        System.out.println();
        singlyCircularList.swapNode();
        singlyCircularList.print();


    }
}
class SinglyCircularList{
    Node1 head;

    public void insert(int data){
        // Insert Function
        Node1 newNode = new Node1(data);
       if(head == null){
           head = newNode;
           head.next = head;
       }else {
           Node1 temp = head;
           while (temp.next != head){
               temp = temp.next;
           }
           temp.next = newNode;
           newNode.next = head;
       }
    }

    public void delete(int data){
        // Delete Function
        if(head == null){
            System.out.println("LinkedList is Empty");
            return;
        }
        if(head.data == data && head.next == head){
            head = null;
        } else if (head.data == data) {
            Node1 temp = head;
            while (temp.next != head){
                temp = temp.next;
            }
            head = head.next;
            temp.next = head;
        }else{
            Node1 temp = head;
            while (temp.next != head && temp.next.data != data){
                temp = temp.next;
            }
            if (temp.next == head) {
                System.out.println("value is not present");
                return;
            } else {
                temp.next = temp.next.next;
            }
        }
    }

    public void isCheck() {
        if (head == null) {
            System.out.println("No");
            return;
        }
        Node1 temp = head;
        while (temp.next != null && temp.next != head){
            temp = temp.next;
        }

        if(temp.next == head){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }

    public void swapNode(){
        // Exchange first and last nodes in Circular Linked List

        Node1 current = head;
        while (current.next.next != head){
            current = current.next;
        }

        current.next.next = head.next;
        Node1 temp = current.next;
        current.next = head;
        head = temp;
        current.next.next = head;
    }

    public void print(){
        // Print Function
        if(head == null){
            System.out.println("LinkedList is Empty");
            return;
        }
        Node1 temp = head;
        while (temp.next != head){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data + " ");
    }
}
class Node1{
    Node1 next;
    int data;
    public Node1(int data) {
        this.data = data;
    }
}

