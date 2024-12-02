package Switch_1_12_2024;

import java.util.Scanner;
import java.util.SequencedCollection;

public class Simple_calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number 1");
        int num1=sc.nextInt();
        System.out.println("Enter the number 2");
        int num2=sc.nextInt();
        System.out.println("Tell us the Operator amongst +-*%");
        String Operator=sc.next();
        Operator=Operator.toLowerCase();
        int Add=num1+num2;
        int sub=num1-num2;
        int multiplication=num1*num2;
        int Division=num1%num2;

        switch (Operator){
            case "one":
                System.out.println("Addition"+Add);
                System.out.println();
                break;
            case "two":
                System.out.println("Subtraction" +sub);
                System.out.println();
                break;
            case "three":
                System.out.println("Multiplication" +multiplication);
                System.out.println();
                break;
            case "four":
                System.out.println("Modulus" +Division);
                System.out.println();
                break;
            default:
                System.out.println("none");
                System.out.println();
                break;
                        }
        System.out.println("End of the loop");
        sc.close();
    }
}
