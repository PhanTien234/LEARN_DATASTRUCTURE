package LinkedList;

import Queue.Queue;
class Node// Tao cac Node
{
    int data; // Phan chua du lieu
    Node next; // Phan chua dia chi cua node tiep theo
}
public class LinkedList {
  Node head = null; // Dau ds
  Node tail = null; // Cuoi ds
    void AddFirst(int x)// THem x vao dau ds
    {
        Node p = new Node();// Tao 1 node moi
        p.data = x; // dua x vao phan data cua p
        p.next = null;
        if(head == null){// DS rong
            head = tail = p;
        }else{ // DS Khoong rong
            p.next = head;
            head = p;
        }
    }
    void InDS(){
        Node p = head;
        while (p!=null){
            System.out.print(p.data + " "); // in phan du lieu
            p = p.next; // di chuyen qua node tiep theo;
        }
    }

    public static void main(String[] args){
       LinkedList L = new LinkedList();
       L.AddFirst(1); L.AddFirst(2); L.AddFirst(3);
       L.InDS();
    }
}
