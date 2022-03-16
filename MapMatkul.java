package com.dicoding.javafundamental.collection;
//mengimport semua collection sekaligus (*)
import java.util.*;

public class MapMatkul {

    public static void main(String[] args) {
        Map<String, String> MapMatkul = new TreeMap();

        //method put() untuk menambahkan objek ke Set
        MapMatkul.put("TI001", "Technopreneurship");
        MapMatkul.put("TI005", "Arsitektur Sistem TI");
        MapMatkul.put("TI002", "Sistem Informasi Menajemen");
        MapMatkul.put("TI009", "Teknologi Basis Data");
        MapMatkul.put("TI004", "Jaringan Komputer dan Komunikasi");
        MapMatkul.put("TI006", "Pemrograman Berorientasi Objek");
        //menambahkan objek matkul "Pemrograman Berorientasi Objek" dua kali
        MapMatkul.put("TI006", "Pemrograman Berorientasi Objek");
        MapMatkul.put("TI003", "Kewarganegaraan");

        //mencetak SetMatkul
        System.out.println(MapMatkul);
        //menambahkan objek matkul "Bahasa Indonesia
        MapMatkul.put("TI015 ", " Bahasa Bali");
        //mencetak SetMatkul setelah penambahan
        System.out.println(MapMatkul);
        //mencetak matkul Pada Key TI001
        System.out.println(MapMatkul.get("TI001"));

        // method size() untuk mendapatkan ukuran Set
        System.out.println("Map Matkul awal : (size = "+ MapMatkul.size() +")");
        for (String key : MapMatkul.keySet()) { // looping key dari Map
            // method get() untuk melihat isi Map berdasarkan key
            System.out.println("\t " + key + " : " + MapMatkul.get(key));
        }

        // method remove() untuk mengeluarkan objek dari Map
        MapMatkul.remove("TI001");

        System.out.println("Map Matkul akhir: (size = "+ MapMatkul.size() +")");
        for (String key : MapMatkul.keySet()) { // looping key dari Map
            // method get() untuk melihat isi Map berdasarkan key
            System.out.println("\t " + key + " : " + MapMatkul.get(key));
        }

    }
}
