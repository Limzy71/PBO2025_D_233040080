package PraktekKelasAbstrakInterface;

public class SepedaMotorListrik implements KendaraanListrik {
	 private String merk;
	    private int tahun;
	    private double kapasitasBaterai;
	    private double levelBaterai;

	    // Constructor untuk menginisialisasi atribut
	    public SepedaMotorListrik(String merk, int tahun, double kapasitasBaterai) {
	        this.merk = merk;
	        this.tahun = tahun;
	        this.kapasitasBaterai = kapasitasBaterai;
	        this.levelBaterai = kapasitasBaterai;  // Awalnya baterai penuh
	    }

	    // Implementasi dari method charge() untuk sepeda motor listrik
	    @Override
	    public void charge() {
	        levelBaterai = kapasitasBaterai; // Mengisi baterai penuh
	        System.out.println("Sepeda Motor Listrik " + merk + " sedang di-charge.");
	    }

	    // Implementasi dari method move() untuk sepeda motor listrik
	    @Override
	    public void move() {
	        if (levelBaterai > 0) {
	            System.out.println("Sepeda Motor Listrik " + merk + " sedang bergerak.");
	            levelBaterai -= 5; // Mengurangi baterai saat kendaraan bergerak
	        } else {
	            System.out.println("Baterai kosong, sepeda motor tidak bisa bergerak.");
	        }
	    }

	    // Implementasi dari method batteryLevel() untuk mengetahui level baterai
	    @Override
	    public double batteryLevel() {
	        return levelBaterai;
	    }
}
