package basic;
import java.util.Scanner;

public class Greet{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String userInput = scanner.nextLine();

    String message = userInput + "さん、こんにちは。";
    System.out.println(message);
  }
}