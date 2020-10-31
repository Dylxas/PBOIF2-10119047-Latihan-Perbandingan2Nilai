/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan24.perbandingan2nilai;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara @hnggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI MENCARI NILAI TERBESAR DAN TERKECIL
 */

public class PBOIF210119047Latihan24Perbandingan2Nilai {
    
    //perbandingan
    public static void perbandingan(int nilai1, int nilai2){
        if(nilai1 > nilai2){
            System.out.println("Hasil : " + nilai1 + " lebih besar dari " + nilai2);
        }else if(nilai1 < nilai2){
            System.out.println("Hasil : " + nilai1 + " lebih kecil dari " + nilai2);
        }else {
            System.out.println("Hasil : " + nilai1 + " sama dengan " + nilai2);
        }
    }
        
    /**
     * @param args the command line arguments
     */
    //utama
    public static void main(String[] args) {
        // TODO code application logic here
        int nilai1, nilai2;
        boolean kondisi = true;
        String ulangi = "Ya";
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("======Program Perbandingan Nilai======");
        do {
            System.out.print("Masukkan nilai pertama : ");
            nilai1 = keyboard.nextInt();
            System.out.print("Masukkan nilai kedua   : ");
            nilai2 = keyboard.nextInt();
                
            perbandingan(nilai1, nilai2);
            
            System.out.println("");
            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            ulangi = keyboard.next();
            System.out.println("");  
            kondisi = "Ya".equals(ulangi);
        } while (kondisi);
    }
}
    

