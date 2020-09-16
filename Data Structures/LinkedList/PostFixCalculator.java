
// The PostFixCalculator class that implements a postfix expression calculator
import java.util.Scanner;

public class PostFixCalculator {
   // instance variable
   String m_postfix;

   // constructor
   public PostFixCalculator() {
      m_postfix = "";
   }

   // mutator
   public void setPostfix(String postfix) {
      m_postfix = postfix;
   }

   // evaluate the postfix expression saved in m_postfix
   public int calculate() {
      Scanner tokenizer;
      int result = -1; // This is only an initial value. You will need to update it to the correct
                       // value.
      int operand1, operand2, value;
      String operator;
      NumberStack myStack = new ArrayNumberStack(100);

      tokenizer = new Scanner(m_postfix);

      // TODO: complete this method
      while (tokenizer.hasNext()) {
         if (tokenizer.hasNextInt()) {
            // Stack processes operands in push method
            value = tokenizer.nextInt();
            myStack.push(value);
         } else {
            // Operator being processed
            operator = tokenizer.next();

            // Checks for cases on unrecognized operators
            if (!(operator.equals("/") || operator.equals("*") || operator.equals("+") || operator.equals("-"))) {
               String err = "Unrecognized operator: " + operator;
               throw new RuntimeException(err);
            }
            // Pops the second operand from stack to perform equation
            if (myStack.isEmpty())
               throw new RuntimeException("Not enough operands");
            operand2 = myStack.top();
            myStack.pop();

            // Pops the first operand from stack to perform equation
            if (myStack.isEmpty())
               throw new RuntimeException("Not enough operands");
            operand1 = myStack.top();
            myStack.pop();

            // Performing the math
            if (operator.equals("/"))
               result = operand1 / operand2;
            else if (operator.equals("*"))
               result = operand1 * operand2;
            else if (operator.equals("+"))
               result = operand1 + operand2;
            else if (operator.equals("-"))
               result = operand1 - operand2;

            // Result is pushed onto Stack
            myStack.push(result);

         } // closes else
      } // closes while

      // Final result popped from stack
      if (myStack.isEmpty())
         throw new RuntimeException("Not enough operands");
      result = myStack.top();
      myStack.pop();

      // At this point Stack should be empty
      if (!myStack.isEmpty())
         throw new RuntimeException("Too many operands");

      return result;
   }
}