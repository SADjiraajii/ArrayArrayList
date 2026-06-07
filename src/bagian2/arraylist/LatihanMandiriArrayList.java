package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiriArrayList {
    public static void main(String[] args) {
        // --- Soal No 1: Daftar Belanja ---
        System.out.println("=== Latihan 1 (Daftar Belanja) ===");
        ArrayList<String> daftarBelanja = new ArrayList<>();
        daftarBelanja.add("Beras");
        daftarBelanja.add("Minyak Goreng");
        daftarBelanja.add("Gula");
        daftarBelanja.add("Telur");
        
        daftarBelanja.remove(1); // Menghapus item ke-2 (indeks 1)
        System.out.println("Isi daftar belanja: " + daftarBelanja);
        System.out.println("Jumlah akhir      : " + daftarBelanja.size());

        // --- Soal No 2: Nilai terbesar di ArrayList ---
        System.out.println("\n=== Latihan 2 (Nilai Terbesar) ===");
        ArrayList<Integer> nilai = new ArrayList<>();
        nilai.add(70); nilai.add(95); nilai.add(60);
        nilai.add(88); nilai.add(75);

        int max = nilai.get(0);
        for (int n : nilai) {
            if (n > max) max = n;
        }
        System.out.println("Terbesar: " + max);

        // --- Soal No 3: Nama berawalan A ---
        System.out.println("\n=== Latihan 3 (Nama Berawalan 'A') ===");
        ArrayList<String> nama = new ArrayList<>();
        String[] data = {"Andi", "Budi", "Ayu", "Citra", "Adit", "Doni"};
        for (String d : data) nama.add(d);

        for (String n : nama) {
            if (n.startsWith("A")) {
                System.out.println(n);
            }
        }
    }
}