class findingduplicate{
    public static void main(String[] args) {      
        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
        int n=arr.length;     
        for(int i = 0; i <n; i++) {  //onetime
            for(int j = i + 1; j < n; j++) { //traverse except i
                System.out.println("arr[i]"+arr[i]);
                System.out.println("arr[j]"+arr[j]); 
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
}