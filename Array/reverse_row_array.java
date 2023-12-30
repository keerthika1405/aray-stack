//1D array

public class reverse_row_array{
    public static void main(String[]args){
        int []arr={1,2,3,4,5,6,7};
                     
    int n=arr.length;
    int k=0,m=n-1;
        while(k<m){
            int temp=arr[k];
            arr[k]=arr[m];
            arr[m]=temp;
            k++;
            m--;
        }
        for(int b=0;b<n;b++)
        {
            System.out.print(arr[b]+" ");
        }     
    }
}
