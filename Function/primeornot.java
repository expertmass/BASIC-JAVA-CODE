public class primeornot {
// corner cases only for 2

public static boolean isPrime(int n){
    //corner case 
    if(n==2){
        return true;
    }
boolean isPrime =true;
for(int i=2; i<=n-1; i++){
    if(n%i==0){ //completly dividing
        isPrime=false;
       break;
    }
}
    return isPrime;
}
public static void primeInRange(int n){
    for(int i=2;i<=n; i++){
        if(isPrime(i)){ //true(isPrime is supporting funtion which is discribed above)
        System.out.print(i + " ");
        }
    }
    System.out.println();
}
public static void main(String args[]){
    primeInRange(100);
}
}