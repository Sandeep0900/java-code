class BinarySearchTree{

    static class  Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null) {
            root = new Node(val);
            return root;
        }
        if(root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean findTheElament(Node root, int val) { //O(H) the hight of the tree
        
        if(root == null) {
            return false;
        }
        if(root.data == val) {
            return true;
        }

        if(root.data >val) {
            return findTheElament(root.left, val);
        } else {
            return findTheElament(root.right, val);
        }
    }

    public static void main(String arr[]) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i=0; i<values.length; i++) {
            root = insert(root, values[i]);
            System.out.println();
            inorder(root);
        }
        // inorder(root);
        System.out.println(findTheElament(root, 8));

    }
} 
