import java.util.*;
public class maxsubarraySum {
   /*  public static void maxsubarraySum(int number[] ){
        int currsum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<number.length;i++){
            int start=i;
            for(int j=i; j<number.length;j++){
                int end=j;
                currsum=0;
                for(int k=start;k<=end;k++){
                    currsum +=number[k];
                }
                System.out.println(currsum);
                if(maxSum<currsum){
                    maxSum=currsum;
                }
            }

        }
        System.out.println("max sum= " + maxSum);
    }
    public static void main(String args[]){
        int number[]={1,-2,6,-1,3};
        maxsubarraySum(number);

    }*/


    // broot force to 

    /* 
public static void maxsubarraySum(int number[] ){
        int currsum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[number.length];

        prefix[0]=number[0];
        //calculate prefix
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+number[i];
        }
        
        for(int i=0; i<number.length;i++){
            int start=i;
            for(int j=i; j<number.length;j++){
                int end=j;
                currsum= start==0 ? prefix[end] :prefix[end]-prefix[start-1];
              
             
                if(maxSum<currsum){
                    maxSum=currsum;
                }
            }

        }
        System.out.println("max sum= " + maxSum);
    }*/



    //kadanes algo     //most importent
    public static void kadanes(int number[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<number.length;i++){
            cs=cs+number[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("our max subarray sum is" +ms);
    }
    public static void main(String args[]){
        int number[]={1,-2,5,-1,3,8};
       // maxsubarraySum(number);
        kadanes(number);
    }
}
