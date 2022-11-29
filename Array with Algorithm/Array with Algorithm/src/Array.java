import java.util.Scanner;

public class Array {

        int arr[] = new int [10];
        void NhapMang(int n){
            Scanner sc = new Scanner(System.in);
            for (int i=0; i<n; i++) {
                System.out.printf("A[%d] = ", i);
                arr[i] = sc.nextInt(); // Nhap aso nguyen bang tay
            }
        }
        void In(int n){
            for (int i=0; i<n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        void Chen(int x, int p, int n) // Chen x vao vi tri p
        {
            n++; // tang n len 1
            for(int i=n-1; i>p; i--) //Keo cac PT lui 1 o
            {
                arr[i] = arr[i-1]; // dua x vao vi tri p
            }
            arr[p] = x;
        }
        void Xoa(int p, int n) // xoa 1 PT tai vi tri p
        {
            for(int i=p; i<n; i++){
                arr[i] = arr[i+1]; // Keo cac PT toi 1 0
            }
            n--; // Giam so luong 1
        }
        void TimKiem(int x, int n){
            int timthay = -1; // khong thay x
            for(int i =0; i<n; i++)
                if(arr[i] == x){
                    timthay = i;
                }
            if(timthay == -1 )
                System.out.println("\n Khong tim thay x = " + x);
            else
                System.out.printf("\nTim thay x = %d tai vi tri %d", x, timthay);
        }

    void SapXepTangDanNoiBot(int n) // Sap Xep Noi bot Bubble Sort
    {
        for (int i =0; i<n; i++)
            for(int j = n-1; j>i; j--)
                if(arr[j] < arr[j-1]){
                    int t = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = t;
                }
    }

        public static void main(String[] args) {
            Array array = new Array();
            int n = 5;
            array.NhapMang(n);
            array.In(n);
            array.Chen(8, 2, n);
            System.out.println("\narray sau khi chen them 8: ");
            array.In(n+1);
            System.out.println("\narray sau khi xoa vi tri so 3: ");
            array.Xoa(3, n);
            array.In(n);
            array.TimKiem(2, n);
            array.SapXepTangDanNoiBot(n);
            System.out.println();
            System.out.println("Mang sau khi sap xep theo thu tu tang dan la: ");
            array.In(n);

        }


}
