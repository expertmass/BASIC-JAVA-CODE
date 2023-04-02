public class Fibnacci {

    /*public static int fibb(int n){
         if (n==0 || n==1){
            return n;
         }
        int fnm1=fibb(n-1);
        int fnm2=fibb(n-2);
        int fn=fnm1+fnm2;
        
        return fn;

    }*/
    // check array is sorted or not
 public static boolean isSorted(int arr[], int i){
     if(i==arr.length-1){
        return true;
     }
     if(arr[i] > arr[i+1]){
             return false;
     }
     return isSorted(arr, i+1);
 }

    public static void main(String args[]){
      //int n=9;
      //System.out.print(fibb(n));
      int arr[]={1,2,8,3,4,5};
      System.out.println(isSorted(arr,0));
      
    }

}
