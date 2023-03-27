public class salectionSort {
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    minPos=j;
                }
            }
            // swap
            int temp =arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(" " +arr[i]);
        }
        System.out.println(" ");
    }
    public static void main(String args []){
        int arr[]={2,4,1,3,5};
        selectionSort(arr);
           printarr(arr);
    }
}
 