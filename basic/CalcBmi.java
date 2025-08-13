package basic;

public class CalcBmi {
  public static void main(String args[]){
    double s = Double.parseDouble(args[0]);
    double t = Double.parseDouble(args[1]);
    double bmi = t / Math.pow(s,2);
    String bmi_string = String.format("%.5f", bmi);
    String status;

    if (bmi < 18.5){
      status = "痩せすぎ";
    }else if (bmi < 25){
      status = "標準";
    }else if (bmi < 30){
      status = "太り気味";
    }else{
      status = "太り過ぎ";
    }

    System.out.println("あなたの健康状態: " + status + "　(BMI=" + bmi_string + ")");
  }
}