public class insertarray {
    public static void main(String[] args)  
    {  
        int array[] = new int[15];  
        array[0] = 1;  
        array[1] = 3;  
        array[2] = 5;  
        array[3] = 7;  
        array[4] = 4;  
        int n = 5;  //capacity
        int x =9, pos = 2;  //x-->value  | pos-->index
  
        System.out.print("Before Insertion: ");  
        for (int i = 0; i < n; i++)  
            System.out.print(array[i] + " ");  
  
        insertElement(array, n, x, pos);  
        n += 1; //main 
             
        System.out.print("\n\nAfter Insertion: ");  
        for (int i = 0; i < n; i++)  
           System.out.print(array[i] + " ");  
    } 
    static void insertElement(int array[], int n, int x,  int pos)  
    {  
        for (int i = n - 1; i >= pos; i--)//main-->shifting from righttoleft
        array[i + 1] = array[i];  
        array[pos] = x;   
         
    }
    } 
    

