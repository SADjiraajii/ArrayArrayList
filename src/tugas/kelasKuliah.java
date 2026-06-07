package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    // Menyimpan banyak objek Mahasiswa di dalam ArrayList
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    // Method untuk menambahkan mahasiswa ke dalam koleksi
    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
    }

    // Method untuk menghitung rata-rata nilai kelas
    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) return 0;
        double total = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            total += m.getNilai();
        }
        return total / daftarMahasiswa.size();
    }

    // Method untuk menghitung jumlah mahasiswa yang lulus
    public int jumlahLulus() {
        int lulusCount = 0;
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.lulus()) {
                lulusCount++;
            }
        }
        return lulusCount;
    }

    // Method untuk menampilkan semua data mahasiswa dalam format tabel rapi
    public void tampilkanSemua() {
        System.out.println("-------------------------------------------------");
        System.out.printf("%-15s %-12s %-6s %-10s\n", "Nama", "NPM", "Nilai", "Status");
        System.out.println("-------------------------------------------------");
        for (Mahasiswa m : daftarMahasiswa) {
            String status = m.lulus() ? "LULUS" : "TIDAK LULUS";
            System.out.printf("%-15s %-12s %-6.2f %-10s\n", m.getNama(), m.getNpm(), m.getNilai(), status);
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Total Mahasiswa di Koleksi: " + daftarMahasiswa.size());
    }
}