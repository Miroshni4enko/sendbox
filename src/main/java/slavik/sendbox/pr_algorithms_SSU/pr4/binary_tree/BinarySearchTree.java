package slavik.sendbox.pr_algorithms_SSU.pr4.binary_tree;

/**
 * Created by vymi1016 on 03/02/2017.
 */
public class BinarySearchTree<T extends Comparable> {
    public Node<T> find(Node<T> root, T x)
    {
        if(root==null)
            return null;
        if(root.key==x)
            return root;
        if(root.key.compareTo(x)==1){

            return find(root.r, x);
        }
        else{
            return find(root.l, x);
        }
    }
    public Node<T> insert(Node<T> root, T x)
    {
        if(root==null) {
            Node temp =  new Node<T>();
            temp.key = x;
            return temp;
        }

        if(root.key.compareTo(x)==1){

            root.r = insert(root.r, x);
        }
        if(root.key.compareTo(x)==-1){

            root.l = insert(root.l, x);
        }
        return root;
    }
}