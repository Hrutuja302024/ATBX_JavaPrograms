package IncrementDecrement;

public class Operators {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        String First_Name="Hrutuja";
        String Last_Name="Maynal";

        System.out.println(a+b);
        System.out.println(First_Name+Last_Name); //result is HrutujaMaynal---called as concatenation
        System.out.println(First_Name+Last_Name+a+b); //---HrutujaMaynal1020
        System.out.println(First_Name+Last_Name+(a+b));  //HrutujaMaynal30
        System.out.println(a+b+First_Name+Last_Name);
    }
}
