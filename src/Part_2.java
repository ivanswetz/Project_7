import java.util.Random;

public class Part_2 {
    static Random rand = new Random();
    static public void main(String [] args){
        int[] arr = new int[5];
        int temp = 0;
        for(int i = 0; i < 5; i++){
            arr[i] = rand.nextInt(100);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("!Outer! loop iteration " + (i+1));
            System.out.println("---------------------------");
            for (int k = 0; k < 5; k++){
                System.out.println(arr[k] + " ");
            }
            System.out.println("---------------------------");
            for (int j = 0; j < 4; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                System.out.println("Inner loop iteration " + (j+1));
                for (int l = 0; l < 5; l++){
                    System.out.println(arr[l] + " ");
                }
            }
        }
        System.out.println("--------------");
        for (int  i = 0; i < 5; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
