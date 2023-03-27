public class pairInAnArray {




    public static void  printpairs(int number[]) {
        int tp=0;
        for(int i=0;i<number.length;i++){
            int curr = number[i];
            //if we want (2,2).. type set change the intial conditon with j=0 to j=i+1
            for(int j=i+1;j<number.length;j++){
                System.out.print("(" + curr + "," + number[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total tp is =" + tp);
    }




    
    public static void main(String args[]){
               int number[]={2,4,6,8,10};
               printpairs(number);
    }
}
