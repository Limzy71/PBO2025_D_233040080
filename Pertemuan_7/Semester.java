package PBO_T3;

public class Semester {
  private String namaSemester; // Contoh: "Ganjil 2022/2023"

  // Konstruktor
  public Semester(String namaSemester) {
    this.namaSemester = namaSemester;
  }

  // Getter dan Setter
  public String getNamaSemester() {
    return namaSemester;
  }

  public void setNamaSemester(String namaSemester) {
    this.namaSemester = namaSemester;
  }

  // Metode display untuk menampilkan informasi semester
  public String display() {
    return "Semester: " + namaSemester;
  }
}
