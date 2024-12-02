package If_Condition_1_12_2024;

import java.util.Scanner;

public class If_else4_user_Input_and_find_even_or_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number\n");
        int num=sc.nextInt();

        if(num%2==0){
            System.out.println("Entered number is even number");
        }
        else{
            System.out.println("it's odd number");
        }
        sc.close();
    }

}

