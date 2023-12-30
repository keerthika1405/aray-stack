public class delete {
    static int findElement(int array[], int n, int key)  
    {  

        for (int i = 0; i < n; i++)  
            if (array[i] == key)  //position?
                return i;  
        return -1;  
    }  
    static int deleteElement(int array[], int n, int key)  
    {  
        int pos = findElement(array, n, key);  
  
        if (pos == -1) {  
            System.out.print("Element not found");  //base case
            return n;  
        }  

        for (int i = pos; i < n - 1; i++)  //shift value from righttoleft
            array[i] = array[i + 1];  
  
        return n - 1;  
    }  
    public static void main(String args[])  
    {  
     
        int array[] = { 20, 60, 10, 50, 30 };  
  
        int n = array.length;  
        int key = 40;  
  
        System.out.println("Array before deletion");  
        for (int i = 0; i < n; i++)  
            System.out.print(array[i] + " ");  
          
        n = deleteElement(array, n, key);  
  
        System.out.println("\n\nArray after deletion");  
        for (int i = 0; i < n; i++)  
            System.out.print(array[i] + " ");  
    }  
    
}
