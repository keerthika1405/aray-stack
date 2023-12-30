/*A peak element is that number in the given array which is greater than its neighboring elements. And for an end 
element to be the peak element it just needs to be greater than the element before or after it.*/
class peakneightbour{
    public static void main(String[] args) {
        int[] arr={10,200,2,2,23,90,100,67};
        int n=arr.length;
        System.out.println("The peak point is "+arr[findPeakUtil(arr,0,n-1,n)]);
    }
    private static int findPeakUtil(int[] arr,int low,int high,int n){
        
        int mid=low+(high-low)/2;
        System.out.println("mid value from list is : "+mid);

        //Compare middle element with its neighbours
        if((mid==0 || arr[mid-1]<=arr[mid]) && (mid==n-1 || arr[mid+1]<=arr[mid]))
            return mid;

        // If middle element is not peak and its
        // left neighbour is greater than it,
        // then left half must have a peak element
        else if(mid>0 && arr[mid-1]>arr[mid])
            return findPeakUtil(arr,low,(mid-1),n);
        // Similarly,if the middle element is not the peak and
        // its right side element is greater than it,
        // then right half must have a peak
        else
            return findPeakUtil(arr,(mid+1),high,n);
    }

    
    
    }
