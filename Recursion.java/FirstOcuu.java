public class FirstOcuu {
              
    public static int FirstOcurrance(int arr[],int i,int key){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return FirstOcurrance(arr, i+1, key);
    }

     public static void main(String args[]){
         int arr[]={8,3,6,9,5,10,2,3,5};
         System.out.println(FirstOcurrance(arr, 0, 6));;
    }
}
