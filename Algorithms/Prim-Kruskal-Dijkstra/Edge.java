// The Edge class that represent an edge connecting two vertices in a graph
public class Edge {
    // instance variables
    private int m_srcVertex; // index of the source vertex
    private int m_destVertex; // index of the destination vertex

    // constructor
    public Edge(int srcVertex, int destVertex) {
        m_srcVertex = srcVertex;
        m_destVertex = destVertex;
    }

    // return a string representation of the Edge
    @Override
    public String toString() {
        return "(v" + m_srcVertex + ", " + "v" + m_destVertex + ")";
    }

    // compare two Edge objects and return true if they have the same source and
    // destination vertices, and false otherwise
    public boolean equals(Edge e) {
        if (m_srcVertex == e.m_srcVertex && m_destVertex == e.m_destVertex
                || m_srcVertex == e.m_destVertex && m_destVertex == e.m_srcVertex)
            return true;
        else
            return false;
    }
}
