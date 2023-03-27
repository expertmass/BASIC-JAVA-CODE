import java.util.*;


public class bubbleSort{
    public static void BubbleSort(int bubble[]){
        for(int turn=0;turn<bubble.length-1;turn++){
          //  int cout=0;
            for(int j=0; j<bubble.length-1-turn;j++){
                if(bubble[j]>bubble[j+1]){
                    /// swap
                    int temp=bubble[j];
                    bubble[j]=bubble[j+1];
                    bubble[j+1]=temp;
                }
               // cout++;
                
            }//System.out.println("total swaping is"+cout);
        }
    }
    public static void printbubble(int bubble[]){
        for(int i=0;i<bubble.length;i++){
            System.out.print(" " +bubble[i]);
        }
        System.out.println(" ");
    }
    public static void main(String args[]){
  int bubble[]={5,1,2,4,3};
         BubbleSort(bubble);
         printbubble(bubble);
    }
}