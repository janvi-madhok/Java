class ForLoop{

    public static void main(String arg[]){

        int n=4;

        for(int i=0;i<=n;i++){
            System.out.println("I can do it.");
        }


        for(int weekOfJan=1; weekOfJan<=4; weekOfJan++){

            System.out.println("Week "+weekOfJan);

            for(int dayOfWeek=1; dayOfWeek<=7; dayOfWeek++){

                System.out.println("Day "+dayOfWeek);
            }
        }


    }
}