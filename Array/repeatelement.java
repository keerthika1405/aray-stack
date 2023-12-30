public class repeatelement {
    public static int findRepeatingElement(int arr[], int n){
        int cnt = 0;
	
        int[] dup= new int[n];
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j])
                 dup[cnt++] = arr[i];
            }
        }
        for(int i=0;i<cnt;i++) {
        if(dup[i] != dup[i+1]) {
        System.out.println(dup[i]+" ");
}   
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2 , 3 ,3, 4 , 4,5,6,6};
        int n = arr.length;
         findRepeatingElement(arr, n);

}
}
