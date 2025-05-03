import java.util.Scanner;

class SortedArray {
    Scanner sc = new Scanner(System.in);

    public void checkingSorted(int[] arr) {
        boolean sortAscending = true;
        boolean sortDescending = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                sortAscending = false;
            }
            if (arr[i] <= arr[i + 1]) {
                sortDescending = false;
            }
        }
        if (sortAscending) {
            System.out.println("Sorted Array in Ascending Order");
        } else if (sortDescending) {
            System.out.println("Sorted Array in Descending Order");
        } else {
            System.out.println("Unsorted Array");
        }
    }

    public void arrayDisplay() {
        System.out.print("Enter Size of the Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter Array Elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        checkingSorted(arr);
    }
}

public class CheckSortedArray {
    public static void main(String[] args) {
        SortedArray obj = new SortedArray();
        obj.arrayDisplay();
    }
}