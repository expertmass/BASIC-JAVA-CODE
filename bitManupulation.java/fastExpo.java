public class fastExpo {

    public static int Fastexpo(int a, int n){
        int ans=1;
        while(n>0){
            if((n&1) !=0){
                //Check LSB
                ans = ans *a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String args[]){
     System.out.println(Fastexpo(5, 0));
    }
}
