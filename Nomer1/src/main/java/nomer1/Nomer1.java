
package nomer1;

import java.util.Scanner;

public class Nomer1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input tiga huruf kecil dari pengguna
        System.out.print("Masukkan tiga huruf kecil: ");
        char huruf1 = input.next().charAt(0);
        char huruf2 = input.next().charAt(0);
        char huruf3 = input.next().charAt(0);

        // Mengecek apakah huruf pertama dan ketiga adalah konsonan
        boolean isKonsonan1 = !("aeiou".indexOf(huruf1) >= 0);
        boolean isVokal2 = ("aeiou".indexOf(huruf2) >= 0);
        boolean isKonsonan3 = !("aeiou".indexOf(huruf3) >= 0);

        // Menampilkan hasil
        if (isKonsonan1 && isVokal2 && isKonsonan3) {
            System.out.println("Pola yang dimasukkan BENAR");
        } else {
            System.out.println("Pola yang dimasukkan SALAH");
        }
    }
}
