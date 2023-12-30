import java.util.Stack;

public class infixtopostfix
{
 
public static int precedence(char ch)
    {
    if(ch=='+' || ch=='-')
    return 1;
    
    else if(ch=='*' || ch=='/')
    return 2;                       // * and / divide have higher precedence.
      return 0;
    }
    
public static String convertToPostfix(String exp)
    {
    Stack<Character> operators = new Stack<>();
    Stack<String> postFix = new Stack<>();
    
    for(int i=0;i<exp.length();i++)
    {
      char ch=exp.charAt(i);         // current character.
      System.out.println("ch"+ch);
    
      if(ch=='('){
          operators.push(ch);
         System.out.println("("+ch);}
         
    
      else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
          postFix.push(ch+"");
                System.out.println("azAZ"+ch);  
                }

           
    
      else if(ch==')')
          {
          while(operators.peek()!= '(')
          {
            // STEP 5 of Algorithm.    
             System.out.println("operators"+operators);
            char op = operators.pop();
            System.out.println("op"+op);
        
            String first = postFix.pop(); 
             System.out.println("first"+first);         // get the two operands.
            String second = postFix.pop();
            System.out.println("second"+second);   
        
            String new_postFix = second+first+op;  // add them in reverse order.
             System.out.println("new_postfix"+new_postFix);
        
            postFix.push(new_postFix);     // push the result to postFix stack again.
              System.out.println("postfix"+postFix);
          }
        
          operators.pop(); 
           System.out.println("oppopp"+operators);
              // pop '(' from stack.   
          }
    
// We do the same thing if we get an operator as the current character.
    
      else if(ch=='+' || ch=='-' || ch== '*' || ch== '/')
          {
            System.out.println("operators1"+operators);
               System.out.println("postfix"+postFix);  
                // System.out.println("oppeek"+operators.peek());
                // System.out.println("precedence"+precedence(ch));
                // System.out.println("precedenceppekl"+precedence(operators.peek()));
          // check precedence of each operator with top of the stack and process them.
          while(operators.size()>0 && operators.peek()!='(' && precedence(ch) <= precedence(operators.peek()))
          {
          char op = operators.pop();
        
          String first = postFix.pop();
           System.out.println("first1"+first);  
          String second = postFix.pop();
            System.out.println("second1"+second);   
        
          String new_postFix = second+first+op;
             System.out.println("new_postfix1"+new_postFix);
          postFix.push(new_postFix);
          }
          operators.push(ch);
          }
    }//once iteration is completed moving to while loop in below
    
// If the operator stack still has some elements in it process them too Repeat Step 5.
    while(operators.size()>0)
        {
          char op = operators.pop();
           System.out.println("oppopp1"+op);
        
          String first = postFix.pop();
           System.out.println("first3"+first);  
          String second = postFix.pop();
            System.out.println("second3"+second);
        
          String new_postFix = second+first+op;
               System.out.println("new_postfix3"+new_postFix);
        
          postFix.push(new_postFix);
          }
        
          return postFix.pop();         // return resultant Postfix.
}
 
public static void main(String args[])
{
 
  // String infixExpression = "A*(B-C)/D+E"; // We pass Uppercase Infix
  String infixExpression = "A/(B-C)+D*E";
  System.out.println("The Infix Expression is: "+infixExpression);
  String result = convertToPostfix(infixExpression);
  System.out.println("The Postfix of the given Infix Expression is: "+result);
 
  System.out.println();
 
 
  // infixExpression = "a*(b-c+d)/e"; //We also check for Lowercase Infix
  // System.out.println("The Infix Expression is: "+infixExpression);
  // result = convertToPostfix(infixExpression);
  // System.out.println("The Postfix of the given Infix Expression is: "+result);
 
}
}