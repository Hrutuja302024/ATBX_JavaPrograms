package IncrementDecrement;

public class Maximum_num {
    public static void main(String[] args) {
/*
        int num=70;
        String Grade= (num>=90) ? "A" : (num>=80) ? "B" : (num>=70) ? "C": (num>=60)? "D": "F";
        System.out.println("Your grade is -->" +Grade);
        System.out.printf("Your grade is %s", Grade); */

        int a=60, b=70, c=50;
        int Max=(a>=b && a>=c) ? a:(b>=c ? b : c);
        System.out.println("Your max num is:" +Max);
        System.out.printf("Your max num is %d", Max);
    }


}
