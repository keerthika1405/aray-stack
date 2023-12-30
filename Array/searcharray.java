 public class searcharray {
//     public static void main(String[] args)
//     {
//     int[] arr = new int[20];
//     arr[0] = 12;
//     arr[1] = 16;
//     arr[2] = 20;
//     arr[3] = 40;
//     arr[4] = 50;
//     arr[5] = 70;
//     int capacity = 20;
//     int n = 19;
//     int i, key = 26;

//     System.out.print("Before Insertion: ");
//     for (i = 0; i < n; i++)
//     System.out.print(arr[i] + " ");

//     n = insert(arr, n, key, capacity);

//     System.out.print("\n After Insertion: ");
//     for (i = 0; i < n; i++)
//     System.out.print(arr[i] + " ");
//     }

//     static int insert(int arr[], int n, int key,int capacity)
//     {
//     if (n >= capacity)
//     return n;

//     arr[n] = key;

//     return (n + 1);
//     }

//}
  static int findElement(int array[], int n, int key)  
    {  
        for (int i = 0; i < n; i++)  
            if (array[i] == key)  
                return i;  
        return -1;  
    }  
    public static void main(String args[])  
    {  
        int array[] = { 22, 24, 30, 16, 35 };  
        int n = array.length;  
        int key = 16;  
        int position = findElement(array, n, key);  
        if (position == -1)  
            System.out.println("Element not found");  
        else  
            System.out.println("Element Found at Position: "  
                            + (position + 1));  //programmer view
    }  
}