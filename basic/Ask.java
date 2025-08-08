package basic;
import java.util.Scanner;

public class Ask {
  public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("ご用件は何でしょうか？>");
    String userInput = scanner.nextLine();
    String message = "ご用件は\"" + userInput + "\"ですね。";
    System.out.println(message); 
    scanner.close();
  } 
}
