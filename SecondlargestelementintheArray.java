import java.util.Scanner;

class SecondLargest {
    Scanner sc = new Scanner(System.in);
    public int foundSecondLargestElement(int [] arr) {
        int max1 = arr[0];
        int max2 = 0;

        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i] > max1)
            {
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] > max2 && arr[i] != max1)
            {
                max2 = arr[i];
            }
        }
        return max2;
    }
    public int arrayDisplay() {
        System.out.print("Enter size of the array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter Array Elements : ");
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        return foundSecondLargestElement(arr);
    }
}

public class SecondlargestelementintheArray {
    public static void main(String[] args) {
        SecondLargest obj = new SecondLargest();
        System.out.println("The Second Largest Element in the Array is : "+obj.arrayDisplay());
    }
}
