package PBO_T3;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
  private String semester;
  private double ips;
  private List<MataKuliah> daftarMataKuliah;

  public KartuHasilStudi(String semester) {
    this.semester = semester;
    this.daftarMataKuliah = new ArrayList<MataKuliah>();
  }

  public void addMataKuliah(MataKuliah matakuliah) {
    daftarMataKuliah.add(matakuliah);
  }

  public String display() {
    StringBuilder sb = new StringBuilder();
    for (MataKuliah mk : daftarMataKuliah)
    {
    sb.append(mk.display()).append("\n");
    }
    return sb.toString();
  }

  public void hitungIPS() {
    double totalNilai = 0;
    int totalSKS = 0;

    for (MataKuliah mk : daftarMataKuliah) {
        totalNilai += mk.nilaiIndex() * mk.getSks();
        totalSKS += mk.getSks();
    }

    if (totalSKS > 0) {
      ips = totalNilai / totalSKS;
    } else {
      ips = 0;
    }
}

  public String getSemester() {
    return semester;
  }

  public void setSemester(String semester) {
    this.semester = semester;
  }

  public double getIps() {
    return ips;
  }

  public void setIps(double ips) {
    this.ips = ips;
  }

  public List<MataKuliah> getDaftarMataKuliah() {
    return daftarMataKuliah;
  }
}
