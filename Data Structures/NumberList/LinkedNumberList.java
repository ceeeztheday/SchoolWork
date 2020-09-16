// The linked list based impelmentation for the NumberList ADT
public class LinkedNumberList implements NumberList {
    // instance variables
    private LNode m_first;
    private LNode m_last;

    // constructor
    public LinkedNumberList() {
        m_first = null;
    }

    // insert a number into the list
    public void insert(int v) {
        // insertion at the front
        LNode newNode = new LNode(v);
        newNode.setLink(m_first);
        m_first = newNode;

        // insertion at the end of the list
        /*
         * LNode newNode = new LNode(v); if (m_first == null) m_first = m_last =
         * newNode; else { m_last.setLink(newNode); m_last = newNode; }
         */
    }

    // check whether the list is full
    public boolean isFull() {
        return false;
    }

    // check whether a given number is in the list
    public boolean contains(int v) {
        LNode current = m_first;

        while (current != null) {
            if (current.getInfo() == v)
                return true;
            else
                current = current.getLink();
        }

        return false;
    }

    // return a string representation of the list
    @Override
    public String toString() {
        String listContent = "The content of the list is ";
        LNode current = m_first;

        while (current != null) {
            listContent += current.getInfo() + " ";
            current = current.getLink();
        }

        return listContent;
    }
}
