public class ImmutableStrings{

    public static void main(String args[]){

        String a1 = new String("Hello");
        String a2 = "Hello";
        String a3 = "Hello";

        System.out.println(a1==a2);
        System.out.println(a2==a3);
        System.out.println(a2.equals(a3));
        System.out.println(a1.equals(a2));
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a3.hashCode());


        String s = "Java";
        System.out.println(s);
        s = s + " Programming";
        System.out.println(s);

    }
}