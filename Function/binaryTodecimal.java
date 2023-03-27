public class binaryTodecimal {
    public static void  bintodec(int binNum){
        int mynum=binNum;
        int pow=0;
        int decNum =0;
        while(binNum>0){
            int lastdigit= binNum%10;
            decNum =decNum +(lastdigit * (int)Math.pow(2,pow));
           pow++;
           binNum=binNum/10;
        }
        System.out.println("decimal is" + mynum + "="  + decNum);
    }
    public static void main(String args[]){
             bintodec(1010);
    }
}
