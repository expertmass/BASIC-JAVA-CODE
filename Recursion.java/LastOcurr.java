public class LastOcurr {
               
    public static int lastOcurrance(int arr[],int i,int key){
        if(i==arr.length-1){
            return -1;
        }
     int isFound= lastOcurrance(arr, i+1, key);
     if(isFound==-1 && arr[i]==key){
        return i;
    }
    return isFound;
    }
     public static void main(String args[]){
         int arr[]={8,3,6,9,5,10,2,3,5};
         System.out.println(lastOcurrance(arr, 0, 3));;
    }
}
