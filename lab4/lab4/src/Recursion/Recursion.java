package Recursion;

public class Recursion {
    int GT(int n){
        if(n==1)
            return 1; // base case: DK duwngf
        else
            return n * GT(n-1); // Recursive call = Inductive case
    }
    int Fibonaci(int n){
        if(n<= 2){
            return n;
        }else {
            return Fibonaci(n-1) + Fibonaci(n-2);
        }
    }
    void inDayFibo(int n){
        for(int i =1; i<=n; i++){
            System.out.print(Fibonaci(i)+ " ");
        }
    }
    void Convert(int n){
        if (n > 0) {
            Convert(n/2);
            System.out.print(n % 2);
        }else
            return;
    }
    void MoveDisk(int n , char A, char B, char TG) // Chuyen n dia tu A-B
    {
        if(n==1){
            System.out.print("\nMove from " + A + "to "+ B);
        }else {
            MoveDisk(n-1, A, TG, B);// 1. Bung n-1 dia tu A => TG, su dung B lam Trung gian
            System.out.print("\nMOve from "+ A + " to " + B); // 2. Bung 1 dia tu A sang B
            MoveDisk(n-1, TG, B, A); //3. Bung nguoc n-1 dia tu TG=>B, su dung A lam trung gian
        }
    }
    int GCD(int a, int b){
        if(b==0){
            return a;
        }else {
            return GCD(b, a%b);
        }
    }
    public static void main(String[] args){
        Recursion R = new Recursion();
        int n = 1;
        System.out.printf("%d! = %d", n, R.GT(n));
        System.out.println();
        System.out.printf("Fibo of %d = %d", n, R.Fibonaci(n));
        System.out.println();
        System.out.println("Fibo sequence of "+ n +": ");
        R.inDayFibo(n);
        System.out.println();
        System.out.println("Binary of "+ n +": ");
        R.Convert(n);
        R.MoveDisk(n, 'A', 'B', 'T');
        int a = 15, b= 25;
        System.out.printf("GCD(%d,%d) = %d",a, b, R.GCD(a,b));
    }
}
