package basic;

public class Triangle {
  public static void main(String args[]){
    int n = Integer.parseInt(args[0]);

    while(n > 0){
      System.out.println("*".repeat(n));
      n--;
    }
  }
}
