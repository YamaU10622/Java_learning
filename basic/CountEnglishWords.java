package basic;
import java.util.Scanner;

public class CountEnglishWords {
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    System.out.print("入力して下さい > ");
    String InputSentence = scanner.nextLine();
    String[] splited_InputSentence = InputSentence.split(" ");
    System.out.println("単語数: " + splited_InputSentence.length);
    scanner.close();
  }  
}
