package Switch_1_12_2024;

import java.util.Scanner;

public class Lab02 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the browser");
        String Browser=sc.next();
        Browser=Browser.toLowerCase(); // this will convert the user input of capital to lower case: this is inbuilt function in string

        switch(Browser){
            case "chrome":
                System.out.println("Starting the chrome browser");
                System.out.println("execute the code of chrome ahead");
                break;
            case "Edge":
                System.out.println("Starting the edge browser");
                System.out.println("start the code for edge browser");
                break;
            case "Firefox":
                System.out.println("Starting the firefox browser");
                break;
            default:
                System.out.println("no idea, which browser it is");

        }
        System.out.println("End of the loop");
      sc.close();
    }
}
