package Linkedlist;

import java.util.LinkedList;

public class lecture {
    public static void main(String[] args) {
        LL list = new LL();
        list.first(3);
        list.first(4);
        list.first(5);
        list.first(6);
        list.first(7);
        list.first(8);
        list.first(9);
        list.display();
        System.out.println("Inserting a t mid ");
        list.mid(10, 3);
        list.display();
        System.out.println("Inserting at mid..");
        list.last(78);
        list.display();
        System.out.println("Delete from the first..");
        list.delFirst();
        list.display();
        System.out.println("Delete from mid..");
        list.delmid(2);
        list.display();
        System.out.println("Delete from the last");
        list.dellast();
        list.display();

        // list.insertAtBeginning(3);
        // list.insertAtBeginning(4);
        // list.insertAtBeginning(5);

        // list.insertAtBeginning(6);
        // list.insertAtBeginning(7);
        // list.insertAtEnd(99);
        // list.insertAtMiddle(342, 5);
        // list.display();
        // System.out.println(list.delF());
        // list.display();
        // System.out.println(list.delL());
        // list.display();
        // System.out.println(list.delM(2));
        // list.display();

        // DLL Dlist = new DLL();
        // Dlist.insertAtBeginning(3);
        // Dlist.insertAtBeginning(4);
        // Dlist.insertAtBeginning(5);

        // Dlist.insertAtBeginning(6);
        // Dlist.insertAtBeginning(7);
        // // list.insertAtEnd(99);
        // // list.insertAtMiddle(342, 5);
        // Dlist.display();
        // // System.out.println(list.delF());
        // // list.display();
        // // System.out.println(list.delL());
        // // list.display();
        // // System.out.println(lidelMst.(2));
        // // list.display();
    }

}
