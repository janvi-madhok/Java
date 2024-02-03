class Computer{

    public void playMusic(String s){

        System.out.println("Play "+s+" song");

    }

    public void drawAndPaint(String t){

        System.out.println("Drawing and Painting "+t);
    }

    public String getPen(int m){

        if(m>=20){
            return "PEN";
        }

        return "MONEY IS NOT ENOUGH";
    }
}

public class Methods{

    public static void main(String args[]){

        String song = "Believer";

        String topic = "Scenery";

        int money = 5;

        Computer comp = new Computer();

        comp.playMusic(song);
        comp.drawAndPaint(topic);
        String str = comp.getPen(money);
        System.out.println(str);

    }
}