package If_Condition_1_12_2024;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //float L1=100.1f;
        //float L2=100.1f;
        //float L3=100.1f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length of first side");
        float L1=sc.nextFloat();

        System.out.println("Enter length of second side");
        float L2=sc.nextFloat();

        System.out.println("Enter length of third side");
        float L3= sc.nextFloat();

        if(L1<=0 && L2<=0 &&L3<=0){
            System.out.println("Invalid input: Side lengths must be positive");
        }
        else if(L1==L2 && L2==L3 && L1==L3){
            System.out.println("This is equilateral triangle");
        }
        else if (L1==L2 || L2 ==L3 || L1==L3 ) {
            System.out.println("This is isosceles triangle");
                    }
        else {
            System.out.println("This is scalene triangle");
        }
        sc.close();
    }
}
