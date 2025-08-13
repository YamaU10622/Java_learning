package basic;

public class Pythagoras {
  public static void main(String args[]){
    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);
    double a_2 = Math.pow(a,2);
    double b_2 = Math.pow(b,2);
    double c = Math.sqrt(a_2+b_2);

    System.out.println("斜辺の長さは"+c);
  }
}
