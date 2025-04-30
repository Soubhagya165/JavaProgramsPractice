import java.util.Scanner;

class ReversealltheElementsinanArray {
    Scanner sc = new Scanner(System.in);

    public void arrayReverse (int arr[])
    {
        int start = 0;int end = arr.length - 1;

        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.print("After Reversing the Array : ");

        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public void display () {
        System.out.print("Enter size of the Array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter Array Elements : ");

        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        arrayReverse(arr);
    }
}

public class ReverseanArray {
    public static void main(String[] args) {
        ReversealltheElementsinanArray obj = new ReversealltheElementsinanArray();
        obj.display();
    }
}