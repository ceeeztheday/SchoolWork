
// The SLNode class that represents nodes
import java.io.*; // Serializable interface

public class SLNode1 implements Serializable {
    // instance variables
    private int m_info;
    private SLNode m_link;

    // constructor
    public SLNode(int info)
    {
        m_info = info;
        m_link = null;
    }

    // getters and setters
    public void setLink(SLNode link) {
        m_link = link;
    }

    public SLNode getLink() {
        return m_link;
    }

    public int getInfo() {
        return m_info;
    }
}
