public class homwork {
    public static void main(String args []){
      




           // question 1 
        /*      int array[][]={{4,7,8},{8,8,7}};
        int countof7=0;
         for(int i=0;i<array.length;i++){
            for(int j=0; j<array[0].length;j++){
                if(array[i][j]== 7){
                    countof7++;
                }
            }
         }
         System.out.println("count of 7 is " + countof7);
 */

  

 // question 2

/*int nums[][]={{1,4,9},{11,6,3},{2,2,3}};

        int sum=0;
        // sum of second row elements;
        for(int j=0; j<nums[0].length;j++){
            sum+=nums[1][j];  //for add whole row of the matrix (+nums[1][j]+nums[2][j]);
        }
 
System.out.println("sum is " + sum);
*/




// question 3 transpose of matrix

   int row=2, column=3;
   int matrix[][]={{2,3,7},{5,6,7}};

   //display orginal matrix
   printmatrix(matrix);

   // transpose the matrix
   int transpose[][]= new int [column][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        //print transpose matrix
        printmatrix(transpose);
    }
    public static void printmatrix(int matrix[][]){
        System.out.println("the matrix is: ");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.err.println();
    }
}
}
