
import java.util.Scanner;

/**
 *
 * @author SK
 */
public class BubbleSort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int temp;
        int[] a = new int[8];
        System.out.println("Enter 8 integer :");
        for (int k = 0; k < a.length; k++) {
            a[k] = input.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("Bubble Sort list is :");
        for (int k = 0; k < a.length; k++) {
            System.out.println(a[k]);

        }

    }

}
