package bagian3.perpustakaan;

import java.util.ArrayList;

public class Perpustakaan {
    // Atribut koleksi (dari modul)
    private ArrayList<Buku> koleksi = new ArrayList<>();

    // Method dasar (dari modul)
    public void tambahBuku(Buku buku) {
        koleksi.add(buku);
    }

    // Method dasar (dari modul)
    public void tampilkanKoleksi() {
        System.out.println("== Koleksi Perpustakaan ==");
        for (int i = 0; i < koleksi.size(); i++) {
            Buku b = koleksi.get(i);
            System.out.println((i + 1) + ". " + b.info());
        }
    }

    // Method dasar (dari modul)
    public void pinjamBuku(String judul) {
        for (Buku b : koleksi) {
            if (b.getJudul().equalsIgnoreCase(judul)) {
                if (b.isDipinjam()) {
                    System.out.println(judul + " sedang dipinjam.");
                } else {
                    b.setDipinjam(true);
                    System.out.println(judul + " berhasil dipinjam.");
                }
                return;
            }
        }
        System.out.println("Buku " + judul + " tidak ditemukan.");
    }

    // TAMBAHAN LATIHAN 3.4 NO. 1: Method kembalikanBuku
    public void kembalikanBuku(String judul) {
        for (Buku b : koleksi) {
            if (b.getJudul().equalsIgnoreCase(judul)) {
                b.setDipinjam(false);
                System.out.println(judul + " telah dikembalikan.");
                return;
            }
        }
        System.out.println("Buku " + judul + " tidak ditemukan.");
    }

    // TAMBAHAN LATIHAN 3.4 NO. 3: Method cariPenulis
    public void cariPenulis(String penulis) {
        System.out.println("== Hasil Pencarian Penulis: " + penulis + " ==");
        boolean ditemukan = false;
        for (Buku b : koleksi) {
            if (b.getPenulis().equalsIgnoreCase(penulis)) {
                System.out.println("- " + b.info());
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada buku karya " + penulis + " di perpustakaan.");
        }
    }

    // Method dasar (dari modul)
    public int jumlahTersedia() {
        int jumlah = 0;
        for (Buku b : koleksi) {
            if (!b.isDipinjam()) {
                jumlah++;
            }
        }
        return jumlah;
    }
}