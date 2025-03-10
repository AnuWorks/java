package dsa;

import java.util.ArrayList;
import java.util.LinkedList;

public class GraphForAList {
    ArrayList<LinkedList<Node>> alist;

    GraphForAList() {
        alist = new ArrayList<>();
    }

    public void addNode(Node node) {
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
    }

    public void addEdge(int src, int dst) {
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dst).getFirst();
        currentList.add(dstNode);

    }

    public boolean checkEdge(int src, int dst) {
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dst).getFirst();

        for (Node node : currentList) {
            if (node == dstNode) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        for (LinkedList<Node> currentList : alist) {
            for (Node node : currentList) {
                System.out.print(node.data + "->");
            }
            System.out.println();
        }
    }
}
