package IncrementDecrement;

public class Increment_decrement {
    public static void main(String[] args) {

        // ++a: Prefix:Increment first and then print

        int a=20;
        int b=++a;
        System.out.println(b);
        System.out.println(a);


        //Postfix: print first and then increment
        int a_post=10;
        int b_post=a_post++;
        System.out.println(b_post);
        System.out.println(a_post);

        int c=40;
        int d=++c;
        System.out.println(d);
        System.out.println(c);

        int e=50;
        int f=e++;
        System.out.println(f);
        System.out.println(e);
    }
}
