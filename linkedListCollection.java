import java.util.LinkedList;

class linkedList {
    public void display () {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(65);
        list.add(81);
        System.out.println(list);
    }
}

public class linkedListCollection {
    public static void main(String[] args) {
        linkedList obj = new linkedList();
        obj.display();
    }
}
