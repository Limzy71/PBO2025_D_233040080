package PBO_T3;

public class Mahasiswa {
    private String nama;
	private String nrp;

    public Mahasiswa() {
    
    }

    public Mahasiswa(String nrp, String nama) {
    	super();
        this.nrp = nrp;
        this.nama = nama;
    }

    public String display() {
        return "NRP : " + nrp + ", Nama : " + nama;
    }
    
    // Setter dan Getter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }
}