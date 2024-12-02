package IncrementDecrement;

public class max_number {

  /*  int a=20;
    int b=30;
    int c=40;

    String max= a>b ? "a is max than b" :a>c ? "a is max than b and c" :
    sout  */
  public static void main(String[] args) {


      int score = 90;
      String Grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
      System.out.println("Your grade is -->:" + Grade);
      System.out.printf("your grade is %s", Grade);

  }






}
