class WhileLoop{

    public static void main(String args[]){

        int day = 1;

        while(day<=7){

            System.out.println("Day "+day);

            int time = 1;

            while(time<=12){

                System.out.println("Time: "+time+"AM");

                time++;
            }

            day++;
        }

    }
}