import java.util.HashSet;

public class Hashsetins {
    public static void main(String[] args) {
        HashSet<Integer> seen = new HashSet<>();
        seen.add(10);
        seen.add(20);
        seen.add(10);
        seen.add(50);
        seen.add(40);
        seen.add(20);   

        System.out.println(seen.size());
        System.out.println(seen);

        int arr[] = new int[seen.size()];

        int i = 0;
        for(int num:seen) {
            arr[i++] = num;
        }

        for(i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
