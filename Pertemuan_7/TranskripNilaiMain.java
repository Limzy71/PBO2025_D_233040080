package PBO_T3;

public class TranskripNilaiMain {
  public static void main(String[] args) {
    // Create objek Dosen
    Dosen dosen1 = new Dosen("Dr. Andi", "123456", "Algoritma Pemrograman 1", "Teknik Informatika");
    Dosen dosen2 = new Dosen("Dr. Budi", "654321", "Algoritma Pemrograman 2", "Teknik Informatika");
    Dosen dosen3 = new Dosen("Dr. Citra", "789012", "Pemrograman Berorientasi Objek", "Teknik Informatika");

    // Create objek MataKuliah
    MataKuliah mk1 = new MataKuliah("001", "Algoritma Pemrograman 1", "A", 3, dosen1);
    MataKuliah mk2 = new MataKuliah("002", "Algoritma Pemrograman 2", "BC", 3, dosen2);
    MataKuliah mk3 = new MataKuliah("003", "Pemrograman Berorientasi Objek", "B", 3, dosen3);

    // Create objek KHS
    KartuHasilStudi khs = new KartuHasilStudi("20222");
    khs.addMataKuliah(mk1);
    khs.addMataKuliah(mk2);
    khs.addMataKuliah(mk3);
    khs.hitungIPS();

    // Create objek Mahasiswa
    Mahasiswa mhs = new Mahasiswa("303040001", "Jhon");

    // Create objek Semester
    Semester semester = new Semester("Ganjil 2022/2023");

    // Create objek TranskripNilai
    TranskripNilai transkrip = new TranskripNilai(mhs, semester);
    // transkrip.hitungIPK(khs);
    transkrip.addKHS(khs);
    transkrip.display();
  }
}
