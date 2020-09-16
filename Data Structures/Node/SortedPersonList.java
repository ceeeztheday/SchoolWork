// The SortedPersonList class
// Cesar Arroyo Jr

public class SortedPersonList 
{
    // instance variables
    private PersonNode m_first;
    private int m_numElements; 

    // constructor
    // Do not make any changes to this method!
    public SortedPersonList()
    {
        m_first = null;
        m_numElements = 0;
    }

    // check whether the list is empty
    // Do not make any changes to this method!
    boolean isEmpty()
    {
        if (m_first == null)
            return true;
        else
            return false;
    }

    // return the size of the list (# of Person nodes)
    // Do not make any changes to this method!
    public int size()
    {
        return m_numElements;
    }

    // check whether a PersonNode associated with the given ID is in the list
    public boolean contains(int ID)
    {
        // TODO: implement this method
        PersonNode current = m_first;
        
        while(current != null)
        {
            if(current.getID() == ID)
               return true;
            else
               current = current.getLink();
        }
        

        return false; // replace this statement with your own return
    }

    // search for and return the PersonNode associated with the given ID
    public PersonNode get(int ID)
    {
        // TODO: implement this method
        PersonNode current = m_first;
        
        while(current != null)
        {
            if(ID == current.getID())
               return current;
            else
               current = current.getLink();
        }

        return current; // replace this statement with your own return
    }

    // add a new PersonNode to the list with the given ID and name
    public boolean add(int ID, String name)
    {
        // TODO: implement this method
        PersonNode newNode = new PersonNode(ID, name); // create a new node with the given value        
        PersonNode current = m_first;       // set up a temporary reference to iterate over the list      
        PersonNode previous = null;         // set up a reference that allows the access to the previous node
        boolean Add = false;
        
        while (current != null)
        {    
            // compare the new value with the value of each node
            if (current.getID() < ID)
            {   
                previous = current;
                current = current.getLink();
            }
            else if(current.getID() == ID)
               return false;
            else
                break;
        }
        
        if (previous == null)
        {
            newNode.setLink(m_first);
            m_first = newNode;
            m_numElements++;
            Add = true;
        }
        else
        {
            newNode.setLink(current);       
            previous.setLink(newNode);
            m_numElements++;
            Add = true;
        }
        
        return Add; // replace this statement with your own return
    }

    // remove a PersonNode associated with the given ID from the list
    public boolean remove(int ID)
    {
        // TODO: implement this method
        PersonNode current = m_first;
        PersonNode previous = null;
        boolean Remove = false;
        
        while (current != null)
        {
            // compare the given value with the value of each node
            if (current.getID() < ID)
            {
                previous = current;
                current = current.getLink();                
            }
            else if (current.getID() == ID)
            {
                Remove = true;
                current = current.getLink();
                m_numElements--;
                
                if (previous == null)
                    m_first = current;
                else
                    previous.setLink(current);
            }
            else
                return Remove;
        }
        return Remove; // replace this statement with your own return
    }
    
    // return a string representation of the list
    // Do not make any changes to this method!
    public String toString()
    {
        String listContent = "";
        PersonNode current = m_first;
        
        while (current != null)
        {
            listContent += "[" + current.getID() + " | " + current.getName() + "] ";
            current = current.getLink();
        }

        return listContent;
    }    
}