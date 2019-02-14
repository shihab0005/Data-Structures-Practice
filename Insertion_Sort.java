
import java.util.Scanner;

/**
 *
 * @author SK
 */
public class Insertion_Sort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size of Array :");
        int n = input.nextInt();
        System.out.println("Enter " + n + " Elements :");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();

        }
        int temp, j;
        for (int i = 1; i < n; i++) {
            temp = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j = j - 1;

            }
            arr[j] = temp;

        }
        System.out.println("Insertion Sort List Is :");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

    }

}
