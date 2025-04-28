import java.util.Scanner;

class Largest {
    Scanner sc = new Scanner(System.in);

    public int findMaximum (int[] arr) {
        int max = arr[0];

        for(int i = 0;i<arr.length;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public int arrayElementsInsert () {
        System.out.print("Enter Size of the Array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter Array Elements : ");
        for(int i = 0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        return findMaximum(arr);
    }
}

public class LargestelementinanArray {
    public static void main(String[] args) {
        Largest obj = new Largest();
        System.out.println("The Maximum Element in the Array is : "+obj.arrayElementsInsert());
    }
}