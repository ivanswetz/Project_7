import java.util.Random;
import java.util.Scanner;

public class Part_1 {
    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();
    public static void main(String[] args) {
        ArrSwitch();
        boolean what = true;
        while(what){
            System.out.println("Do you want to continue(Y/N): ");
            scan.nextLine();
            String YN = scan.nextLine();
            if(YN.equals("Y") || YN.equals("y")){
                ArrSwitch();
            } else if (YN.equals("N") || YN.equals("n")) {
                System.out.println("Bye!");
                what = false;
            }
            else{
                System.out.println("Wrong.");
                what = false;
            }
        }
    }
    public static void ArrOutput(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int[] ArrCreateRand(int size){
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }
    public static int[] ArrCreate(int size){
        int[] arr = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = scan.nextInt();
        }
        return arr;
    }
    public static int[] ArrSort(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean end = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    end = false;
                }
            }
            if(end){
                break;
            }
        }
        return arr;
    }
    public static void ArrSwitch(){
        System.out.print("Input number of elements: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Do you want to randomly generate numbers or by yourself(1 - generate, 2 - yourself)");
        int choice = scan.nextInt();
        switch (choice){
            case 1:
                arr = ArrCreateRand(size);
                ArrOutput(arr);
                ArrSort(arr);
                ArrOutput(arr);
                break;
            case 2:
                arr = ArrCreate(size);
                ArrOutput(arr);
                ArrSort(arr);
                ArrOutput(arr);
                break;
            default:
                System.out.println("Try again: ");
                choice = scan.nextInt();
                break;
        }
    }
}