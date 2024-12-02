 package IncrementDecrement;

public class Type_casting {
    public static void main(String[] args) {
        byte b=10;
        int a=b; //--- implicit casting
       // int a1= int (b); // ---explicit casting
        System.out.println(a);

        int val=300;
        //byte b1=val;
        byte b3=(byte)val;

        int course= 100;
        float GST= 18.4f;
        int Total_Price=course+ (int)GST;
        System.out.println(Total_Price);

    }

}
