public class practice {
    

    //linear search

    /*public static int linearS(int number[],int key){
        for(int i=0;i<=number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int number[]={1,2,3,4,5,6};
        int key=7;
        int index=linearS(number, key);
        if(index==-1){
            System.out.print("NUmber found ");

        }else{
            System.out.println("found at index  " + index);
        }
    
 

 
    } */
    //binary search


    /* 


    public static int BinarySerach(int number[], int key){
        int start=0; int end =number.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(number[mid]==key){
                return mid;
            }
            if(number[mid]<key){
                       start=mid+1;
            }
            else{
                end=mid-1;
            }
        }return -1;
    }
    
    
    public static void main(String args[]){
     int number[]={10,20,30,40,50,60};
     int key=30;
     System.out.println("number is present at index " +BinarySerach(number, key));
     }
     
    */


    
    //practice largest number in the array
 /* 
    public static int Largestnum(int number[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(largest<=number.length){
                largest=number[i];
            }

        }return largest;
    }
    public static void main(String args[]){
        int number[]={2,3,4,5,6};
        System.out.println("the Largest number is " + Largestnum(number));
    }
*/

// smallest number in the array
/* 
public static int smallestnum(int number[]){
    int smallest=Integer.MAX_VALUE;
    for(int i=0;i<number.length;i++){
        if(smallest>=number.length){
           smallest=number[i];
        }

    }return smallest;
}
public static void main(String args[]){
    int number[]={0,2,3,4,5,6};
    System.out.println("the Largest number is " +smallestnum(number));
}

*/

// reverse the array
      public static void reverse(int number[]){
      int first=0;
      int last=number.length-1;
      
      while(first<last){
        int temp=number[last];
         number[last]=number[first];
         number[first] =temp;
         first++;
         last--;

      }
    }
   public static void main(String args[]){
  int number[]={2,3,4,5,6};
   reverse(number);
   for(int i=0;i<number.length;i++){
    System.out.print(number[i]+ " ");
   }
   System.out.println();
}
    

}
