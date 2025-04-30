import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer a,Integer b) {
        return b - a;
    }
}

class listArray {
    void display () {
        List<Integer> arr = new ArrayList<>(5);
        arr.add(36);
        arr.add(78);
        arr.add(41);
        arr.remove(1);
        arr.add(1,60);
        arr.set(1,55);
        arr.remove(Integer.valueOf(41));
        

        List<Integer> arr1 = List.of(23,45,67,89);

        arr.addAll(arr1);
        arr.sort(new MyComparator());
        System.out.println(arr);

        for(int num : arr) {
            System.out.println(num);
        }

        System.out.println("The size is : "+arr.size());
    }
}

public class arrayListCollection {
    public static void main(String[] args) throws Exception {
        listArray obj = new listArray();
        obj.display();
    }
}