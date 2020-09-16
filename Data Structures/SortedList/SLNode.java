// The SLNode class that represents nodes
public class SLNode {
    // instance variables
    private int m_info;
    private SLNode m_link;

    // constructor
    public SLNode(int info) {
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
