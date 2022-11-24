package P3;

import java.util.Scanner;

class SV{
    public String ID, Name, Phone, Clas;
    public SV(String ID, String Name, String Phone, String Clas){
        this.ID = ID;
        this.Name = Name;
        this.Phone = Phone;
        this.Clas = Clas;
    }
}
class Node {
    SV data; // data la 1 sv
    Node next;
}
public class DSSV {
    Node head = null;
    Node tail = null;

    void addFirst(SV x) {
        Node p = new Node();            // tao ra 1 node moi
        p.data = x; // dua x vao phan data cua p
        p.next = null;
        if (head == null)               // ds rong
            head = tail = p;

        else                            // ds ko rong
        {
            p.next = head;
            head = p;
        }
    }

    void addLast(SV x)
    {
        Node p = new Node();            // tao ra 1 node moi
        p.data = x; //dua x vao phan data cua p
        p.next = null;
        if(head == null) // neu ds rog thi p la node dau cung la cuoi
            head = tail =p;
        else {
            tail.next = p;
            tail = p;
        }
    }
    void Nhap(){
        String id, name, phone, cls;
        int dung = 0;
        Scanner sc = new Scanner(System.in);
        while (dung == 0){
            System.out.print("Enter ID: ");
            id = sc.nextLine();
            System.out.print("Enter name: ");
            name = sc.nextLine();
            System.out.print("Enter the phone: ");
            phone = sc.nextLine();
            System.out.print("Enter the Class: ");
            cls = sc.nextLine();
            SV x = new SV(id, name, phone, cls); // Tao 1 SV x
            addLast(x); // Them SV x vao cuoi danh sach
            System.out.print("Stop? (1/0) ");
            dung = Integer.parseInt(sc.nextLine());
        }

    }
    void TimID(String id) // Tim kiem bang Id
    {
        Node p = head;
        System.out.println("ID\t\t\tName\t\t\tPhone\t\t\tClass");
        while(p!= null){
            if(id.compareToIgnoreCase(p.data.ID )== 0){
                System.out.printf("%2s\t%13s\t", p.data.ID, p.data.Name);
                System.out.printf("%8s\t%8s\t", p.data.Phone, p.data.Clas);
                System.out.println();
            }
            p=p.next;
        }
    }
    void TimTen(String name) // tim theo ten
    {}
    void TImLop(String clas){

    }
    void delFirst(){}
    void delLAst(){}

    void InDs(){
        Node p = head;
        System.out.println("ID\t\t\tName\t\t\tPhone\t\t\tClass");
        while(p!= null){
            System.out.printf("%2s\t%13s\t", p.data.ID, p.data.Name);
            System.out.printf("%8s\t%8s\t", p.data.Phone, p.data.Clas);
            System.out.println();
            p = p.next;
        }
    }
    public static void main(String[] args) {
        DSSV DS = new DSSV();
        DS.Nhap();
        DS.InDs();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID you want to search: ");
        String id = sc.nextLine();
        DS.TimID(id);
    }

}
