import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

class DuplicateRemoval {
    Scanner sc = new Scanner(System.in);

    public void removeDuplicates (int arr[]) {
        HashSet<Integer> remove1 = new HashSet <Integer> ();

        for(int i = 0;i<arr.length;i++)
        {
            remove1.add(arr[i]);
        }

        System.out.println(remove1);
    }
    public void ArrayDisplay () {
        System.out.print("Enter Size of the Array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter Array Elements : ");

        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        removeDuplicates(arr);
    }
}

public class RemoveDuplicatesusingHash {
    public static void main(String[] args) {
        DuplicateRemoval obj = new DuplicateRemoval();
        obj.ArrayDisplay();
    }
}
