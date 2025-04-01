package PBO_T3;

public class MataKuliah {
	private String kode;
	private String nama;
	private String index;
	private int sks;
	private Dosen dosen;
	
	// Konstruktor
	public MataKuliah(String kode, String nama, String index, int sks, Dosen dosen) {
		super();
		this.kode = kode;
		this.nama = nama;
		this.index = index;
		this.sks = sks;
		this.dosen = dosen;
	}
	
	// Method	
	public double nilaiIndex() {
		switch (index) {
		case "A":
			return 4.0;
		case "AB":
			return 3.5;
		case "B":
			return 3.0;
		case "BC":
			return 2.5;
		case "C":
			return 2.0;
		case "D":
			return 1.0;
		case "E":
			return 0.0;
		default:
			return 0.0; // Jika index tidak valid
		}
	}

	// Getter dan Setter
	public String getKode()
	{
		return kode;
	}
	
	public void setKode(String kode) {
		this.kode = kode;
	}

	public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

	public String getIndex() {
    return index;
  }

  public void setIndex(String index) {
    this.index = index;
  }
	
	public int getSks() {
		return sks;
	}

	public void setSks(int sks) {
    this.sks = sks;
  }

	public Dosen getDosen() {
    return dosen;
  }

  public void setDosen(Dosen dosen) {
    this.dosen = dosen;
  }
	
	public String display() {
		return kode + " - " + nama + " - " + sks + " SKS - Dosen: " + (dosen != null ? dosen.display() : "Tidak ada dosen");
  }
}
