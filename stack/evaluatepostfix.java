import java.util.Stack;

public class evaluatepostfix {
     
    static int evaluatePostfix(String exp)
    {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) 
        {
            char ch = exp.charAt(i);
            System.out.println(ch);

            //    System.out.println("stack"+stack);
          
            if (Character.isDigit(ch))
                stack.push(ch - '0');
// isDigit(char ch) is an inbuilt method in java which determines whether a specified character is a digit or not.
 
            //  If the scanned character is an operator, pop
            //  two elements from stack apply the operator
            else {
                int val1 = stack.pop();
                //  System.out.println("val1"+val1);
                int val2 = stack.pop();
                // System.out.println("val2"+val2);
 
                switch (ch) {
                case '+':
                    stack.push(val2 + val1);
                    //  System.out.println("+"+stack.push(val2 + val1));

                    break;
                case '-':
                    stack.push(val2 - val1);
                    //   System.out.println("-"+stack.push(val2 - val1));
                    break;
                case '/':
                    stack.push(val2 / val1);
                    //    System.out.println("/"+stack.push(val2 / val1));
                    break;
                case '*':
                    stack.push(val2 * val1);
                    // System.out.println("*"+stack.push(val2 * val1));
                    break;
                }
            }
        }
        // System.out.println("return"+stack.pop());
        return stack.pop();
    }
 
    // Driver code
public static void main(String[] args)
    {
        String exp = "231*+9-";
        System.out.println("postfix evaluation: " + evaluatePostfix(exp));
    }
}






















// Contributed by Sumit Ghosh
// Output
// postfix evaluation: -4
// Time Complexity: O(N) 
// Auxiliary Space: O(N)

// There are the following limitations of the above implementation. 
// It supports only 4 binary operators ‘+’, ‘*’, ‘-‘ and ‘/’. It can be extended for more operators by adding more switch cases. 
// The allowed operands are only single-digit operands.
// Postfix evaluation for multi-digit numbers:
// The above program can be extended for multiple digits by adding a separator-like space between all elements (operators and operands) of the given expression. 

// Below given is the extended program which allows operands to have multiple digits. 


// Java program to evaluate value of a postfix
// expression having multiple digit operands
// import java.util.Stack;
 
// class Test1 {
     
//     // Method to evaluate value of a postfix expression
//     static int evaluatePostfix(String exp)
//     {
//         // Create a stack
//         Stack<Integer> stack = new Stack<>();
 
//         // Scan all characters one by one
//         for (int i = 0; i < exp.length(); i++) {
//             char c = exp.charAt(i);
 
//             if (c == ' ')
//                 continue;
 
//             // If the scanned character is an operand
//             // (number here),extract the number
//             // Push it to the stack.
//             else if (Character.isDigit(c)) {
//                 int n = 0;
 
//                 // Extract the characters and store it in num
//                 while (Character.isDigit(c)) {
//                     n = n * 10 + (int)(c - '0');
//                     i++;
//                     c = exp.charAt(i);
//                 }
//                 i--;
 
//                 // Push the number in stack
//                 stack.push(n);
//             }
 
//             // If the scanned character is an operator, pop
//             // two elements from stack apply the operator
//             else {
//                 int val1 = stack.pop();
//                 int val2 = stack.pop();
 
//                 switch (c) {
//                 case '+':
//                     stack.push(val2 + val1);
//                     break;
//                 case '-':
//                     stack.push(val2 - val1);
//                     break;
//                 case '/':
//                     stack.push(val2 / val1);
//                     break;
//                 case '*':
//                     stack.push(val2 * val1);
//                     break;
//                 }
//             }
//         }
//         return stack.pop();
//     }
 
//     // Driver program to test above functions
//     public static void main(String[] args)
//     {
//         String exp = "100 200 + 2 / 5 * 7 +";
       
//         // Function call
//         System.out.println(evaluatePostfix(exp));
//     }
// }
    

