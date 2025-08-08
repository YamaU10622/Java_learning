package basic;

public class Greet{
  public static void main(String[] args){
    String message = args[0] + "さん、" + args[1] + "。";
    System.out.println(message);
  }
}