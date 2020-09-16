// The GNode class that represents graph nodes
public class GNode {
    // instance variables
    protected int index;
    protected String data;
    protected boolean visited;
    protected GNode link;

    // constructor
    public GNode(int initIndex, String initData) {
        index = initIndex;
        data = initData;
        visited = false;
        link = null;
    }

    // copy constructor
    public GNode(GNode o) {
        index = o.index;
        data = o.data;
        visited = false;
        link = null;
    }
}
