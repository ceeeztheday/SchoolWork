
// The implementation for the undirected and non-weighted graph ADT
import java.util.*;

public class Graph {
    // instance variables
    private int m_numVertices;
    private GNode[] m_vertices;

    // constructor
    public Graph(int maxVertices) {
        m_vertices = new GNode[maxVertices];
        m_numVertices = 0;
    }

    // add a vertex into the graph
    public void addVertex(String s) {
        m_vertices[m_numVertices] = new GNode(m_numVertices, s);
        m_numVertices++;
    }

    // add an edge into the graph
    public void addEdge(String strFrom, String strTo) {
        int indFrom = findVertex(strFrom);
        int indTo = findVertex(strTo);

        // check if the vertices exist in the graph
        if (indFrom == -1 || indTo == -1)
            throw new RuntimeException("At least one vertex does not exist.");

        // create a new node and insert it into the adjacency list of the "from" vertex
        GNode adjVertex = new GNode(m_vertices[indTo]);
        GNode fromVertex = m_vertices[indFrom];

        while (fromVertex.link != null)
            fromVertex = fromVertex.link;

        fromVertex.link = adjVertex;

        // create a new node and insert it into the adjacency list of the "to" vertex
        adjVertex = new GNode(m_vertices[indFrom]);
        GNode toVertex = m_vertices[indTo];

        while (toVertex.link != null)
            toVertex = toVertex.link;

        toVertex.link = adjVertex;
    }

    // return a string representation of the graph
    @Override
    public String toString() {
        String strContent = "";

        for (int i = 0; i < m_numVertices; i++) {
            GNode current = m_vertices[i];

            if (current.visited)
                strContent += "[ " + i + " | " + current.data + " | visited ]";
            else
                strContent += "[ " + i + " | " + current.data + " | not visited ]";

            while (current.link != null) {
                current = current.link;

                if (isVisited(current))
                    strContent += " -> [ " + current.index + " | " + current.data + " | visited ]";
                else
                    strContent += " -> [ " + current.index + " | " + current.data + " | not visited ]";
            }

            strContent += "\n";
        }

        return strContent;
    }

    // traverse the graph using depth first search
    public void DFS(String s) {
        // check if the vertex exists in the graph
        int indStart = findVertex(s);
        if (indStart == -1)
            throw new RuntimeException("The starting vertex does not exist.");

        String strDFS = "";
        String strStack = "";
        Stack<GNode> myStack = new Stack<GNode>();
        GNode vertex = m_vertices[indStart];
        myStack.push(vertex);

        // print the header of the table
        System.out.format("%-30s%-30s\n", "Stack (from bottom to top)", "DFS traversal");

        while (!myStack.isEmpty()) {
            // print the content of the stack
            strStack = "[ ";
            for (GNode tmp : myStack)
                strStack += tmp.data + " ";

            System.out.format("%-30s", strStack + "]");

            // print the DFS traversal sequence
            if (strDFS == "")
                System.out.println("n/a");
            else
                System.out.println(strDFS);

            // get the element from the top of the stack
            vertex = myStack.peek();

            // if the vertex is not visited, visit it
            if (!isVisited(vertex)) {
                setVisited(vertex);
                strDFS += vertex.data + " ";
            }

            // skip all visited adjacent vertices
            while (true) {
                vertex = vertex.link;

                // if the node has no unvisited adjacent vertices, pop it off
                if (vertex == null) {
                    myStack.pop();
                    break;
                } else if (!isVisited(vertex))
                    break;
            }

            // if the vertex has an unvisited neighbor, push the neighbor onto the stack
            if (vertex != null) {
                vertex = m_vertices[vertex.index];
                myStack.push(vertex);
            }
        }

        // print the content of the stack for the last iteration
        strStack = "[ ";
        for (GNode tmp : myStack)
            strStack += tmp.data + " ";

        System.out.format("%-30s", strStack + "]");

        // print the DFS traversal sequence
        System.out.println(strDFS);
    }

    // traverse the graph using breadth first search
    public void BFS(String s) {
        // check if the vertex exists in the graph
        int indStart = findVertex(s);
        if (indStart == -1)
            throw new RuntimeException("The starting vertex does not exist.");

        String strBFS = "";
        String strQueue = "";
        Queue<GNode> myQueue = new LinkedList<GNode>();
        GNode vertex = m_vertices[indStart];

        // visit and enqueue the vertex
        setVisited(vertex);
        strBFS += vertex.data + " ";
        myQueue.add(vertex);

        // print the header of the table
        System.out.format("%-30s%-30s\n", "Queue (from front to rear)", "BFS traversal");

        while (!myQueue.isEmpty()) {
            // print the content of the queue
            strQueue = "[ ";
            for (GNode tmp : myQueue)
                strQueue += tmp.data + " ";

            System.out.format("%-30s", strQueue + "]");

            // print the BFS traversal sequence
            System.out.println(strBFS);

            // get and remove the element from the front of the queue
            vertex = m_vertices[myQueue.poll().index];

            // visit and enqueue all unvisited adjacent vertices
            while (true) {
                vertex = vertex.link;

                if (vertex == null)
                    break;

                if (!isVisited(vertex)) {
                    setVisited(vertex);
                    strBFS += vertex.data + " ";
                    myQueue.add(vertex);
                }
            }
        }

        // print the content of the queue for the last iteration
        strQueue = "[ ";
        for (GNode tmp : myQueue)
            strQueue += tmp.data + " ";

        System.out.format("%-30s", strQueue + "]");

        // print the BFS traversal sequence
        System.out.println(strBFS);
    }

    // helper methods
    public int findVertex(String s) {
        for (int i = 0; i < m_numVertices; i++)
            if (s.equals(m_vertices[i].data))
                return i;

        return -1;
    }

    public boolean isVisited(GNode node) {
        return m_vertices[node.index].visited;
    }

    public void setVisited(GNode node) {
        m_vertices[node.index].visited = true;
    }

    public void resetVisited() {
        for (int i = 0; i < m_numVertices; i++)
            m_vertices[i].visited = false;
    }
}
