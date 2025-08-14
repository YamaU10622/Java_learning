package basic;

public class RangeSummation {
  public static void main(String args[]){
    int sum = 0;
    String formula = "";

    int start = Integer.parseInt(args[0]);
    int end = Integer.parseInt(args[1]);

    for(int i = start;i<= end;i++){
      sum += i;
      formula += i;
      if(i != end){
        formula += "+";
      }
      
    }

    System.out.println(formula + "=" + sum);
  }
}
