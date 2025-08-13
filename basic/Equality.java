package basic;

public class Equality {
  public static void main(String args[]){
    boolean a = args[0].equals(args[1]);

    if(a){
      System.out.println("答えは: true");
    }else{
      System.out.println("答えは: false");
    }
  }
}
