/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PBO210118080Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Printer print = new Printer();
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukan Nama Anda\t: ");
        Scanner nm = new Scanner(System.in);
        print.setNama(nm.nextLine());
        System.out.print("Mau cetak nama berapa kali\t: ");
        Scanner brp = new Scanner(System.in);
        print.setJmlCetak(brp.nextInt());
        print.cetak(print.getNama());
        System.out.println("Hasil Cetak :");
        print.cetak(print.getJmlCetak(), print.getNama());
        
        
    }
    
    
}
