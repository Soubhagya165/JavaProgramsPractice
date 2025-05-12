class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}
class SimpleBST {
    Node root;

    // Insert method
    void insert(int value) {
        root = insertRec(root, value);
    }

    Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.data)
            root.left = insertRec(root.left, value);
        else if (value > root.data)
            root.right = insertRec(root.right, value);

        return root;
    }

    // Inorder traversal (Left, Root, Right)
    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    // Preorder traversal (Root, Left, Right)
    void preorder() {
        preorderRec(root);
    }

    void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        SimpleBST tree = new SimpleBST();

        // Inserting nodes
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        // Traversals
        System.out.println("Inorder traversal:");
        tree.inorder();  // Output: 20 30 40 50 60 70 80

        System.out.println("\nPreorder traversal:");
        tree.preorder(); // Output: 50 30 20 40 70 60 80
    }
}
