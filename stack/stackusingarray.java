public class stackusingarray{
   

int size;
int arr[];
int topElement;
// constructor having size as parameter
stackusingarray(int size) {
    this.size = size;
    this.arr = new int[size];
    this.topElement = -1;
}


public int pop() // this method deletes an element from stack
{
if (!isEmpty()) { //no it is not empty
    int returnedtopElement = topElement;
    topElement--;
    System.out.println("Element Popped from Stack is :" + arr[returnedtopElement]);
    return arr[returnedtopElement];
} 
else {
    System.out.println("Stack is empty...");
    return -1;
}
}

public boolean isEmpty() {// this method checks stack is empt
    System.out.println("ietop"+topElement);
    return (topElement == -1);
}





// this method inserts an element on stack
public void push(int element) 
{
    if (!isStackFull()) {
        // System.out.println("before top"+topElement);
        topElement++;
        // System.out.println("after top"+topElement);
        arr[topElement] = element;
        System.out.println("Element Pushed on Stack is :" + element);
    }
    else {
        System.out.println ("Cannot insert Stack is full...");
    }
}
public boolean isStackFull() {
    // System.out.println("isfsize"+size); //10
    // System.out.println("isftop"+topElement);//-1
    return (size - 1 == topElement);
}



// this method returns topmost element from stack
public int peek() {
    if(!this.isEmpty())
        return arr[topElement];
    else
    {
        System.out.println("Stack is Empty1");
        return -1;
    }
}






public static void main(String[] args) 
{

    stackusingarray impl = new stackusingarray(10);
    impl.pop();
    System.out.println();

    impl.push(210);
    impl.push(310);
    impl.push(50);
    impl.push(400);
    impl.push(410);
    impl.push(610);
    impl.push(70);
    impl.push(4);
    impl.push(1);
    impl.push(20);

     System.out.println();
    impl.push(21);
    System.out.println();

    impl.pop();
    impl.pop();
    impl.pop();
    impl.pop();
    System.out.println();
}
   }
   


