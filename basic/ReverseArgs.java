package basic;

public class ReverseArgs {
  public static void main(String args[]){
    int n = args.length;
    String reversed_args[] = new String[n];

    for(int i=0;i<n;i++){
      reversed_args[i] = args[n-i-1];
      System.out.print(reversed_args[i] + " ");
    }
  }
}
