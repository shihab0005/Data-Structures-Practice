
import java.util.Scanner;

/**
 *
 * @author SK
 */
public class BinarySearch {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size Of Array :");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Insert Value To find :");
        int find = input.nextInt();
        int low = 0;
        int high = n - 1;
        int mid = 0;
        
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == find) {
                System.out.println("value Find In Index " + (mid + 1));
                break;
            } else if (arr[mid] > find) {
                high = mid - 1;
            } else if (arr[mid] < find) {
                low = mid + 1;
            }
        }
        if (low > high) {
            System.out.println("Value not find !");
        }
    }
}
