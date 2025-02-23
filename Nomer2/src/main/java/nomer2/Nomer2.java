/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package nomer2;

import java.util.Scanner;


public class Nomer2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input tiga sisi dari pengguna
        System.out.print("Masukkan tiga sisi: ");
        int sisi1 = input.nextInt();
        int sisi2 = input.nextInt();
        int sisi3 = input.nextInt();

        // Mengecek apakah semua sisi sama
        if (sisi1 == sisi2 && sisi2 == sisi3) {
            System.out.println("Termasuk Kubus");
        } else {
            System.out.println("Bukan Kubus");
        }
    }
}
