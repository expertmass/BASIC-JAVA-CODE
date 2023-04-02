public class PairingWithFriend {

    public static int friendsParing(int n){
        if(n==1 || n==2){
            return n;
        }
        //choice
        //singale
        //int fnm1= friendsParing(n-1);

        //pair
        //int fnm2= friendsParing(n-2);
        //int pairWays= (n-1)*fnm2;

        //totways
       // int totways =fnm1+pairWays;
        //return totways;
        return friendsParing(n-1) + (n-1) * friendsParing(n-2);
    }
    public static void main(String args[]){
      System.out.println(friendsParing(3));;
    }
}
