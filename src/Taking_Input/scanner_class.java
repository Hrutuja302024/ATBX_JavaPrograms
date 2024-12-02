package Taking_Input;

import java.util.Scanner;

public class scanner_class {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the age\n");
       // System.out.println(S1);
        int age=scanner.nextInt();
        //System.out.println(age>25 ? "Allowed to Goa":"Not allowed to Goa");
        System.out.println(age);
    }
}
