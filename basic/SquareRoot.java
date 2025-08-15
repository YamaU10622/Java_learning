package basic;

public class SquareRoot{
  public static void main(String args[]){
    int n = Integer.parseInt(args[0]);

    double mid = (1+n)/2;
    double left = 1;
    double right = n;


    while (Math.abs(Math.pow(mid,2) - n) > Math.pow(10,-4) ) {
      if (Math.pow(mid,2) > n){
        right = mid;
      }else{
        left = mid;
      }
      mid = (left+right)/2;
    }
    System.out.println(mid);
  }
}