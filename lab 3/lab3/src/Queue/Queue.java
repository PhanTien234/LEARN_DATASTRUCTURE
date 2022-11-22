package Queue;

public class Queue {
    int MAX = 5;
    int Q[] = new int[5]; // KB queue co 10 PT
    int front = 0, rear = 0;// queue rong
    void enqueue(int x) // Them x vao cuoi queue
    {
        Q[rear] = x;// dua x vao vi tri rear
        rear = (rear + 1) % MAX; // tang rear
    }
    int dequeue()// lay PT dau queue
    {
        int x = Q[front];
        front = (front + 1) % MAX; // Tang front
        return x;
    }
    int countELe(){
        return (MAX + rear -front) % MAX;
    }
    boolean isEmpty(){
       return (front == rear);
    }
    int peak(){ // LAy phan tu dau tien ma khong xoa
        return Q[front];
    }
    public static void main(String[] args){
        Queue Qe = new Queue();
        Qe.enqueue(1);Qe.enqueue(2);Qe.enqueue(3);
        System.out.printf("front = %d; rear =%d", Qe.front, Qe.rear);
        System.out.printf("\nSo luong phan tu = %d", Qe.countELe());
        int x = Qe.dequeue(); // Lay phan tu dau tien ra
        System.out.printf("\nfront = %d; rear =%d", Qe.front, Qe.rear);
        System.out.printf("\nSo luong phan tu = %d", Qe.countELe());
        x = Qe.peak();
        System.out.printf("\nfront = %d; rear =%d", Qe.front, Qe.rear);
        System.out.printf("\nSo luong phan tu = %d", Qe.countELe());
    }
}
