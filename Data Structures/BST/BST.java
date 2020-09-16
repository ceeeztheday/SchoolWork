
// The BST class that represents binary search trees
import java.util.*;

public class BST {
   // instance variables
   private BSTNode m_root;
   private int m_size;

   // constructor
   public BST() {
      m_root = null;
      m_size = 0;
   }

   // add a value into the tree
   public void add(int v) {
      // TODO: implement this method using a non-recursive solution
      BSTNode node = new BSTNode(v);
      if (m_root == null) {
         m_root = node;
         m_size++;
         return;
      }
      BSTNode current = m_root;
      BSTNode parent = null;

      while (current != null) {
         if (v == current.getInfo())
            return;

         parent = current;

         if (v < current.getInfo())
            current = current.getLeft();
         else
            current = current.getRight();
      }
      if (v < parent.getInfo())
         parent.setLeft(node);
      else
         parent.setRight(node);

      m_size++;
   }

   // print the tree content using in-order traveral
   public void inOrder() {
      // TODO: implement this method using a non-recursive solution
      if (m_root == null)
         return;

      Stack<BSTNode> stack = new Stack<BSTNode>();
      BSTNode current = m_root;

      while (true) {
         if (current != null) {
            stack.push(current);
            current = current.getLeft();
         } else {
            if (stack.isEmpty())
               break;

            current = stack.pop();
            System.out.print(current.getInfo() + " ");
            current = current.getRight();
         }
      }
   }

   // get the size of the tree
   public int size() {
      return m_size;
   }

   // empty the tree
   public void clear() {
      m_root = null;
      m_size = 0;
   }
}
