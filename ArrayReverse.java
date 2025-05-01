import java.util.Scanner;

class ReverseArray {
    Scanner sc = new Scanner(System.in);

    public void arrayReverseusingnewArray (int arr[]) {
        int newArray[] = new int[arr.length];

        for(int i = 0;i<newArray.length;i++)
        {
            newArray[i] = arr[arr.length-i-1];
        }

        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(newArray[i]+" ");
        }
    }

    public void ArrayDisplay () {
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the Elements of the Array : ");

        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        arrayReverseusingnewArray(arr);
    }
}

public class ArrayReverse {
    public static void main(String[] args) {
        ReverseArray obj = new ReverseArray();
        obj.ArrayDisplay();
    }
}