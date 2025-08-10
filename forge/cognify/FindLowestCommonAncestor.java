package forge.cognify;

class Node {
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
    }
}

public class FindLowestCommonAncestor {
    public static void main(String[] args) {
        Node root = new Node(9);



    }

    public static Node findLowestCA(Node root, Node p, Node q){
        if(root == null || p == null || q == null) return root;
        Node leftNode = findLowestCA(root.left, p, q);
        Node rightNode = findLowestCA(root.right, p, q);
        return (leftNode != null && rightNode != null) ? root : leftNode != null ? leftNode : rightNode;
    }
}
