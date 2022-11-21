package Week1;

public class Week1 {
    public static void PTB1(int a, int b)// PT ax + b=0
    {
        if(a==0){
            if(b==0)
                System.out.println("Pt vo so nghieem");
            else System.out.println("PT vo nghiem");
        }else
            System.out.println("PT co 1 nghiem: x = " + ((float)-b/a));
    }
    public static void PTB2(int a, int b, int c) // PT ax2 + bx + c =0
    {
        if(a==0){
            PTB1(b,c);
        }else{
            double d = b*b -4 *a *c;
            if(d==0)
                System.out.println("Phuong trinh vo nghiem");
            else{
                if(d==0)
                    System.out.println("Phuong trinh co nghiem kep x1= x2 = "+ ((float)-b/2*a));
                else{
                    System.out.println("PT co 2 mnghiem: ");
                    System.out.println("x1 = " + (-b-Math.sqrt(d)/(2*a)));
                    System.out.println("x2 = " + (-b+Math.sqrt(d)/(2*a)));
                }
            }
        }
    }
    public static int SumindexNumber(int n){
        int sum=0;
        while (n>0){
            sum = sum + n%10; // Cong tung chu so cuoi
            n= n/10; // Tinh lai phan nguyenm
        }
        return sum;
    }
    public static int Fact(int n) //n!
    {
        int f= 1;
        for(int i = n; i>0; i--){
            f = f * i;
        }
        return f;
    }
    public static void main(String[] args) {
//    PTB2(2,5,3);
//    int n= 6;
//    System.out.printf("%d! = %d", n, Fact(n));
        int n = 455;
        System.out.printf("sum(%d)  = %d", n, SumindexNumber(n));
    }
}
