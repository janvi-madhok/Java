class Calculator{

    public int add(int m1, int n1){

        int res = m1+n1;

        return res;
    }
}

public class ClassObject{

    public static void main(String args[]){

        int m = 5;
        int n = 10;

        Calculator calc = new Calculator();

        int result = calc.add(m,n);

        System.out.println(result);


    }
}