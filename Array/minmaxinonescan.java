public class minmaxinonescan {
    public static void main(String[]args){
        int []arr={2,5,1,3,6,4};
        int n=arr.length;
        findMinMax(arr,n);
    }
    public static void findMinMax(int a[], int n) {
        int min = a[0];
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
                // System.out.println("min: "+min);
            }
            else if (a[i] > max) {
                max = a[i];
                // System.out.println("a[i]"+a[i]);
                //  System.out.println("max: "+max);
            }  
        }
        System.out.println(min);
        System.out.println(max);
    }
}
