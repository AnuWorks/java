package dsa;

import java.util.ArrayList;

public class GraphForAMatrix {

    ArrayList<Node> nodes;
    int[][] matrix;

    GraphForAMatrix(int size) {
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addEdge(int source, int destination) {
        matrix[source][destination] = 1;
    }

    public boolean checkEdge(int source, int destination) {
        return matrix[source][destination] == 1;
    }

    public void print() {

        System.out.print("  ");
        for (Node node : nodes) {
            System.out.print(node.data + " ");
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data + " ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method added for depth first search
    public void depthFirstSearch(int src) {

    }

}
