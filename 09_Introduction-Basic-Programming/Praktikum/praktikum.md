# Soal Prioritas 1

1. Buatlah sebuah program untuk menghitung luas bangun datar yaitu segitiga, persegi panjang dan lingkaran

import java.util.Scanner;

public class HitungLuasBangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Menghitung luas segitiga
        System.out.println("Luas segitiga: ");
        System.out.print("Input alas: ");
        double alasSegitiga = input.nextDouble();
        System.out.print("Input tinggi: ");
        double tinggiSegitiga = input.nextDouble();
        double luasSegitiga = 0.5 * alasSegitiga * tinggiSegitiga;
        System.out.println("Output: " + luasSegitiga);
        
        // Menghitung luas persegi panjang
        System.out.println("Luas persegi panjang: ");
        System.out.print("Input panjang: ");
        double panjangPersegiPanjang = input.nextDouble();
        System.out.print("Input lebar: ");
        double lebarPersegiPanjang = input.nextDouble();
        double luasPersegiPanjang = panjangPersegiPanjang * lebarPersegiPanjang;
        System.out.println("Output: " + luasPersegiPanjang);
        
        // Menghitung luas lingkaran
        System.out.println("Luas lingkaran: ");
        System.out.print("Input jari-jari: ");
        double jariJariLingkaran = input.nextDouble();
        double phi = 3.14;
        double luasLingkaran = phi * jariJariLingkaran * jariJariLingkaran;
        System.out.println("Output: " + luasLingkaran);
        
        input.close();
    }
}

2. Buatlah sebuah program untuk mengecek apakah hasil penjualan yang dilakukan mendapatkan keuntungan atau kerugian dengan nominal tertentu.

import java.util.Scanner;

public class CekKeuntungan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input harga beli dan harga jual
        System.out.print("Masukan harga beli: Rp. ");
        int hargaBeli = input.nextInt();
        System.out.print("Masukan harga jual: Rp. ");
        int hargaJual = input.nextInt();
        
        // Hitung keuntungan atau kerugian
        int selisih = hargaJual - hargaBeli;
        
        if (selisih > 0) {
            System.out.println("Untung sebesar: Rp. " + selisih);
        } else if (selisih < 0) {
            System.out.println("Rugi sebesar: Rp. " + Math.abs(selisih));
        } else {
            System.out.println("Sama saja");
        }
        
        input.close();
    }
}


# Soal Prioritas 2

1. Buatlah sebuah function dengan nama drawXYZ yang menjalankan proses dengan menggunakan looping dan menerima satu parameter bernama height. Buatlah sebuah pola kemunculan simbol X, Y, dan Z di print, dimana Y mewakili kelipatan ganjil, Z mewakili kelipatan genap dan X khusus urutan kelipatan 3.


2. Buatlah sebuah program untuk mencetak segitiga asterik

import java.util.Scanner;

public class Exercice2a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tinggi segitiga asterisk: ");
        int tinggi = input.nextInt();

        for (int count = 0; count < tinggi; count++) {
            for (int j = 0; j < count + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}




# Soal Eksplorasi
Buatlah sebuah program untuk melakukan enkripsi sederhana dengan kriteria enkripsi sebagai berikut:
Susunan alphabet (A B C ….. X Y Z) dilakukan pergeseran 10 urutan alphabet.


import java.util.Scanner;

public class EnkripsiSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan teks yang akan dienkripsi: ");
        String plaintext = input.nextLine();
        
        String ciphertext = enkripsi(plaintext);
        
        System.out.println("Output enkripsi: " + ciphertext);
        
        input.close();
    }

    public static String enkripsi(String teks) {
        StringBuilder hasilEnkripsi = new StringBuilder();

        for (int i = 0; i < teks.length(); i++) {
            char karakter = teks.charAt(i);

            if (Character.isLetter(karakter)) {
                char awal = Character.isLowerCase(karakter) ? 'a' : 'A';
                karakter = (char) (awal + (karakter - awal + 10) % 26);
            }

            hasilEnkripsi.append(karakter);
        }

        return hasilEnkripsi.toString();
    }
}
