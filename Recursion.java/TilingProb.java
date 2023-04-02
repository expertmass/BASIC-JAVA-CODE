public class TilingProb {
       public static int TilingProblem(int n){//2xn (floor size)
     //base case
     if(n==0 || n==1){
          return 1;
     }

        //kam
        //vertical choice
        int fnm1= TilingProblem(n-1);

        //horizontal choice
        int fnm2= TilingProblem(n-2);

        int totways=fnm1+fnm2;
      return totways;
       }
    public static void main(String args[]){
         System.out.println(TilingProblem(4));
    }
}
