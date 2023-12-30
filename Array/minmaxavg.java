public class minmaxavg {
     public static void main(String args[]) {
        int[] myArray = {23, 92, 56, 39, 93};
        int n=myArray.length;
        minmaxavg m = new minmaxavg();
        System.out.println("Maximum value in the array is::"+m.max(myArray));
        System.out.println("Minimum value in the array is::"+m.min(myArray)); 
        System.out.println("Average value in the array is::"+m.avg(myArray,n)); 
     }
     
    public int max(int [] array) {
        int max = 0;
        for(int i=0; i<array.length; i++ ) {
           if(array[i]>max) {
              max = array[i];
           }
        }
        return max;
     }
     public int min(int [] array) {
        int min = array[0];
       
        for(int i=0; i<array.length; i++ ) {
           if(array[i]<min) {
              min = array[i];
           }
        }
        return min;
      }

      public double avg(int [] array,int n) {
         double result= 0;
      
         for(int i=0; i<array.length; i++ ) {
           result+=array[i];
 
         }
         return result/n;
     
   }
}

//Time Complexity: O(M + N)
// Auxiliary Space: O(M + N)
// Here, M is the length of array a and N is the length of array b.

//predefined function
/*System.arraycopy(a, 0, c, 0, a1);
        System.arraycopy(b, 0, c, a1, b1);
  
        // prints the resultant array
        System.out.println(Arrays.toString(c));*/



