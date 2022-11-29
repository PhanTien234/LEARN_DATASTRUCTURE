import java.util.Random;
import java.util.Scanner;

public class Array {

        int arr[] = new int [50000];
        void NhapMang(int n){
            Scanner sc = new Scanner(System.in);
            for (int i=0; i<n; i++) {
                System.out.printf("A[%d] = ", i);
                arr[i] = sc.nextInt(); // Nhap aso nguyen bang tay
            }
        }
    void NhapNgauNhien(int n){
        Random rd = new Random();
        for (int i=0; i<n; i++)
            arr[i] = rd.nextInt(1, 9);
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

    void SelectionSort(int n)
    {
        for(int i =0; i<n; i++){
            int min = i;
            for(int j = i; j<n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int t = arr[i];
            arr[i] = arr[min];
            arr[min] = t;
        }
    }
    void InsertionSort(int n) {
        for (int i = 1; i < n; i++) {
            int j = i;
            int x = arr[i];
            while (j > 0 && arr[j - 1] > x) {
                arr[j] = arr[j - 1]; // Keo lui
                j--;
            }
            arr[j] = x; // Dua x vao dung vi tri
        }
    }
    void QuickSort(int left, int right){
            if(left <right){
                int pivot = arr[(left + right)/2];
                int up = left; // chay tu trai qua
                int down = right; // chay tu phai qua
                do{
                    while (arr[up] < pivot) up++;
                    while (arr[down] > pivot) down--;
                    if(up <= down){
                        int t = arr[up]; arr[up] = arr[down]; arr[down] = t;
                        up++;
                        down--;
                    }
                }while (up<= down);
                QuickSort(left, down); // goi de quy de sap xep nua trai
                QuickSort(up, right); // Goi de quy de sap xep nua phai

            }
    }

        public static void main(String[] args) {
            Array array = new Array();
            int n = 5;
//            array.NhapMang(n);


//            array.In(n);
////            array.Chen(8, 2, n);
////            System.out.println("\narray sau khi chen them 8: ");
////            array.In(n+1);
////            System.out.println("\narray sau khi xoa vi tri so 3: ");
////            array.Xoa(3, n);
////            array.In(n);
////            array.TimKiem(2, n);
//            double batdau, kethuc, tgchay;
////            batdau = System.currentTimeMillis(); // Thoi gian bat dau chay
//            array.SapXepTangDanNoiBot(n);
////            kethuc = System.currentTimeMillis(); // Thoi gian ket thuc chay
////            tgchay = kethuc - batdau;
////            System.out.println("\nSau khi Sap xep Noi bot: " + tgchay);
//            double bonho = (double) (Runtime.getRuntime().totalMemory()- Runtime.getRuntime().freeMemory()) /1024;
//            System.out.println("\nDung luong bo nho (KB): " + bonho);
////            System.out.println("\nSau khi Sap xep Noi bot: " );
//            array.In(n);
//            System.out.println();
//            array.NhapNgauNhien(n);
////            array.In(n);
////            batdau = System.currentTimeMillis(); // Thoi gian bat dau chay
//            array.SelectionSort(n);
////            kethuc = System.currentTimeMillis(); // Thoi gian ket thuc chay
////            tgchay = kethuc - batdau;
////            System.out.println("\nSau khi Sap xep Selection: " + tgchay);
//            System.out.println("\nSau khi Sap xep Selection: " );
////            array.In(n);
//            array.NhapNgauNhien(n);
//            array.In(n);
////            batdau = System.currentTimeMillis(); // Thoi gian bat dau chay
//            array.QuickSort(0, n - 1);
////            kethuc = System.currentTimeMillis(); // Thoi gian ket thuc chay
////            tgchay = kethuc - batdau;
////            System.out.println("\nSau khi Sap xep Quick Sort: " + tgchay);
//            System.out.println("\nSau khi Sap xep Quick Sort: " );
//            array.In(n);

            array.NhapNgauNhien(n);
            array.In(n);
//            batdau = System.currentTimeMillis(); // Thoi gian bat dau chay
            array.InsertionSort(n);
//            kethuc = System.currentTimeMillis(); // Thoi gian ket thuc chay
//            tgchay = kethuc - batdau;
//            System.out.println("\nSau khi Sap xep Quick Sort: " + tgchay);
            System.out.println("\nSau khi Sap xep Insertion: " );
            array.In(n);



        }


}
