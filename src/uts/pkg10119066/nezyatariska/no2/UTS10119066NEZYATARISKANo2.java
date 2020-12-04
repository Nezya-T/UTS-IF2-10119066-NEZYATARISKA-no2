/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.pkg10119066.nezyatariska.no2;

 import java.util.Scanner;

/**
 *
 * @author Neyza-T
 * Nama     : Nezya Tariska
 * NIM      : 10119066
 * Kelas    : IF2
 */
public class UTS10119066NEZYATARISKANo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukkan Saldo Awal \t\t: ");
        Tabungan tabungan = new Tabungan(scanner.nextInt());
        System.out.print("Jumlah uang yang akan diambil \t: ");
        System.out.println("Saldo Anda Sekarang \t\t: " + tabungan.ambilUang(scanner.nextInt()));
    }
    
}
