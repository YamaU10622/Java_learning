package basic;

public class Addition {
  public static void main(String args[]){
    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);
    double sum = a + b;

    System.out.println("答えは: " + sum);
  }
}

