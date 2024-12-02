package Switch_1_12_2024;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the browser no");
        int Browser=sc.nextInt();

        switch (Browser){
            case 1:
                System.out.println("Execute Chrome");
                break;
            case 2:
                System.out.println("Execute Firefox browser code");
                break;
            case 3:
                System.out.println("Execute edge browser code");
                break;
            default:
                System.out.println("I have no idea which browser it is");

                        }
        System.out.println("End of the loop");
        sc.nextInt();
    }
}
