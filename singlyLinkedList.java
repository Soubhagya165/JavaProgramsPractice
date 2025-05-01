class Node {
    int value;
    Node next;

    public Node (int value) {
        this.value = value;
        this.next = null;
    }

   
}

public class singlyLinkedList {
    Node head = null;
    Node tail = null;
    int size = 0;

    public void InsertatBegining (int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = tail = newNode;
        }
        else
        {
            newNode.next = head;
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
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void InsertatAnyPosition (int data,int Position) {
        Node newNode = new Node(data);

        if(Position < 0 || Position > size)
        {
            System.out.println("Enter a Valid Position");
        }

        else if(Position == 0)
        {
            InsertatBegining(data);
        }

        else if(Position == size)
        {
            InsertatEnd(data);
        }

        else
        {
            Node current = head;

            for(int i = 0;i<Position - 1;i++)
            {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    public void deleteAtBegining () {
        if(head == null)
        {
            System.out.println("List is Empty");
        }
        else
        {
            head = head.next;
        }
        size--;
    }

    public void deletAtEnd() {
        if(head == null) {
            System.out.println("List is Empty");
        }
        else
        {
            Node current = head;
            while(current.next != tail)
            {
                current = current.next;
            }
            current.next = null;
            tail = current;
            
        }
        size--;
    }

    public void deleteatAnyPosition (int position) {
        if(head == null)
        {
            System.out.println("List is Empty");
        }
        else if(position < 0 || position > size)
        {
            System.out.println("Enter a valid Position");
        }
        else if(position == 0)
        {
            deleteAtBegining();
        }
        else if(position == size - 1)
        {
            deletAtEnd();
        }
        else
        {
            Node current = head;
            for(int i = 0;i<position - 1;i++)
            {
                current = current.next;
            }

            current.next = current.next.next;
        }
        size--;
    }

    public void display () {
        if(head == null) 
        {
            System.out.println("List is Empty");
        }
        else
        {
            Node current = head;
            while(current != null)
            {
                System.out.print(current.value+" ");
                current = current.next;
            }
        }
    }
    public static void main(String[] args) {
        singlyLinkedList obj = new singlyLinkedList();
        obj.InsertatBegining(43);
        obj.InsertatBegining(98);
        obj.InsertatBegining(65);
        obj.InsertatEnd(78);
        obj.InsertatEnd(31);
        obj.InsertatBegining(29);
        obj.InsertatAnyPosition(67, 2);
        obj.deleteAtBegining();
        obj.deletAtEnd();
        obj.deleteatAnyPosition(2);
        obj.deleteatAnyPosition(2);
        obj.display();
    }
}
