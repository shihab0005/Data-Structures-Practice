
import java.util.Scanner;


public class LinearSearch {
    
    public static void main(String[] args) {
        int i, n, search , array[];
        
        Scanner input =new Scanner(System.in);
        System.out.println("How Many Number do You Want to Enter :");
        n=input.nextInt();
        array = new int[n];
        System.out.println("Enter "+n+" integer :"  );
        for( i = 0; i < n; i++) {
            array[i]=input.nextInt();
            
        }
        System.out.println("Enter Value You Want To Search :");
        search=input.nextInt();
        for (i = 0;  i< n; i++) {
            if (array[i] == search) {
                System.out.println(search + " is available in the list in position of  " + (i + 1));
                break;
            }
        }
            if (i == n) {
            System.out.println(search + " is not available in the list !!");
        }
    }
    
}
