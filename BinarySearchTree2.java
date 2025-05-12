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

public class BinarySearchTree2 {
    Node root;

    public Node Insert (Node root,int data) {
        if(root == null)
        {
            return new Node(data);
        }
        else
        {
            if(data < root.data)
            {
                root.left = Insert(root.left,data);
            }

            if(data > root.data)
            {
                root.right = Insert(root.right,data);
            }

            return root;
        }
    }

    public void inorder (Node root) {
        if(root == null)
        {
            return;
        }
        else
        {
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        BinarySearchTree2 obj = new BinarySearchTree2();
        int arr[] = {1,2,3,4,5,6,7};

        for(int i = 0;i<arr.length;i++)
        {
            obj.root = obj.Insert(obj.root,arr[i]);
        }

        obj.inorder(obj.root);
    }
}
