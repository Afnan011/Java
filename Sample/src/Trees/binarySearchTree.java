package Trees;

public class binarySearchTree {

    public class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public Node root = null;

    public void insertData(int data) {
        Node newNode = new Node(data);
        Node currentNode = root;

        if (currentNode == null) {
            root = newNode;
            return;
        }

        while (true) {

            if (data < currentNode.data) {
                if (currentNode.left == null) {
                    currentNode.left = newNode;
                    break;
                } else {
                    currentNode = currentNode.left;
                }
            } else {
                if (currentNode.right == null) {
                    currentNode.right = newNode;
                    break;
                } else {
                    currentNode = currentNode.right;
                }
            }

        }

    }

    public boolean contains(int data) {
        Node currentNode = root;

        while (currentNode != null){

            if (data < currentNode.data){
                currentNode = currentNode.left;
            } else if (data > currentNode.data) {
                currentNode = currentNode.right;
            }
            else{
                return true;
            }

        }

        return false;
    }

    public void inOrder() {             //left  root  right
        inOrderHelper(root);
    }
    private void inOrderHelper(Node currentNode){

        if (currentNode != null){
            inOrderHelper(currentNode.left);
            System.out.print(currentNode.data + " ");
            inOrderHelper(currentNode.right);
        }

    }

    public void preOrder() {             //root  left  right
        preOrderHelper(root);
    }
    private void preOrderHelper(Node currentNode){

        if (currentNode != null){
            System.out.print(currentNode.data + " ");
            preOrderHelper(currentNode.left);
            preOrderHelper(currentNode.right);
        }

    }

    public void postOrder() {             //left  root  right
        postOrderHelper(root);
    }
    private void postOrderHelper(Node currentNode){

        if (currentNode != null){
            postOrderHelper(currentNode.left);
            postOrderHelper(currentNode.right);
            System.out.print(currentNode.data + " ");
        }

    }

    public void deleteNode(int key){
        Node currentNode = root;
        deleteNodeHelper(currentNode, key);
    }

    private static Node deleteNodeHelper(Node root, int key){

        if (root == null){
            return root;
        }

        if (key < root.data){
            root.left =  deleteNodeHelper(root.left, key);
        }
        else if (key > root.data) {
            root.right = deleteNodeHelper(root.right, key);
        }
        else{
            if (root.left == null){
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }

            root.data = getMinVal(root.right);
             root.right = deleteNodeHelper(root.right, root.data);
        }


        return root;
    }

    private static int getMinVal(Node root) {
        int value = root.data;
        while (root != null){
            value = root. data;
            root = root.left;
        }

        return value;
    }

    public static void main(String[] args) {
        binarySearchTree tree = new binarySearchTree();

/*        tree.insertData(10);
        tree.insertData(5);
        tree.insertData(15);
        tree.insertData(3);
        tree.insertData(8);
        tree.insertData(11);
        tree.insertData(18);
        tree.insertData(2);
        tree.insertData(6);
        tree.insertData(9);*/

        tree.insertData(25);
        tree.insertData(6);
        tree.insertData(5);
        tree.insertData(3);
        tree.insertData(20);
        tree.insertData(15);
        tree.insertData(21);
        tree.insertData(35);
        tree.insertData(40);

        System.out.println("InOrder");
        tree.inOrder();

        System.out.println("\nPreOrder");
        tree.preOrder();

        System.out.println("\nPostOrder");
        tree.postOrder();

        tree.deleteNode(20);
        System.out.println();
        tree.inOrder();





    }

}
