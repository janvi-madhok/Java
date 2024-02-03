public class MultiDArray{

    public static void main(String args[]){

        int arr[][] = new int[4][5];

        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                arr[i][j] = (int)(Math.random()*10);
            }
        }

        
        System.out.println("Normal version of printing 2D Array");


        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Enhanced version of printing 2D Array");

        for(int a[] : arr){
            for(int n : a){
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}