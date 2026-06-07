package bagian3.perpustakaan;

public class Buku {
    // Atribut dasar (dari modul)
    private String judul;
    private String penulis;
    private boolean dipinjam;
    
    // TAMBAHAN LATIHAN 3.4 NO. 2: Atribut tahunTerbit
    private int tahunTerbit;

    // TAMBAHAN LATIHAN 3.4 NO. 2: Constructor diperbarui mendukung tahunTerbit
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.dipinjam = false; // buku baru dianggap tersedia
        this.tahunTerbit = tahunTerbit; 
    }

    // Getter dasar (dari modul)
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    // TAMBAHAN LATIHAN 3.4 NO. 2: Getter untuk tahunTerbit
    public int getTahunTerbit() {
        return tahunTerbit;
    }

    // Method dasar (dari modul)
    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }

    // TAMBAHAN LATIHAN 3.4 NO. 2: Method info diperbarui menampilkan tahun terbit
    public String info() {
        String status = dipinjam ? "Dipinjam" : "Tersedia";
        return judul + " (" + tahunTerbit + ") oleh " + penulis + " [" + status + "]";
    }
}