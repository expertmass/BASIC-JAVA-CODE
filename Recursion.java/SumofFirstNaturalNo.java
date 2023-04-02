public class SumofFirstNaturalNo {
 public static int SumofNatural(int n){
    if(n==1){// Base case
        return 1;
    }
    int Snm1= SumofNatural(n-1);
    int Sn=n+SumofNatural(n-1);
    return Sn;
 }

    public static void main(String args[]){
         int n=3;
         System.out.println(SumofNatural(n));
    }
}
