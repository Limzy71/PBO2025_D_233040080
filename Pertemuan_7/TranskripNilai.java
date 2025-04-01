package PBO_T3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {
  private Date tglCetak;
  private double ipk = 0.0;
  private List<KartuHasilStudi> kartuHasilStudi;
  private Mahasiswa mahasiswa;
  private Semester semester;

  public TranskripNilai(Mahasiswa mahasiswa, Semester semester) {
    super();
    this.mahasiswa = mahasiswa;
    this.semester = semester;
    this.kartuHasilStudi = new ArrayList<KartuHasilStudi>();
    tglCetak = new Date();
  }

  public void hitungIPK(KartuHasilStudi khs) {
    List<MataKuliah> daftarMataKuliah = khs.getDaftarMataKuliah();
    double totalNilai = 0;
    int totalSKS = 0;

    for (MataKuliah mk : daftarMataKuliah) {
      totalNilai += mk.nilaiIndex() * mk.getSks();
      totalSKS += mk.getSks();
      }
      this.ipk = totalNilai / totalSKS;
    }

  public void addKHS(KartuHasilStudi khs) {
    kartuHasilStudi.add(khs);
    hitungIPK(khs);
  }

  public void display() {
    System.out.println(mahasiswa.display());
    System.out.println(semester.display());
    System.out.println("Tanggal Cetak: " + tglCetak.toString());
    System.out.println("IPK: " + ipk);
    for (KartuHasilStudi khs : kartuHasilStudi) {
      System.out.println(khs.display());
    }
  }

  // Setter & Getter
  public Date getTglCetak() {
    return tglCetak;
  }

  public void setTglCetak(Date tglCetak) {
    this.tglCetak = tglCetak;
  }

  public double getIpk() {
    return ipk;
  }

  public void setIpk(double ipk) {
    this.ipk = ipk;
  }

  public List<KartuHasilStudi> getKartuHasilStudi() {
    return kartuHasilStudi;
  }

  public void setKartuHasilStudi(List<KartuHasilStudi> kartuHasilStudi) {
    this.kartuHasilStudi = kartuHasilStudi;
  }

  public Mahasiswa getMahasiswa() {
    return mahasiswa;
  }

  public void setMahasiswa(Mahasiswa mahasiswa) {
    this.mahasiswa = mahasiswa;
  }

  public Semester getSemester() {
    return semester;
  }

  public void setSemester(Semester semester) {
    this.semester = semester;
  }
}
