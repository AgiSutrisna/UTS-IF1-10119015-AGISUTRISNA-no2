/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119015.agisutrisna.no2;

import java.util.Scanner;

/**
 *
 * @author Agy
 * NAMA     : AGI SUTRISNA
 * NIM      : 10119015
 * KELAS    : IF-1
 */
public class UTSIF110119015AGISUTRISNANo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("======Program Penarikan Uang=====");
        System.out.print("Masukan Saldo Awal : ");
        int saldo = scanner.nextInt();
        Tabungan tabungan = new Tabungan(saldo);
        System.out.print("Jumlah uang yang akan diambil : ");
        int jumlah = scanner.nextInt();
        System.out.println("Saldo Anda Sekarang : " + tabungan.ambilUang(jumlah));
    }
    
}
