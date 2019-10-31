/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan51gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : Program ini berisi program Menghitung gaji karyawan
 */
public class IF110118015Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Manager ceo = new Manager();
        System.out.println("=== Program Perhitungan Gaji Karyawan===");
        System.out.print("Masukkan NIK : ");
        ceo.setNik(input.nextLine());
        System.out.print("Masukan Nama : ");
        ceo.setNama(input.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        ceo.setGolongan(input.nextInt());
        System.out.print("Masukkan Jabatan (manager/kabag) : ");
        ceo.setJabatan(input.next());
        System.out.print("Masukan jumlah kehadiran : ");
        ceo.setKehadiran(input.nextInt());
        System.out.println();
        
        System.out.println("===Hasil Perhitungan===");
        System.out.println("NIK\t: "+ ceo.getNik());
        System.out.println("Nama\t: "+ ceo.getNama());
        System.out.println("Golongan: "+ ceo.getGolongan());
        System.out.println("Jabatan : "+ ceo.getJabatan() +"\n");
        System.out.println("TUNJANGAN GOLONGAN  : "+ ceo.tunjanganGolongan(ceo.getGolongan()));
        System.out.println("TUNJANGAN JABATAN   : "+ ceo.tunjanganJabatan(ceo.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN : "+ ceo.tunjanganKehadiran(ceo.getKehadiran())+ "\n");
        System.out.println("GAJI TOTAL : "+ ceo.gajiTotal());
    }
    
}
