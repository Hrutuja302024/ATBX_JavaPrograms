package Switch_1_12_2024;

public class Lab_06 {
    public static void main(String[] args) {
        int a=11;

        switch (-1){
            default:
                System.out.println("default");
                break;
            case 1:
                System.out.println("10");
                break;
            case -1:
                System.out.println("12");
                break;
            case 2:
                System.out.println("78");
                break;

                //here, it will match switch(-1) to case -1 and print the result of sout i.e. 12

        }
    }
}
