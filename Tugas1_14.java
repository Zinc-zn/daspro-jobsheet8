import java.util.Scanner;

public class Tugas1_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N (Minimal 3) = ");
        int N=input.nextInt();

        if (N<3){
            System.out.println("Masukkan nilai dengan  benar!");
            return;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || i == N-1 || j == 0 || j == N-1) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
