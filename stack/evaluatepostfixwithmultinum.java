import java.util.Stack;

public class evaluatepostfixwithmultinum {
  
     
    // Method to evaluate value of a postfix expression
    static int evaluatePostfix(String exp)
    {
        // Create a stack
        Stack<Integer> stack = new Stack<>();
 
        // Scan all characters one by one
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
             System.out.println("c1"+c);
            // System.out.println(stack);

            if (c == ' ')
                continue;
 
            // If the scanned character is an operand
            // (number here),extract the number
            // Push it to the stack.
            else if (Character.isDigit(c)) {
                int n = 0;
 
                // Extract the characters and store it in num
                while (Character.isDigit(c)) {
                    n = n * 10 + (int)(c - '0');
                    // System.out.println("n"+n);
                    i++;
                    c = exp.charAt(i);
                    //  System.out.println("c"+c);
                }
                i--;
 
                // Push the number in stack
                // System.out.println("push"+ stack.push(n));
                stack.push(n);
            }
 
            // If the scanned character is an operator, pop
            // two elements from stack apply the operator
            else {
                int val1 = stack.pop();
                int val2 = stack.pop();
 
                switch (c) {
                case '+':
                    stack.push(val2 + val1);
                    break;
                case '-':
                    stack.push(val2 - val1);
                    break;
                case '/':
                    stack.push(val2 / val1);
                    break;
                case '*':
                    stack.push(val2 * val1);
                    break;
                }
            }
        }
        return stack.pop();
    }
 
    // Driver program to test above functions
    public static void main(String[] args)
    {
        String exp = "100 200 + 2 / 5 * 7 +";
       
        // Function call
        System.out.println(evaluatePostfix(exp));
    }
}
    

