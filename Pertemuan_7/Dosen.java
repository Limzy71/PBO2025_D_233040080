package PBO_T3;

public class Dosen {
  private String nama;
  private String nip;
  private String matkul;
  private String prodi;

  public Dosen(String nama, String nip, String matkul, String prodi) {
    this.nama = nama;
    this.nip = nip;
    this.matkul = matkul;
    this.prodi = prodi;
  }

  public Dosen() {
  
  }

  // Getter dan Setter
  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getNip() {
    return nip;
  }

  public void setNip(String nip) {
    this.nip = nip;
  }

  public String getMatkul() {
    return matkul;
  }

  public void setMatkul(String matkul) {
    this.matkul = matkul;
  }

  public String getProdi() {
    return prodi;
  }

  public void setProdi(String prodi) {
    this.prodi = prodi;
  }

  // Metode display untuk menampilkan data dosen
  public String display() {
    return "Nama: " + nama + ", NIP: " + nip + ", Mata Kuliah: " + matkul + ", Prodi: " + prodi;
  }
}
