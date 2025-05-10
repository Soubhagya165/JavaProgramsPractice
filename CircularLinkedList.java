class Node {
    int data;
    Node next;
    Node prev;

    public Node (int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class CircularLinkedList {
    Node head;
    Node tail;
    int size;

    public CircularLinkedList () {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void InsertatBegining (int data) {
        Node newNode = new Node(data); 
        if(head == null)
        {
            head = tail = newNode;
        }
        else
        {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
            
        }
        size++;
    }

    public void InsertatEnd (int data) {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail = newNode;
        }
        else
        {
            newNode.prev = tail;
            newNode.next = head;
            tail.next = newNode;
            head.prev = newNode;
            tail = newNode;
        }
    }

    public void display () {
        if(head == null)
        {
            System.out.println("List is Empty");
        }
        else
        {
            Node current = head;
            do
            {
                System.out.print(current.data+" ");
                current = current.next;
            }while(current != head);
        }
    }
    public static void main(String[] args) {
        CircularLinkedList obj = new CircularLinkedList();
        obj.InsertatBegining(12);
        obj.InsertatBegining(78);
        obj.InsertatBegining(89);
        obj.InsertatEnd(34);
        obj.InsertatEnd(43);
        obj.InsertatEnd(98);
        obj.display();
        System.out.println(obj.head.prev.data);
    }
}
