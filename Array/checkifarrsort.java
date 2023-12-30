public class checkifarrsort {
     public static void main(String[] args)
    {
        int arr[] = {20,23,23,45,78,88};//asc
        int arr1[]= {88,78,45,23,23,20};//des
        int n = arr.length;
        int m=arr1.length;

        if (ascsortornot(arr, n)!= 0){ // Function Call
            System.out.print(" arr, Yes the array is sorted in ascending");}
        else{
            System.out.print("arr, No the array is not  sorted in ascending");}

         System.out.println();

        if (descsortornot(arr1, m)!= 0)// Function Call
            System.out.print( " arr1 ,Yes the array is sorted in descending");
        else
            System.out.print(" arr1, No the array is not  sorted in ascending");
    }
    
     static int ascsortornot(int a[], int n)
    {
        if (n == 1 || n == 0){ // base case
            return 1;}
             
        if (a[n - 1] < a[n - 2]){
        return 0;}

        return ascsortornot(a, n - 1);
        }
      
    static int descsortornot(int b[], int m)
    {
        if (m == 1 || m == 0) {// base case
            return 1;}
       if (b[m - 1] > b[m - 2]){
        return 0;
       }
        
        return  descsortornot(b, m - 1);
    }
}
