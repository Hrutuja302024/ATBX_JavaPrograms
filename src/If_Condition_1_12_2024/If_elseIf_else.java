package If_Condition_1_12_2024;

import java.util.Scanner;

public class If_elseIf_else {
    public static void main(String[] args) {
        int a=20;
        int b=30;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1=sc.nextInt();

        System.out.println("Enter the num2");
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println("num1 is maximum");
        } else if (num2>num1) {
            System.out.println("num2 is maximum");

        }else{
            System.out.println("both are equal");
        }
    }
}
