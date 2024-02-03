class Calculate{

    public int multiply(int n1, int n2){

        return n1*n2;

    } 

     public int multiply(int n1, int n2, int n3){

        return n1*n2*n3;

    } 
    
    public double multiply(int n1, double n2){

        return n1*n2;

    }

}

public class MethodOverloading{

    public static void main(String args[]){

        Calculate cal = new Calculate();

        System.out.println(cal.multiply(2,5));
        System.out.println(cal.multiply(5,6,2));
        System.out.println(cal.multiply(2,1.5));
        

    }
}