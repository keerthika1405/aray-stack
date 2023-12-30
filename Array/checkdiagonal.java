/* //Calculates number of rows and columns present in given matrix    
          rows = a.length;    
          cols = a[0].length;     */

public class checkdiagonal {
    public static void main(String[] args) {
        int[][] inputMatrix = {{1, 0, 1}, {0, 5, 0}, {0, 0, 7}};
      //   int n=inputMatrix.length;
      //   int m=inputMatrix[0].length;

         // System.out.println(n);
         //  System.out.println(m);
   
        boolean checkDiagonal = true;
        if (inputMatrix.length != inputMatrix[0].length) { //3!=3
           checkDiagonal = false;
        }
         else {
           for (int i = 0; i < inputMatrix.length; i++) {
              for (int j = 0; j < inputMatrix[0].length; j++) {

                 if (i != j && inputMatrix[i][j] != 0) { //fifferent index  and different value means false and break
                    checkDiagonal = false;
                    break;
                 }
              }
              if (!checkDiagonal) {
                 break;
              }
           }
        }
        if (checkDiagonal) {
           System.out.println("The matrix is a diagonal matrix");
        } else {
           System.out.println("The matrix is not a diagonal matrix");
        }
    } 
}
