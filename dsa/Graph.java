package dsa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    ArrayList<Node> nodes;
    int[][] matrix;

    Graph(int size) {
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addEdge(int src, int dst) {
        matrix[src][dst] = 1;
    }

    public void checkEdge(int src, int dst) {
        System.out.println(matrix[src][dst] == 1);
    }

    public void print() {

        System.out.print("  ");
        for (Node node : nodes) {
            System.out.print(node.data + " ");
        }
        System.out.println();

        // rows
        for (int i = 0; i < matrix.length; i++) {
            // columns - columns length can be acquired by matrix[i].length
            // if its 3D array then matrix[i][j].length
            System.out.print(nodes.get(i).data + " ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void depthFirstSearch(int src) {
        boolean[] visited = new boolean[matrix.length];
        dfsHelper(src, visited);
    }

    public void breadthFirstSearch(int src) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[matrix.length];

        // Add the src node to queue
        queue.offer(src);
        // Mark the node as visited
        visited[src] = true;

        while (!queue.isEmpty()) {

            src = queue.poll();
            System.out.println(nodes.get(src).data + " = visited");

            // Look for any adjacent neighbours
            for (int i = 0; i < matrix[src].length; i++) {
                if (matrix[src][i] == 1 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }

        }
    }

    private void dfsHelper(int src, boolean[] visited) {
        if (visited[src]) {
            return;
        } else {
            visited[src] = true;
            System.out.println(nodes.get(src).data + " = visited");
        }
        // in this step we are traversing the row, src gives us the row we need to traverse
        for (int i = 0; i < matrix[src].length; i++) {
            if (matrix[src][i] == 1) {
                dfsHelper(i, visited);
            }
        }
    }
}
