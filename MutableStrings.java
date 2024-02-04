public class MutableStrings{

    public static void main(String args[]){

        StringBuffer sb = new StringBuffer("India");
        StringBuffer sb2 = new StringBuffer();

        System.out.println(sb2.capacity());
        System.out.println(sb2.append("Hello my friend"));
        System.out.println(sb2.capacity());
        System.out.println(sb2.append(" How are you, please tell?"));
        System.out.println(sb2.capacity());

        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.append(" Country"));
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        System.out.println(sb.deleteCharAt(4));
        System.out.println(sb.insert(0, "Hi "));
        System.out.println(sb.substring(3, 7));

        String st = sb.toString();


    }
}