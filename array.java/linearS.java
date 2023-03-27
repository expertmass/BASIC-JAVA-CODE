public class linearS {
public static int linersearch(int number[], int key){
    for(int i=0;i<number.length;i++){
    if(number[i]==key){
        return i;
    }
}
return -1;
}

    public static void main(String args[]){
        int number[]={2,4,6,8,10,12,14,16};
        int key=2;
        int index=linersearch(number, key);
        if(index==-1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("number at index " +index);
        }
    }
    
}
