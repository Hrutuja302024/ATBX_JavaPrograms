package Switch_1_12_2024;

public class Lab03 {

    public static void main(String[] args) {
        int itemcode=003;

        switch (itemcode){
            case 001,002,005:
                System.out.println("All of them are electronic gadgets");
                break;
            case 004,003,007:
                System.out.println("This is mech");
                break;
            default:
                System.out.println("none");

        }
        System.out.println("End of the loop");

    }
}
