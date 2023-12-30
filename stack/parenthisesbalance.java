// import java.util.ArrayDeque;
// import java.util.Deque;
import java.util.Stack;

public class parenthisesbalance {

    public static void main(String[] args) {
        String exp = "({[]})";
        System.out.println(isBalanced(exp));
    }
    // Function to check whether given expression is balanced or not
    public static boolean isBalanced(String exp) {
        Stack<Character> st = new Stack<>();
        
        // Traverse over the expression
        for(int i = 0; i < exp.length(); i++)
        {
            char ch = exp.charAt(i);// Get the current character 
            
            // If the stack is empty, push the current character into the stack
            if(st.isEmpty()){
                st.push(ch);
                System.out.println(ch);
            }
            
            // Otherwise if the current character is a closing bracket 
            // and of the top of the stack contains an opening bracket of the same type
            // then remove the top of the stack
            else if((ch==')' && st.peek() == '(')||(ch=='}' && st.peek() == '{')||(ch==']' && st.peek() == '[')){
                st.pop();
            }
            else{
                System.out.println(ch);
                st.push(ch);
            }      
        }
        
        // If after traversing the whole expression the stack is empty then it means the given expression is balanced
        // else unbalanced
        return (st.isEmpty());
    }
   
 
    
//     static boolean areBracketsBalanced(String expr)// function to check if brackets are balanced
//     {
        
//         Deque<Character> stack= new ArrayDeque<Character>();// Using ArrayDeque is faster than using Stack class
 
//         // Traversing the Expression
//         for (int i = 0; i < expr.length(); i++) {
//             char x = expr.charAt(i);
 
//             if (x == '(' || x == '[' || x == '{') {    // Push the element in the stack
//                 stack.push(x);
//                 continue;
//             }
 
//             // If current character is not opening bracket
//             // then it must be closing. So stack cannot be empty at this point.
//             if (stack.isEmpty())
//                 return false;

//             char check;
//             switch (x) {
//             case ')':
//                 check = stack.pop();
//                 if (check == '{' || check == '[')
//                     return false;
//                 break;
 
//             case '}':
//                 check = stack.pop();
//                 if (check == '(' || check == '[')
//                     return false;
//                 break;
 
//             case ']':
//                 check = stack.pop();
//                 if (check == '(' || check == '{')
//                     return false;
//                 break;
//             }
//         }
 
//         // Check Empty Stack
//         return (stack.isEmpty());
//     }
 
//     // Driver code
// public static void main(String[] args)
//     {
//         String expr = "([{}])";
 
//         // Function call
//         if (areBracketsBalanced(expr))
//             System.out.println("Balanced ");
//         else
//             System.out.println("Not Balanced ");
//     }
}
    

