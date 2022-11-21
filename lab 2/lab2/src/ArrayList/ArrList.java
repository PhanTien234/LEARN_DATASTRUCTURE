package ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class ArrList {
    ArrayList<Integer> A = new ArrayList<>();
    ArrayList<String> ListStudent = new ArrayList<>();
    void Input(){
        Random rd = new Random();
        for(int i=1; i<=5; i++){
            int x = rd.nextInt(1,10);
            A.add(x);
        }
    }
    void Display(){
        for (Integer integer : A) {
            System.out.print(integer + " ");
        }
    }
    public static void main(String[] args){
        ArrList L = new ArrList();
//        L.Input();
//        L.Display();
//        System.out.print("\nsize of A: " + L.A.size());
//        System.out.print("\n isEmpty: " + L.A.isEmpty());
//        System.out.print("\nContain 5: "+ L.A.contains(5));
//        System.out.print("\nIndexOf 5: "+ L.A.indexOf(5));
//        L.A.add(9);
//        System.out.print("\n Add(9): \n");
//        L.Display();
//        L.A.add(2,8);
//        System.out.print("\n Add(2,8): \n");
//        L.Display();
//        L.A.remove(2);
//        System.out.print("\n Remove(2): \n");
//        L.Display();
//        L.A.set(2,10);
//        System.out.print("\n set(2,10): \n");
//        L.Display();
//        System.out.print("\n get(3): "+ L.A.get(3));
        L.ListStudent.add("Le Van An"); L.ListStudent.add("Tran Van Tuan");
        for(String x:L.ListStudent)
            System.out.printf("%s \n", x);
    }
}
