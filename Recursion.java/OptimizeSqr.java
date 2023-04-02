public class OptimizeSqr {
               
    public static int OptimizeSqrt(int a,int n){
       if(n==0){
        return 1;
       }
       int halfpow=OptimizeSqrt(a, n/2);
       int halfPowSq= halfpow*halfpow;
    // if number is odd
    if(n%2!=0){
        halfPowSq=a*halfPowSq;
    } 
    return halfPowSq;
    }
     public static void main(String args[]){
        int a=2;
        int n=10;
        System.out.println(OptimizeSqrt(a, n));
     }
      
}