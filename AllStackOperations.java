import java.util.Scanner;

class StackOperations {

    int top;
    int size;
    int capacity;
    int arr[];

    public StackOperations(int capacity) {
        this.top = -1;
        this.size = 0;
        this.capacity = capacity;
        arr = new int[capacity];
    }

    Scanner sc = new Scanner(System.in);

    public void push(int element) {
        try {
            if (top == capacity - 1) {
                System.out.println("Stack Overflow");
            } else {
                top++;
                arr[top] = element;
                size++;
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            top--;
            size--;
        }
        System.out.println();
    }

    public void peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println(arr[top]);
        }
        System.out.println();
    }

    public void Size() {
        System.out.println("The Size is : " + size);
        System.out.println();
    }

    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    boolean exit = true;

    public void SwitchStatement() {

        while (exit) {
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Size");
            System.out.println("5.Display");
            System.out.println("6.Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Element to Push : ");
                    int ele = sc.nextInt();
                    push(ele);
                    break;

                case 2:
                    pop();
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
                    exit = false;
                    break;

                default:
                    System.out.println("Enter A valid Statement !!!");
            }
        }
    }
}

public class AllStackOperations {
    public static void main(String[] args) {
        StackOperations obj = new StackOperations(10);
        obj.SwitchStatement();
    }
}