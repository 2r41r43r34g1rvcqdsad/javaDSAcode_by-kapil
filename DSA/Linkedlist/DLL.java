package Linkedlist;

public class DLL {
    private Node head;

    public void insertAtBeginning(int value){
        Node node = new Node(value);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
        

    }
    public void display(){
        Node node =head;
        while(node!=null){
            System.out.print(node.val+"  -> " );
            node= node.next;
        }
        System.out.println("END");
    }

   
   
   
   
   
   
   
    private class Node{
        int val;
        Node next;
        Node prev;
        private Node(int val){
            this.val= val;
        }
        private Node(int val, Node next, Node prev){
            this.val= val;
            this.next=next;
            this.prev=prev;
        }

    }

    
}
