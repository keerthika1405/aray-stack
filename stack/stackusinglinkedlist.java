/*Underflow happens when we try to pop an item from an empty stack.
 Overflow happens when we try to push more items on a stack than it can hold. */
 /*Dynamic data structure - The size of the linked list may vary according to the requirements
  Linked list does not have a fixed size */

class stack{

    class Node 
    {
        int data;
        Node next; 
    }

    Node top;
    stack()  // Constructor
    { 
        this.top = null; 
    }  

    public void push(int x)
    {
        Node temp = new Node();

        temp.data = x; // initialize data into temp data field
        //  System.out.println( temp.data );
        temp.next = top;// put top reference into temp next
        //  System.out.println(temp.next);
        top = temp;  // update top reference
        //  System.out.println(top.data);
    }


    public void display()
    {
        if (top == null) {// check for stack underflow
            System.out.println("\nStack Underflow");
            return ;
        }
        else {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data);// print node data
                // System.out.println("\n"+temp.next.data);
                temp = temp.next; // assign temp next to temp
                 if(temp != null)
                    System.out.print(" -> ");
                
            }
        }
    }

    public int peek()
    {
        if (!isEmpty()) {// check for empty stack
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }
     public boolean isEmpty() 
     {
        return top == null;
    }



    public void pop() // remove at the beginning
    {
      
        if (top == null) {  // check for stack underflow
            System.out.print("\nStack Underflow");
            return;
        }
        top = (top).next; // update** the top pointer to point to the next node
    }
}

public class stackusinglinkedlist {
    public static void main(String[]args){
       //add at last and remove at last
    stack st=new stack() ; // Constructor
       st.push(10);
       st.push(20);
       st.push(30);
       st.push(40);
       st.push(50);
       st.push(60);

       st.display();

       System.out.println("\n peek "+st.peek());

       st.pop();
       st.pop();

       st.display();

       System.out.println("\n peek "+st.peek());
        }
    }

















    //    System.out.println(st);
       //size
    //    System.out.println(st.size());
       //peek
    //    System.out.println(st.peek());
       //remove
    //    st.pop();
    //    st.push(60);
    //    System.out.println(st);
   

 
        

 
   
 
    

