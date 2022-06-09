
package j1.s.p0007;

import java.util.Arrays;
import java.util.Scanner;
import sun.applet.AppletViewer;
public class Graph {

    static int numOfNodes;
    static int isSetMatrix[][];

    public Graph(int numOfNodes) {
        this.numOfNodes = numOfNodes;
        isSetMatrix = new int[numOfNodes][numOfNodes];
    }

    public void addEdge(int source, int destination) {
        if (source >= 0 && source < numOfNodes && destination >= 0 && destination < numOfNodes) {
            isSetMatrix[source][destination] = 1;
            isSetMatrix[destination][source] = 1;
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 3);
        graph.addEdge(1, 3);
        graph.addEdge(4, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        int count = 0;
        // print matrix 
        for (int i = 0; i < numOfNodes; i++) {
            for (int j = 0; j < numOfNodes; j++) {
                System.out.print(isSetMatrix[i][j] + " ");
                count++;
            }
            if (count == 5) {
                System.out.println(" ");
            }
            count = 0;
        }

        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the start point: ");
        int start = getInt(0, 4);
        System.out.print("Enter the end point: ");
        int end = getInt(0, 4);
        if (isSetMatrix[start][end] == 1) {
            System.out.println("This is a edge");
        } else {
            System.out.println("This is a not edge");
        }
    }

    public static int getInt(int min, int max) {
        int ret = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                ret = Integer.parseInt(sc.nextLine());
                if (ret >= min && ret <= max) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid number,pls input again");
            }
        }
        return ret;
    }

}
