
public class patterns {
    public static void main(String args[]){
        /*for(int i=0; i<=4; i++){
            //one line 
            for(int j=1; j<=i;  j++){
                System.out.print("*");
            }
            System.out.println("*");
        }*/

        /* 
        int n=4;
        for(int i=1; i<=n; i++){
            //one line 
            for(int star=1; star<=n-i+1; star++){
                System.out.print("*");
            }
            System.out.println("*");
    }*/
     /* 
      int n=5;
    for(int i=1; i<=n; i++){
        //one line 
        for(int j=1; j< i;  j++){
            System.out.print(j);
        }
        System.out.println(i);
      */
    
          int n=6;
          char ch='A';
          for(int line =1; line<=n; line++){
            for(int chars=1; chars<=line; chars++){
                System.out.print(ch);
                  ch++; 
            }System.out.println();
           
        }
    






    }
}
