/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118030.latihan24.perbandingan;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Ari Sulistio
 * KELAS    : IF-1
 * NIM      : 10118030
 * Deskripsi Program : Program ini berisi tentang Perbandingan 2 buah nilai
 */
public class IF110118030Latihan24Perbandingan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("========Program Perbandingan Nilai=========");
	Scanner sc = new Scanner(System.in);
	String Status = "Ya";	
	while (Status.equals("Ya")){
            System.out.print("Masukkan nilai pertama : ");
            int[] nilai = new int[2];
            nilai[0] = sc.nextInt();
            System.out.print("Masukkan nilai kedua : ");
            nilai[1] = sc.nextInt();
            System.out.println("Hasil : " + nilai[0] + ((nilai[0] < nilai[1]) ? " Lebih kecil dari " : ((nilai[0] == nilai[1]) ? " Sama dengan " : " Lebih besar dari ")) + nilai[1] );
            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            Status = sc.next();
    }
  }
}
