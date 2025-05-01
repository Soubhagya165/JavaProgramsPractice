import java.util.Scanner;

class ArrayRotation {
    Scanner sc = new Scanner(System.in);

    public void arrayRotate (int arr[])
    {
        System.out.print("Enter Position to rotate : ");
        int position = sc.nextInt();

        arrayReverse(arr,0,arr.length-1);
        arrayReverse(arr,0,position-1);
        arrayReverse(arr,position,arr.length-1);

        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public void arrayReverse (int arr[],int start,int end) {

        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public void arrayDisplay () {
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter Array Elements : ");
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        arrayRotate(arr);
    }
}

public class Rotatearray {
    public static void main(String[] args) {
        ArrayRotation obj = new ArrayRotation();
        obj.arrayDisplay();
    }
}