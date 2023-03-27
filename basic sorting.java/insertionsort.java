public class insertionsort {
    public static void  insertionSort(int arr[]) {
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            //finding out the correct pos too insert
            while(prev>=0 && arr[prev] > curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
            
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(" " +arr[i]);
        }
        System.out.println(" ");
    }
    public static void main(String args []){
        int arr[]={5,3,4,2,1};
        insertionSort(arr);
        printarr(arr);
    }
}

