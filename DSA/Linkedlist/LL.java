package Linkedlist;

//public class LL {
// private Node tail;
// private Node head;
// private int size;

// LL() {
//     this.size = 0;
// }

// // Inserting the value at starting
// public void insertAtBeginning(int val) {
//     Node newNode = new Node(val);
//     newNode.next = head;
//     head = newNode;
//     if (tail == null) {
//         tail = newNode;
//     }
//     size++;
// }

// // Inserting the value at the end
// public void insertAtEnd(int val) {
//     if (tail == null) {
//         insertAtBeginning(val);
//         return;
//     }

//     Node newNode = new Node(val);
//     tail.next = newNode;
//     tail = newNode;
//     size++;
// }

// // Inserting the value at the middle
// public void insertAtMiddle(int val, int index) {
//     if (index < 0 || index > size) {
//         throw new IndexOutOfBoundsException("Index out of bounds");
//     }
//     if (index == 0) {
//         insertAtBeginning(val);
//     } else if (index == size) {
//         insertAtEnd(val);
//     } else {
//         Node temp = head;
//         for (int i = 1; i < index; i++) {
//             temp = temp.next;
//         }
//         Node newNode = new Node(val, temp.next);
//         temp.next = newNode;
//         size++;
//     }
// }

// // Deleting the value at the first
// public int delF() {
//     int deletedItem = head.val;
//     head = head.next;
//     if (head == null) {
//         tail = null;
//     }
//     size--;
//     return deletedItem;

// }

// // Deleting from the last
// public int delL() {
//     if (size <= 1) {
//         return delF();
//     }
//     Node secondLast = get(size - 2);
//     int value = tail.val;
//     tail = secondLast;
//     tail.next = null;

//     return value;

// }

// // Delete from the mid
// public int delM(int index) {
//     if (index == 0) {
//         return delF();
//     }
//     if (index == size - 1) {
//         return delL();
//     }
//     Node prev = get(index - 1);
//     int value = prev.next.val;
//     prev.next = prev.next.next;

//     return value;

// }

// public Node get(int index) { // I will return the reference pointer to that node
//     Node node = head;
//     for (int i = 0; i < index; i++) {
//         node = node.next;
//     }
//     return node;

// }

// public void display() {
//     if (size == 0) {
//         System.out.println("List is empty.");
//         return;
//     }
//     Node temp = head;
//     while (temp != null) {
//         System.out.print(temp.val + " -> ");
//         temp = temp.next;
//     }
//     System.out.println("END");
// }

// private class Node {
//     int val;
//     Node next;

//     Node(int val) {
//         this.val = val;
//     }

//     Node(int val, Node next) {
//         this.val = val;
//         this.next = next;
//     }
// }

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    // Insert at the first Index
    public void first(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = node;
        }
        size++;
    }

    // Insert at the last
    public void last(int val) {
        Node node = new Node(val);
        if (tail == null) {
            first(val);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }


    

    // Insert at the mid
    public void mid(int val, int index) {
        Node temp = head;
        if (index < 0 || index > size) {
            System.out.println("Index out of bound... ");
            return;
        }
        if (index == 0) {
            first(val);
            return;
        }
        if (index == size) {
            last(val);
            return;
        }

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    // Delete from the first
    public int delFirst() {
        int del = head.value;
        head = head.next;

        if (head == null) {
            tail = null;

        }
        return del;

    }

    // Delete from the last

    public int dellast() {
        if (size <= 2) {
            return delFirst(); // Assuming delFirst() is defined elsewhere
        }
        
        Node secondLast = get(size - 2); // Assuming getNode(index) is defined to get the node at a specific index
        int value = tail.value;
        tail = secondLast;
        secondLast.next = null;
        size--;
        return value;
    }

    

    // Delete from the mid 
    public int delmid(int index){
        
        if(index == 0){
            return delFirst();
        }
        if(index ==size-1){
            return dellast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next= prev.next.next;
        return val;


    }

    // create a method which return the refreance index of the given value
    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Display the number
    public void display() {
        Node temp = head;
        if (head == null && tail == null) {
            System.out.println("The list is Empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }

    private class Node {
        int value;
        Node next;

        Node(int val) {
            this.value = val;
        }

        Node(int val, Node next) {
            this.value = val;
            this.next = next;
        }
    }
}
