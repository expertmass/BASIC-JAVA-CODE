public class InterfaceOrimolemants {
    public static void main(String args[]){
       

    King ki= new King();
    ki.moves();
    }
}


interface Chessplayer{
    void moves();
}

class Queen implements Chessplayer{
   public  void moves(){
        System.out.println("up,dowon,left,right,digobal(in all  4 directions)");

    }
}

class Rook implements Chessplayer{
    public  void moves(){
         System.out.println("up,dowon,left,right");
     }
 }
class King implements Chessplayer{
    public  void moves(){
         System.out.println("up,dowon,left,right,diagonal by one step");
     }
 }
