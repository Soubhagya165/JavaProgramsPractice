class Node {
    int data;
    Node next;
    Node previous;

    public Node (int data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}

public class AllmethodsinDoublyLinkedList {
    Node head;
    Node tail;
    int size;

    public AllmethodsinDoublyLinkedList () {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void InsertatBegining (int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
        }
        else
        {
            newNode.next = head;
            head.previous = newNode;
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
            newNode.previous = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void InsertatAnyPosition (int data,int position) {
        Node newNode = new Node(data);
        if(position < 0 || position > size)
        {
            System.out.println("Invalid Position");
        }
        else if(position == 0)
        {
            InsertatBegining(data);
        }
        else if(position == size)
        {
            InsertatEnd(data);
        }
        else
        {
            Node current = head;
            for(int i = 0;i<position-1;i++)
            {
                current = current.next;
            }
            newNode.next = current.next;
            newNode.previous = current;
            current.next.previous = newNode;
            current.next = newNode;
            size++;
        }
    }

    public void DeleteatBegining () {
        if(head == null)
        {
            System.out.println("List is Empty");
        }
        else if(head == tail)
        {
            head = tail = null;
        }
        else
        {
            head = head.next;
            head.previous = null;
            size--;
        }
    }

    public void DeleteatEnd () {
        if(head == null)
        {
            System.out.println("List is Empty");
        }
        else if(head == tail)
        {
            head = tail = null;
            size--;
        }
        else
        {
            tail = tail.previous;
            tail.next = null;
            size--;
        }
    }

    public void DeleteatAnyPosition (int position) {
        if(position <0 || position > size - 1)
        {
            System.out.println("Invalid Position");
        }
        else if(position == 0)
        {
            DeleteatBegining();
        }
        else if(position == size - 1)
        {
            DeleteatEnd();
        }
        else
        {
            Node current = head;
            for(int i = 0;i<position - 1;i++)
            {
                current = current.next;
            }
            current.next = current.next.next;
            current.next.previous = current;
            size--;
        }
    }

    public void display () {
        Node current = head;
        while(current != null)
        {
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        AllmethodsinDoublyLinkedList obj = new AllmethodsinDoublyLinkedList();
        obj.InsertatBegining(23);
        obj.InsertatBegining(20);
        obj.InsertatEnd(43);
        obj.InsertatEnd(67);
        obj.InsertatAnyPosition(29, 2);
        obj.DeleteatBegining();
        obj.DeleteatEnd();
        obj.DeleteatAnyPosition(1);
        obj.InsertatAnyPosition(45, 2);
        obj.InsertatAnyPosition(57, 1);
        obj.InsertatAnyPosition(34, 0);
        obj.DeleteatAnyPosition(1);
        obj.display();
    }
}
