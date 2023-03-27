public class live_ses_patt {


    // number pryamid pattern



    /* 
    public static void num_pyramid(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
num_pyramid(2);
    }*/

// palindrom pattern


 public static void palindromicPatternwithnum(int n){
    for(int i=1; i<=n;i++){
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
        for(int j=2; j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
 }
public static void main(String args[]){
      palindromicPatternwithnum(30);
}

}