import java.util.Scanner;

class QueueOperations {
    Scanner sc = new Scanner(System.in);
    int front;
    int rear;
    int size;
    int capacity;
    int arr[];

    public QueueOperations(int capacity) {
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.capacity = capacity;
        arr = new int[capacity];
    }

    public void enqueue(int element) {
        if (rear == capacity - 1) {
            System.out.println("Queue Overflow");
        } else {
            rear++;
            arr[rear] = element;
            size++;
        }
    }

    public void dequeue() {
        if (front > rear) {
            System.out.println("Queue is Empty");
        } else {
            front++;
            size--;
        }
    }

    public void peek() {
        System.out.println("The Element in the peek is : " + arr[front]);
    }

    public void Size() {
        System.out.println("The Size is : " + size);
    }

    public void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void SwitchStatement() {
        boolean exit = true;

        while (exit) {

            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Peek");
            System.out.println("4.Size");
            System.out.println("5.Display");
            System.out.println("6.Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Element to Enqueue : ");
                    int element = sc.nextInt();
                    enqueue(element);
                    break;

                case 2:
                    dequeue();
                    break;

                case 3:
                    peek();
                    break;

                case 4:
                    Size();
                    break;

                case 5:
                    display();
                    break;

                case 6:
                    System.out.println("Exiting !!!!!!");
                    exit = false;
                    break;

                default:
                    System.out.println("Enter a Valid Number !!");
            }
        }
    }
}

public class AllQueueOperations {
    public static void main(String[] args) {
        QueueOperations obj = new QueueOperations(10);
        obj.SwitchStatement();
    }
}
