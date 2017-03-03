package slavik.sendbox.pr_algorithms_SSU.pr4.binary_tree;

/**
 * Created by vymi1016 on 03/02/2017.
 */
public class Node {
    private int data;
    private Node left;
    private Node right;
    private Node parent;

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return this.left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return this.right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getParent() {
        return this.parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }
}