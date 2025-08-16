package basic;

public class Leibniz {
  public static void main(String args[]){
    int n = Integer.parseInt(args[0]);

    double sum = 0;

    for(int i=0; i<n; i++){
      sum += Math.pow(-1,i)/(2*i+1);
    }
    System.out.println(4*sum);
  }
}
