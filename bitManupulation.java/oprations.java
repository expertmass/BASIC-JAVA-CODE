import javax.sql.rowset.spi.SyncResolver;

public class oprations {

    // GET Ith POsition


    /*public static int getBit(int n,int i){
 
    int bitMask=1<<i;
    if((n & bitMask)==0){
        return 0;
    }else{
        return 1;
    }
}   
public static void main(String args[]){
  System.out.println(getBit(10, 3));
}*/




 // SET ITH POSITIN


 /*public static int setBit(int n,int i){
 
    int bitMask=1<<i;
       
        return n|bitMask;
    }
  
public static void main(String args[]){
  System.out.println(setBit(10, 2));

}*/

// CLEAR ITH BIT
//public static int clrBit(int n,int i){
 
    //int bitMask=(~1<<i);
         
       // return n& bitMask;
    //}

   // public static int updatebit(int n,int i,int newbit){
    //    if(newbit==0){
      //      return clearithbit(n,i);
      //  }else{
        //    return setithbit(n,i);
        




       // n= clrBit(n, newbit);
       // int bitMask=newbit<<i;
        //return n| bitMask;
      //}
      public static int clrithbit(int n,int i){
         int bitmask=(~0)<<i;
         return n& bitmask;
      }
    public static void main(String args[]){
        //System.out.println(updatebit(10, 2,1 ));
        System.out.println(clrithbit(15, 2));

    }
} 
