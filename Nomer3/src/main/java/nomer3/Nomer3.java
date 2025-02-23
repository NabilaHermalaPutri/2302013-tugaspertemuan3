/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package nomer3;

import java.util.Scanner;


public class Nomer3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jam masuk dan jam keluar dari pengguna
        System.out.print("Masukkan jam masuk: ");
        int jamMasuk = input.nextInt();
        System.out.print("Masukkan jam keluar: ");
        int jamKeluar = input.nextInt();

        // Menghitung lama kerja dengan mempertimbangkan format 12 jam
        int lamaKerja;
        if (jamKeluar >= jamMasuk) {
            lamaKerja = jamKeluar - jamMasuk;
        } else {
            lamaKerja = (12 - jamMasuk) + jamKeluar;
        }

        System.out.println("Lama bekerja: " + lamaKerja + " Jam");
    }
}
