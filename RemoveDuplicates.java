import java.util.Arrays;
import java.util.Scanner;

class DuplicatesRemoval {
    Scanner sc = new Scanner(System.in);

    public void duplicateArray (int arr[]) {

        Arrays.sort(arr);

        System.out.print(arr[0]+" ");

        for(int i = 1;i<arr.length;i++)
        {
            if(arr[i] != arr[i-1])
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
    public void ArrayDisplay () {
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter Array Elements : ");

        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        duplicateArray(arr);
    }
}

public class RemoveDuplicates {
    public static void main(String[] args) {
        DuplicatesRemoval obj = new DuplicatesRemoval();
        obj.ArrayDisplay();
    }
}
