import java.util.*;

public class array{
    // passing array as argument (call by refrence)
    
    public static void update(int marks[]){
       for(int i=0;i<marks.length;i++){
       marks[i]=marks[i]+1;
    }
    }

    public static void main(String arg[]){
        int marks[]={20,20,40};
        update(marks);

        //print our marks
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}