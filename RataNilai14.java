import java.util.Scanner;

public class RataNilai14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, j, totalNilai, nilaiMhs, rataNilai;

            i=1;
            while (i<=5){
                System.out.println("Input Nilai Mahasiswa ke "+i);
                totalNilai=0;
                for (j=1;j<=5;j++){
                    System.out.print("Nilai ke-" +j + " = ");
                    nilaiMhs=input.nextInt();
                    totalNilai+=nilaiMhs;
                }
                rataNilai=totalNilai/5;
                i++;
                System.out.println("Rata-rata Nilai Mahasiswa ke "+i+" adalah "+rataNilai);
            }
            
    }
}
