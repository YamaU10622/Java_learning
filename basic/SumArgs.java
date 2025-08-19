package basic;

public class SumArgs {
  public static void main(String args[]){
    int n = args.length;
    double sum = 0;

    for(int i=0;i<n;i++){
      Double j = Double.parseDouble(args[i]);
      sum += j;
    }
    System.out.println("合計: " + sum);
  }
}
