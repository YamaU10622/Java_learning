package basic;
import java.util.HashMap;
import java.util.Scanner;

public class RockPaperScissors {
  public static void main(String args[]){
    HashMap<String, String> hmap = new HashMap<String, String>();
    hmap.put("R","グー");
    hmap.put("P","パー");
    hmap.put("S","チョキ");

    String computer = "";
    String userInput = "";

    Scanner sc = new Scanner(System.in);

    while (computer.equals(userInput)){
      System.out.print("グー(R),パー(P),チョキ(S) > ");
      userInput = sc.nextLine();
      
      double randomNumer = Math.random();
      int randomInt = (int) Math.round(randomNumer*3);

      if(randomInt % 3 == 0){
        computer = "R";
      }else if(randomInt % 3 == 1){
        computer = "P";
      }else{
        computer = "S";
      }

      if(computer.equals(userInput)){
        System.out.println("コンピューター: " + hmap.get(computer));
        System.out.println("結果: あいこ");
      }
    }

    String res = "";
    switch (userInput) {
      case "R":
        if(computer.equals("S")){
          res = "あなたの勝ち";
        }else{
          res = "コンピューターの勝ち";
        }
        break;
      case "P":
        if(computer.equals("R")){
          res = "あなたの勝ち";
        }else{
          res = "コンピューターの勝ち";
        }
        break;
      
      case "S":
        if(computer.equals("P")){
          res = "あなたの勝ち";
        }else{
          res = "コンピューターの勝ち";
        }
        break;
    }
    System.out.println("コンピューター: " + hmap.get(computer));
    System.out.println("結果: " + res);

    sc.close();
  }
}
