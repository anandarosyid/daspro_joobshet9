import java.util.Scanner;
public class ArrayRataNilai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jumlah mahasiwa : ");
        int jmlhMhs = sc.nextInt();

        int[] nilaiMhs = new int[jmlhMhs];
        double totalLulus = 0, totalTdkLulus = 0;
        double rata2lulus, rata2TdkLulus;
        int jmlhLulus = 0, jmlhTdkLulus = 0;

        for (int i = 0; i <nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
        } for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jmlhLulus++;
            } else {
                totalTdkLulus += nilaiMhs[i];
                jmlhTdkLulus++;
            }
        }
        rata2lulus = totalLulus / jmlhLulus;
        rata2TdkLulus = totalTdkLulus / jmlhTdkLulus;
   
        System.out.println("Rata-rata nilai lulus = " + rata2lulus); 
        System.out.println("rata rata nilai tidak lulus = " + rata2TdkLulus);  

     
      
    
}
}