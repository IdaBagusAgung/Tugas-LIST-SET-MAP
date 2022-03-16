package com.dicoding.javafundamental.collection;
//mengimport semua collection sekaligus (*)
import java.util.*;

public class ListMatkul {
    public static void main(String[] args) {
        List<String> ListMatkul = new ArrayList<>();

        //method add() untuk menambahkan objek ke Set
        ListMatkul.add("Technopreneurship");
        ListMatkul.add("Arsitektur Sistem TI");
        ListMatkul.add("Sistem Informasi Menajemen");
        ListMatkul.add("Teknologi Basis Data");
        ListMatkul.add("Jaringan Komputer dan Komunikasi");
        ListMatkul.add("Pemrograman Berorientasi Objek");
        //menambahkan objek matkul "Pemrograman Berorientasi Objek" dua kali
        ListMatkul.add("Pemrograman Berorientasi Objek");
        ListMatkul.add("Kewarganegaraan");

        //mencetak ListMatkul
        System.out.println(ListMatkul);
        //menambahkan objek matkul "Bahasa Indonesia
        ListMatkul.add("Bahasa Indonesia");
        //mencetak SetMatkul setelah penambahan
        System.out.println(ListMatkul);
        //mencetak matkul yang berada pada indeks kedua
        System.out.println(ListMatkul.get(2));

        System.out.println("List Matkul Awal:");
        // method size() untuk mendapatkan ukuran List
        for (int i = 0; i < ListMatkul.size(); i++) {
            // method get() untuk melihat isi List pada index i
            System.out.println("\t index-"+ i +" = " + ListMatkul.get(i));
        }

        //method remove() untuk mengeluarkan objek dari List menggunakan nomor indeksnya
        ListMatkul.remove(5);

        System.out.println("List Matkul akhir:");
        for (int i = 0; i < ListMatkul.size(); i++) {
            System.out.println("\t index-"+ i +" = " + ListMatkul.get(i));
        }
    }
}
