package bagian3.perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] args) {
        // Membuat objek pengelola
        Perpustakaan perpus = new Perpustakaan();

        // Membuat objek Buku dengan menyertakan parameter tambahan tahun terbit (No. 2)
        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 1980));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));

        // Menampilkan koleksi awal
        perpus.tampilkanKoleksi();
        System.out.println();

        // Menguji fitur peminjaman (dari modul)
        perpus.pinjamBuku("Bumi Manusia");
        perpus.pinjamBuku("Bumi Manusia"); // coba pinjam kedua kali
        System.out.println();

        // UJI LATIHAN 3.4 NO. 1: Mengembalikan buku
        System.out.println("--- Menguji Pengembalian Buku ---");
        perpus.kembalikanBuku("Bumi Manusia");
        System.out.println();

        // UJI LATIHAN 3.4 NO. 3: Mencari buku berdasarkan penulis
        System.out.println("--- Menguji Pencarian Penulis ---");
        perpus.cariPenulis("Andrea Hirata");
        perpus.cariPenulis("Tere Liye"); // Mencoba penulis yang tidak terdaftar
        System.out.println();

        // Menampilkan kondisi akhir koleksi
        System.out.println("--- Status Akhir Koleksi ---");
        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
    }
}