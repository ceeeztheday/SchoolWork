// the SortedList class that represents sorted linked lists
public class SortedList {
    // instance variable
    private SLNode m_first;

    // constructor
    public SortedList() {
        m_first = null;
    }

    // add a new node into the list, keeping it sorted
    public void add(int v) {
        SLNode newNode = new SLNode(v);
        SLNode current = m_first;
        SLNode previous = null;

        while (current != null) {
            // compare the new value with the value of each node
            if (current.getInfo() < v) {
                previous = current;
                current = current.getLink();
            } else
                break;
        }

        if (previous == null) {
            newNode.setLink(m_first);
            m_first = newNode;
        } else {
            newNode.setLink(current);
            previous.setLink(newNode);
        }

    }
}
