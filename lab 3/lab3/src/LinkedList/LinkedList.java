package LinkedList;

import Queue.Queue;

class Node{
    int data;
    Node next;
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
    void AddLast(int x) //them cuoi
    {
        Node p = new Node();
        p.data = x; // set data
        p.next = null;
        if(head == null){
            head = tail = p;
        }else{
            tail.next =p;
            tail = p;
        }
    }
    int getSize() // lay so luong phan tu
    {
        int dem = 0;
        Node p = head;
        while (p!= null){
            dem++;
            p = p.next;
        }
        return dem;
    }
    int Search(int x) // Tra ve vi tri tim thay X neu ko tra ve -1
    {
        int vt = -1;
        Node p = head;
        while(p!=null){
            vt++;
            if(p.data == x)
                return vt;
            p = p.next;
        }
        return -1;
    }
    void delFirst() //xoa dau
    {
        head = head.next;
    }
//    void delLast(){ // Xoa cuoi
//
//    }
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
       L.AddLast(8);
       System.out.println("DS sau khi add last: "); //321 8
        L.InDS();
        L.delFirst(); // 218
        System.out.println("DS sau khi delete first: ");
        L.InDS();
        // Count the number of elements
        System.out.println("_________________________");
        System.out.println(L.getSize());
        // Search
        int x = L.Search(2);
        System.out.printf("\nCo %d: %d",x);
    }
}
