import java.util.Scanner;

/**
 * Triangle14
 */
public class Triangle14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = input.nextInt();
        int i=0;
        while (i<=N) {
            int j = 0;
            while (j<i) { 
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}