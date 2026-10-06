import java.util.Scanner;
public class Ej6Array {
    //static final int NUM_ELEMENTS = 10;
    public static void main(String[] args) {
        int temp;
        Scanner input = new Scanner(System.in);
        int[] array;
        array = new int[10];
        System.out.println("Introduce " + array.length + " valores enteros:");
        for (int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }

        System.out.println("Orden ordinario invertido:");
        for (int i = 0; i < array.length/ 2; i++){

            temp = array[i];
            array[i] = array[array.length - 1 -i];
           array[array.length - 1 -i] = temp;

            }
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

}
