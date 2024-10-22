
import java.util.Scanner;

/**
 * Square14
 */
public class Square14 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = input.nextInt();
        for (int iOuter = 1; iOuter <= N; iOuter++) {    
            for (int i = 0; i <= N; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}