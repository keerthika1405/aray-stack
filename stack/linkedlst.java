import java.util.*;
public class linkedlst{
    public static void main(String[]args){
        //better to use addfirst and removefirst
        LinkedList<Integer> Stack=new LinkedList<>();
        //add
        Stack.push(10);
        Stack.push(20);
        Stack.push(30);
        Stack.push(40);
        Stack.push(50);
        System.out.println(Stack);

        Stack.push(200);
        System.out.println(Stack);
        //addfirst
        Stack.addFirst(100);
        System.out.println(Stack);
        //remove
        System.out.println(Stack.remove());
        System.out.println(Stack);
        //removefirst
        System.out.println(Stack.removeFirst()); 
        System.out.println(Stack.removeFirst());
        System.out.println(Stack);
        //here below adding and removing at last in stack take iteration ,so it traverse to last element to add or remove an element
        //(bit expense ) when compare to adding or removing at first
        System.out.println(Stack.removeLast());
        System.out.println(Stack);

        Stack.addLast(100);
        System.out.println(Stack);

    }
}