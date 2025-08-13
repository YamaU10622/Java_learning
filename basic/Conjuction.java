package basic;

public class Conjuction {
  public static void main(String args[]){
    boolean a = Boolean.parseBoolean(args[0]);
    boolean b = Boolean.parseBoolean(args[1]);
    boolean c = a && b;

    if(c){
      System.out.println("答えは: true");
    }else{
      System.out.println("答えは: false");
    }
  }
}
