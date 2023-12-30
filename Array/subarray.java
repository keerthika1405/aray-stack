
public class subarray{
    public static void main(String[]args){
        int []arr={1,2,3,4,5};
        int n=arr.length;
        for(int si=0;si<n;si++){
            for(int ei=si;ei<n;ei++){
                for(int k=si;k<=ei;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}