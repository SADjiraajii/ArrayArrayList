// Nama : Sayyid Ali Djiraajii
// NPM  : 2410010540

package tugas;

public class MainTugas {
    public static void main(String[] args) {
        // Soal No 4: Menyimpan daftar nama mata kuliah dalam array String dan menampilkannya
        String[] mataKuliah = {"Pemrograman Berbasis Objek 1", "Basis Data", "Struktur Data"};
        System.out.println("=== Daftar Mata Kuliah ===");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }
        System.out.println();

        // Membuat objek pengelola KelasKuliah
        KelasKuliah kelas = new KelasKuliah();

        // Soal No 3: Menambah minimal 5 objek Mahasiswa sebagai data awal
        kelas.tambahMahasiswa(new Mahasiswa("Andi", "23100101", 85.5));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "23100102", 58.0));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "23100103", 90.0));
        kelas.tambahMahasiswa(new Mahasiswa("Dewi", "23100104", 72.5));
        kelas.tambahMahasiswa(new Mahasiswa("Eko", "23100105", 45.0));

        // Menampilkan data awal mahasiswa beserta status kelulusannya
        System.out.println("=== Data Awal Mahasiswa ===");
        kelas.tampilkanSemua();

        // Soal No 5: Menampilkan rata-rata nilai dan jumlah mahasiswa yang lulus
        System.out.println("Rata-rata Nilai Kelas   : " + kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus  : " + kelas.jumlahLulus());
        System.out.println();

        // Soal No 6: Menambahkan satu objek Mahasiswa baru ke dalam koleksi
        System.out.println("... Menambahkan mahasiswa baru ...\n");
        kelas.tambahMahasiswa(new Mahasiswa("Fahmi", "23100106", 78.0));

        // Soal No 6: Menampilkan kembali seluruh data terbaru beserta statistik terbarunya
        System.out.println("=== Data Terbaru Mahasiswa ===");
        kelas.tampilkanSemua();
        System.out.println("Rata-rata Nilai Terbaru : " + kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus  : " + kelas.jumlahLulus());
    }
}