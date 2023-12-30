import java.util.ArrayList;
import java.util.List;

class pairandsum{
    static int[] FindPair(List<Integer> A, int K)
    {
        // int array to store answer
        int[] ans = new int[2];
 
        // iterating over array
        for (int i = 0; i < A.size() - 1; i++) {
            for (int j = i + 1; j < A.size(); j++) {
                // if found such pair
                if (A.get(i) + A.get(j) == K) {
                    ans[0] = i;
                    ans[1] = j;
                    // returning answer
                    return ans;
                }
            }
        }
        return new int[] { -1, -1 };
    }
    public static void main(String[] args)
    {
        List<Integer> A = new ArrayList<>();
        A.add(-49);
        A.add(75);
        A.add(103);
        A.add(-147);
        A.add(164);
        A.add(-197);
        A.add(-238);
        A.add(314);
        A.add(348);
        A.add(-422);
        int K = 167;
        int[] result = FindPair(A, K);
        System.out.println(result[0] + " " + result[1]);
    }
}
//o(n2)

//go with base_case
// class IndexPair {
//     int index_1, index_2;
// }
 
// class GFG {
     
//     // Function to find positive and
//     // Negative pairs
//     static IndexPair findPositiveNegativePairs(
//         final List<Integer> arr, final int k)
//     {
         
//         // result.index_1 for positive number &
//         // result.index_2 for negative number
//         final IndexPair result = new IndexPair();
//         result.index_1 = arr.size() - 1;
//         result.index_2 = arr.size() - 1;
         
//         // Find the last positive or zero number
//         while (result.index_1 >= 0
//                && arr.get(result.index_1) < 0) {
//             --result.index_1;
//         }
         
//         // Find the last negative number
//         while (result.index_2 >= 0
//                && arr.get(result.index_2) >= 0) {
//             --result.index_2;
//         }
         
//         // Loop to find the pair with
//         // Desired Sum
//         while (result.index_1 >= 0
//                && result.index_2 >= 0) {
//             // Condition if the current index pair
//         // have the desired sum
//             if (arr.get(result.index_1)
//                     + arr.get(result.index_2)
//                 == k) {
//                 return result;
//             }
             
//         // Condition if the current index pairs
//          // sum is greater than desired sum
//             else if (arr.get(result.index_1)
//                          + arr.get(result.index_2)
//                      > k) {
                 
//             // Loop to find the next
//             // negative element from last
//                 do {
//                     --result.index_1;
//                 } while (result.index_1 >= 0
//                          && arr.get(result.index_1) < 0);
//             }
             
//         // Condition if the current index pairs
//         // sum is less than desired sum
//             else {
             
//             // Loop to find the next
//             // positive or zero number from last
//                 do {
//                     --result.index_2;
//                 } while (result.index_2 >= 0
//                          && arr.get(result.index_2) >= 0);
//             }
//         }
//         return new IndexPair();
//     }
     
     
// // Function to find positive-positive number
// // pairs or negative-negative number pairs
//     static IndexPair findPairsOfSameSign(
//         final List<Integer> arr, final int k)
//     {
     
     
//     // Initializing the index pairs with
//     // 0 and the end of array length - 1
//         final IndexPair result = new IndexPair();
//         result.index_1 = 0;
//         result.index_2 = arr.size() - 1;
//     // Loop to find the first positive or negative
//     // number in the array according to the given
//     // comparison template function
//         while (result.index_1 < result.index_2
//                && arr.get(result.index_1) < 0) {
//             ++result.index_1;
//         }
     
//      // Loop to find the last positive or negative
//     // number in the array according to the given
//     // comparison template function
//         while (result.index_1 < result.index_2
//                && arr.get(result.index_2) >= 0) {
//             --result.index_2;
//         }
     
//     // Loop to find the desired pairs
//         while (result.index_1 < result.index_2) {
//             // Condition if the current index pair
//             // have the desired sum
//             if (arr.get(result.index_1)
//                     + arr.get(result.index_2)
//                 == k) {
//                 return result;
//             }
             
//             // Condition if the current index pair
//             // is greater than or equal to the desired
//             // sum according to the compare function
//             else if (arr.get(result.index_1)
//                          + arr.get(result.index_2)
//                      > k) {
                 
//             // Loop to find the next positive-positive
//             // or negative-negative pairs
//                 do {
//                     ++result.index_1;
//                 } while (result.index_1 < result.index_2
//                          && arr.get(result.index_1) < 0);
//             }
         
//          // Condition if the current index pair is
//         // greater than or equal to the desired
//         // sum according to the compare function
//             else {
//                  // Loop to find the next positive-positive
//                 // or negative-negative pairs
//                 do {
//                     --result.index_2;
//                 } while (result.index_1 < result.index_2
//                          && arr.get(result.index_2) >= 0);
//             }
//         }
//         return new IndexPair();
//     }
     
//     // Function to find the pairs whose sum
//     // is equal to the given desired sum K
//     static IndexPair FindPairs(final List<Integer> arr, final int k)
//     {
         
//         // Find the positive-negative pairs
//         final IndexPair result = findPositiveNegativePairs(arr, k);
         
//          // Condition to check if positive-negative
//         // pairs not found in the array
//         if (result.index_1 == -1
//             && result.index_2 == -1) {
 
//             return k >= 0
//                        ? findPairsOfSameSign(
//                              arr, k)
//                        : findPairsOfSameSign(
//                              arr, k);
//         }
//         return result;
//     }
     
//     // Driver Code
//     public static void main(String[] args) {
//         List<Integer> A = new ArrayList<>();
//         A.add(-49);
//         A.add(75);
//         A.add(103);
//         A.add(-147);
//         A.add(164);
//         A.add(-197);
//         A.add(-238);
//         A.add(314);
//         A.add(348);
//         A.add(-422);
//         int K = 167;
//         IndexPair result = FindPairs(A, K);
//         System.out.println(result.index_2 + " " + result.index_1);
//     }