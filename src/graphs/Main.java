package graphs;

public class Main {
    public static void main(String[] args) {

        Graph myGraph = new Graph();
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");
        myGraph.printGraph();
        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("B", "C");
        myGraph.printGraph();

        myGraph.removeEdge("A", "B");
        myGraph.printGraph();

        myGraph.removeVertex("C");
        myGraph.printGraph();


    }
}
