class TypeConversion{

    public static void main(String args[]){

        byte a = 12;
        int b = a;
        System.out.println(b);

        int b1=257;
		byte a0=(byte)b1;
		System.out.println(b1);
		System.out.println(a0);

		
		int a2=2567;
		byte b2=(byte)a2;
        System.out.println(b2);

        float f = 7.5f;
        int in = (int)f;
		System.out.println(in);
		
		byte a3 = 10;
		byte b4 = 20;
		int t = a3*b4;
		System.out.println(t);

    }
}
