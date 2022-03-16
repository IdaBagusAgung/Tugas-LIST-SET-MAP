package com.dicoding.javafundamental.collection;
//mengimport semua collection sekaligus (*)
import java.util.*;

public class SetMatkul {

    public static void main(String[] args) {
        Set<String> SetMatkul = new LinkedHashSet<>();

        //method add() untuk menambahkan objek ke Set
        SetMatkul.add("Technopreneurship");
        SetMatkul.add("Arsitektur Sistem TI");
        SetMatkul.add("Sistem Informasi Menajemen");
        SetMatkul.add("Teknologi Basis Data");
        SetMatkul.add("Jaringan Komputer dan Komunikasi");
        SetMatkul.add("Pemrograman Berorientasi Objek");
        //menambahkan objek matkul "Pemrograman Berorientasi Objek" beberapa kali
        SetMatkul.add("Pemrograman Berorientasi Objek");
        SetMatkul.add("Pemrograman Berorientasi Objek");
        SetMatkul.add("Kewarganegaraan");

        //mencetak SetMatkul
        System.out.println(SetMatkul);
        //menambahkan objek matkul "Bahasa Inggris
        SetMatkul.add("Bahasa Inggris");
        //mencetak SetMatkul setelah penambahan
        System.out.println(SetMatkul);

        // method size() untuk mendapatkan ukuran Set
        System.out.println("Set Matkul awal : (size = " + SetMatkul.size() + ")");
        for (String Matkul : SetMatkul) {
            System.out.println("\t " + Matkul);
        }

        //method remove() untuk mengeluarkan objek dari Set
       SetMatkul.remove("Bahasa Inggris");

        System.out.println("Set Matkul akhir : (size = " + SetMatkul.size() + ")");
        for (String Matkul : SetMatkul) {
            System.out.println("\t " + Matkul);
        }
    }

}
