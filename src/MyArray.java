import java.util.Scanner;

public class MyArray {

    void resultArrayMod3() {
        System.out.println("Ведите длину массива: ");
        Scanner arr = new Scanner(System.in);
        int n = arr.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            if (array[i] % 3 == 0) System.out.print(i + " ");
        }
    }
}
