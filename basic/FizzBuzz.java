package basic;

public class FizzBuzz {
  public static void main(String args[]){
    int i = 1;
    String s = "";

    while (i <= 100){
      if(i % 3 == 0){
        if (i % 5 == 0){
          s += "FizzBuzz,"; 
        }else{
          s += "Fizz,";
        }
      }else if(i % 5 == 0){
        s += "Buzz,";
      }else{
        String i_stirng = Integer.toString(i);
        s += i_stirng;
        s += ",";
      }
      i++;
    }
    System.out.println(s);
  }
}