class Node {
    int data;
    Node left;
    Node right;

    public Node (int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchtree {
    Node root;

    public void InsertLeft(Node root,int data)
    {
        root.left = new Node(data);
    }

    public void InsertRight (Node root,int data)
    {
        root.right = new Node(data);
    }

    public void Traversal (Node root)
    {
        if(root == null)
        {
            return;
        }
        else
        {
            System.out.print(root.data+" ");
            Traversal(root.left);
            Traversal(root.right);
        }
    }
    public static void main(String[] args) {
        BinarySearchtree obj = new BinarySearchtree();
        obj.root = new Node(12);
        obj.InsertLeft(obj.root, 19);
        obj.InsertLeft(obj.root.left, 37);
        obj.InsertRight(obj.root, 91);
        obj.Traversal(obj.root);
    }
}
