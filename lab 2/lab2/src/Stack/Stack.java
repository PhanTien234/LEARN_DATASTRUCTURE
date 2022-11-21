package Stack;

import ArrayList.ArrList;

public class Stack {
    int[] S= new int[10];// KB stack S co 10 pt
    int top =-1; // danh dinh stack (top = -1 la S rong)
    void push(int x)// dua x vao stack
    {
        top = top +1;
        S[top] = x;
    }
    int pop()// lay phan tu tren dinh stack
    {
        int x = S[top];
        top --;
        return x;
    }
    int peak() // Lay cac phan tu tren dinh nhung khoong xoa
    {
        return S[top];
    }
    public static void main(String[] args){
     Stack st = new Stack();
     st.push(1);st.push(2);st.push(3);
        System.out.printf("Top = %d", st.top);
        int x = st.pop();
        System.out.printf("\nx = pop() = %d", x);
        System.out.printf("\nTop = %d", st.top);
        st.peak();
        System.out.printf("\nTop = %d", st.top);
    }
}
