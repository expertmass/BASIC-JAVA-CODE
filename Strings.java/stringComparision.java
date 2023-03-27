public class stringComparision {
    public static void main(String args[]){
        String s1="Praveen";
        String s2="Praveen";
        String s3=new String("Praveen");
      
         /*if(s1==s2){ // '''it check on yhe object level'''


            System.out.println("string is equal");
         }else{
            System.out.println("string not equal");
         }
         if(s1==s3){//tellls not equal bcz there use of "interning function"
            System.out.println("string is equal");
         }else{
            System.out.println("string not equal");
         }*/


        //  by using .equal functon (only check value) 
        if(s1.equals(s3)){
            System.out.println("string is equal");
        } else {
            System.out.println("string is not equal");
        }

    }
}
