package P3;

class SV{
    public String ID, Name, Address, Phone, Clas;
    public SV(){}
    public SV(String ID, String Name, String Address, String Phone, String Clas){
        this.ID = ID;
        this.Name = Name;
        this.Address = Address;
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
        p.data = x;
        p.next = null;
        if (head == null)               // ds rong
            head = tail = p;

        else                            // ds ko rong
        {
            p.next = head;
            head = p;
        }
    }

    void addLast() {

    }

    void InDs(){
        Node p = head;
        System.out.println("ID\t\t\tName\t\t\tPhone\t\t\tClass\t\t\tAddress");
        while(p!= null){
            System.out.printf("%8s\t%8s\t", p.data.ID, p.data.Name);
            System.out.printf("%8s\t%8s\t", p.data.Phone, p.data.Clas);
            System.out.println();
            p = p.next;
        }
    }
    public static void main(String[] args) {
        DSSV DS = new DSSV();
        SV s1 = new SV("GCD201883", "Paika", "NY", "123", "GCD1001");
        DS.addFirst(s1);
        SV s2 = new SV("GCD201883", "Phong", "NY", "123", "GCD1001");
        DS.addFirst(s2);
        DS.InDs();
    }

}
