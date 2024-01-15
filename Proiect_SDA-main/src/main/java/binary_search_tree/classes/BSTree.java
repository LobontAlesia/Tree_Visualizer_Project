package binary_search_tree.classes;

public class BSTree {
    private Node root;

    public BSTree() {
        this.root = Node.Nil;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public int[] preorderArray(Node root, int[] preorderArray) {
        if (root != Node.Nil) {
            preorderArray = preorderArray(root.getLeftChild(), preorderArray);
            preorderArray = preorderArray(root.getRightChild(), preorderArray);
            preorderArray[preorderArray.length - root.getLevel() - 1] = root.getKey();
        }
        return preorderArray;
    }

    public int getSize(Node root) {
        return getSize(this.root);
    }

}
