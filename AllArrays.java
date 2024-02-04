public class AllArrays{

    public static void main(String args[]){

        System.out.println("1D Array");

        int arr[] = new int[5];

        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*10);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("\n");

        int arr1[] = {3,2,4,7,5,9};

        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }

        System.out.println("\n2D Array");

        int arr2[][] = new int[4][5];

        for(int n[] : arr2){
            for(int n1 : n){
                n1=(int)(Math.random()*10);
                System.out.print(n1+" ");
            }
            System.out.println();
        }

        System.out.println();

        int arr3[][] = {{2,1,3},{2,6,8},{4,8,2}};

        for(int i=0;i<arr3.length;i++){
            for(int j=0;j<arr3[i].length;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Jagged Array");

        int arr4[][] = new int[4][];

        arr4[0] = new int[4];
        arr4[1] = new int[2];
        arr4[2] = new int[3];
        arr4[3] = new int[4];

        for(int i=0;i<arr4.length;i++){
            for(int j=0;j<arr4[i].length;j++){
                arr4[i][j]=(int)(Math.random()*10);
                System.out.print(arr4[i][j]+" ");
            }
            System.out.println();
        } 

        System.out.println();

        int arr5[][] = {{2,3,5},{6,8},{4,7,9,1}};

        for(int num[] : arr5){
            for(int m : num){
                System.out.print(m+" ");
            }
            System.out.println();
        }

    }
}