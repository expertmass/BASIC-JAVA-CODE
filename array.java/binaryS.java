
public class binaryS {
    public static int binarySearch(int number[],int key){
        int start=0, end=number.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            //comparison
            if(number[mid]==key){
                return mid;
            } 
            //right wala part
            if(number[mid]<key){
               start= mid+1;
            }else{//left
                end=mid-1;

            }
        }
        return -1;
    }
    public static void main(String args[]){
     int number[]={2,4,6,8,10,12,14,18};
     int key=18;
     System.out.println("index of key is" + binarySearch(number, key));
    }
}
