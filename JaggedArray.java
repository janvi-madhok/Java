public class JaggedArray{

    public static void main(String args[]){

        int jarr[][] = new int[3][];

        jarr[0] = new int[4];
        jarr[1] = new int[5];
        jarr[2] = new int[3];

        for(int i=0;i<jarr.length;i++){
            for(int j=0;j<jarr[i].length;j++){
                jarr[i][j] = (int)(Math.random()*10);
            }
            System.out.println();
        }

        for(int i=0;i<jarr.length;i++){
            for(int j=0;j<jarr[i].length;j++){
                System.out.print(jarr[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        int jarr2[][] = {{2,4,6,8},{1,3,5,7,9},{0,1,2}};

        for(int i=0;i<jarr2.length;i++){
            for(int j=0;j<jarr2[i].length;j++){
                System.out.print(jarr2[i][j]+" ");
            }
            System.out.println();
        }

    }
}