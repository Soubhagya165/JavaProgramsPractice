class Node {
    int data;
    Node next;

    public Node (int data) {
        this.data = data;
        this.next = null;
    }

}

public class LinkedlistallOperations {
    public static void main(String[] args) {
        Node node1 = new Node(67);
        Node node2 = new Node(43);
        Node node3 = new Node(98);
        Node node4 = new Node(56);
        Node node5 = new Node(91);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        System.out.println(node1.next.next.next.data);
    }
}
