class Literal{

public static void main(String args[]){

    int a = 0x101;
    System.out.println("Hexadecimal to Decimal: "+a);

    int b = 0b101;
    System.out.println("Binary to Decimal: "+b);

    double d = 1234;
    System.out.println(d);

    int i = 12_00_000;
    System.out.println(i);

    double dou = 12e10; //12 times 10 raise to power 10 
    System.out.println(dou);

    char ch = 65;
    ch++;
    System.out.println(ch);

    int ab = 'a';
    System.out.println(ab);


}
}