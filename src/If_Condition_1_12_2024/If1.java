package If_Condition_1_12_2024;

import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age\n");
        int age=sc.nextInt();

        if (age>18){
            System.out.println("You are allowed to vote");
        }
        sc.close();
    }
}
