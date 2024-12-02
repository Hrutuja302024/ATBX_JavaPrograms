package Switch_1_12_2024;

public class Lab04 {
    public static void main(String[] args) {

        int itemcode=001;

        switch (itemcode){
            case 001 -> System.out.println("001 XYZ");
            case 002 -> System.out.println("002 ABC");
            case 003 -> System.out.println("003 def");
            default -> System.out.println("default");
        }
    }
}
