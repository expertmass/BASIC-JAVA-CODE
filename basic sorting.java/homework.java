
import java.util.*;
public class homework{


    // bubble sort 


    /*public static void bubblesort(int bubble[]){
        for(int turn=0;turn<bubble.length-1;turn++){
        for(int j=0;j<bubble.length-1-turn;j++){
            if(bubble[j]>bubble[j+1]){
                int temp=bubble[j];
                bubble[j]=bubble[j+1];
                bubble[j+1]=temp;
            }
        }
    }
}
        public static void printbubble(int bubble[]){
            for(int i=0;i<bubble.length;i++){
                System.out.print(" "+bubble[i]);
            }
        }
   
    public static void main (String args[]){
        int bubble[]={3,6,2,1,8,7,4,5,3,1};
       bubblesort(bubble);
       printbubble(bubble);
        
    }*/



    //  insertion sort

   /*  public static void insertionsort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
           int  prev=i-1;
           while(prev>=0 && arr[prev]>curr){
            arr[prev+1]=arr[prev];
            prev--;
           }
           arr[prev+1]=curr;
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
    public static void main (String args[]){
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        insertionsort(arr);
        printarr(arr);
    }*/
}