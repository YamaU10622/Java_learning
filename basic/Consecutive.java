package basic;

public class Consecutive {
  public static void main(String args[]){
    int a = Integer.parseInt(args[0]);
    int b = ++a;
    --a;
    int c = --a;
    ++a;

    System.out.println(c+" "+a+" "+b);
  }
}
