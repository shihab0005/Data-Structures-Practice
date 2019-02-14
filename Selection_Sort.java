
import java.util.Scanner;

/**
 *
 * @author SK
 */
public class Selection_Sort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Size of Array :");
        int n = input.nextInt();
        System.out.println("Enter " + n + " Elements :");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int min, temp = 0;
        for (int i = 0; i < n; i++) {
            min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println("The Selection Sort List Is :");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");

        }
    }

}
