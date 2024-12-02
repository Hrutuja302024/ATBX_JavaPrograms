package Taking_Input;

public class Task2 {
    public static void main(String[] args) {


    int num1=Integer.parseInt(args[0]);
        System.out.println(num1);
        int num2= Integer.parseInt(args[1]);
        System.out.println(num2);
        String Max= num1>num2 ? "num1 is maximum number":"num2 is maximum number";
        System.out.println(Max);


    }
}
