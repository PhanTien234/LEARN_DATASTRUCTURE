package Array;

import java.util.Random;
import java.util.Scanner;

public class Array {
    int A[] = new int[]{1,2,3,4,5,6,7,8,9,10}; // khai ba0 A co 10 phan tu
    void In(int n){
        for (int i=0; i<n; i++) {
            System.out.print(A[i] + " ");
        }
    }
    void Nhap(int n){
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<n; i++) {
            System.out.printf("A[%d] = ", i);
            A[i] = sc.nextInt(); // Nhap aso nguyen bang tay
        }
    }
    void NhapNgauNhien(int n){
        Random rd = new Random();
        for (int i=0; i<n; i++)
            A[i] = rd.nextInt(1, 9);
    }
    // Tinh tong cac PT
    int Tong(int n){
        int s =0;
        for(int i=0; i<n; i++){
            s = s+ A[i];
        }
        return s;
    }
    void Chen(int x, int y, int n) // Chen x vao vi tri y
    {
        n++; // tang n len 1
        for(int i=n-1; i>y; i--) //Keo cac PT lui 1 o
        {
            A[i] = A[i-1]; // dua x vao vi tri y
        }
        A[y] = x;
    }
    void Xoa(int y, int n) // xoa 1 PT tai vi tri y
    {
        for(int i=y; i<n; i++){
            A[i] = A[i+1]; // Keo cac PT toi 1 0
        }
        n--; // Giam so luong 1
    }
    // Tinh tong cac So Le
    int TongCacSoLe(int n){
        int s =0;
        for(int i=0; i<n; i++){
            if(A[i] % 2==1){
               s = s + A[i];
           }
        }
        return s;

    }
    // Tinh TBC cac so chan
    double TinhTBC(int n){
        int s =0, d =0;
        for(int i=0; i<n; i++)
            if(A[i] % 2==0) {
                s = s + A[i]; // TInh tong cac so chan
                d = d + 1; // Dem so lwuomng so chawn
            }
        if (d ==0)
            return 0;
        else
            return (float)s/d;
    }
    void SapXepTangDan(int n)
    {
        for (int i =0; i<n; i++)
            for(int j = n-1; j>i; j--)
                if(A[j] < A[j-1]){
                    int t = A[j];
                    A[j] = A[j-1];
                    A[j-1] = t;
                }
    }
    void TimKiem(int x, int n){
        int timthay = -1; // khong thay x
        for(int i =0; i<n; i++)
            if(A[i] == x){
                timthay = i;
            }
        if(timthay == -1 )
            System.out.println("\n Khong tim thay x = " + x);
        else
            System.out.printf("\nTim thay x = %d tai vi tri %d", x, timthay);
    }
    public static void main(String[] args) {
        Array arr = new Array();
        int n =5;
        arr.NhapNgauNhien(n);
        arr.In(n);
        arr.Chen(8,1,n); // chen 8 vao vi tri so 1
        System.out.println("\nA sau khi them 8: ");
        arr.In(n+1);

        System.out.println("\nA sao khi xoa vi tri so 2: ");
        arr.Xoa(2, n);
        arr.In(n);
        arr.SapXepTangDan(n);
        System.out.println();
        System.out.println("Mang sau khi saap xep theo thu tu tang dan: ");
        arr.In(n);
        arr.TimKiem(3, n);
        System.out.print("\nTong cac phan tu: " + arr.Tong(n));
        System.out.print("\n Tong cac phan tu le: " + arr.TongCacSoLe(n));
        System.out.printf("\nTrung Binh Cong So Chan: %.2f", arr.TinhTBC(n));
    }
}
