// The test driver for the Graph class
public class TestGraph {
    public static void main(String[] args) {
        Graph myGraph = new Graph(8);

        // add vertices
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");
        myGraph.addVertex("E");
        // myGraph.addVertex("F");
        // myGraph.addVertex("G");
        // myGraph.addVertex("H");

        // add edges
        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "D");
        myGraph.addEdge("A", "F");
        myGraph.addEdge("B", "E");
        myGraph.addEdge("B", "C");
        myGraph.addEdge("B", "D");
        myGraph.addEdge("C", "D");
        myGraph.addEdge("D", "E");
        myGraph.addEdge("E", "F");

        System.out.println("The link-based representation of the graph is:\n" + myGraph);

        System.out.println("DFS traversal illustration:");
        myGraph.DFS("A");

        myGraph.resetVisited();
        System.out.println("\nBFS traversal illustration:");
        myGraph.BFS("A");
        System.out.println();
    }
}
