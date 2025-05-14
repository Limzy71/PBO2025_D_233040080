package PraktekKelasAbstrakInterface;

//Kelas abstrak Kendaraan yang mendefinisikan atribut umum dan metode abstrak
public abstract class Kendaraan {
	
	// Atribut yang digunakan untuk menyimpan merk, tahun, dan kapasitas bahan bakar kendaraan
	protected String merk;
	protected int tahun;
	protected double kapasitasBahanBakar;

	// Constructor untuk menginisialisasi merk, tahun, dan kapasitas bahan bakar
	public Kendaraan(String merk, int tahun, double kapasitasBahanBakar) {
		this.merk = merk;
		this.tahun = tahun;
		this.kapasitasBahanBakar = kapasitasBahanBakar;
	}

	// Method abstrak untuk menghidupkan mesin (harus diimplementasikan oleh kelas turunan)
	public abstract void startEngine();

	// Method abstrak untuk menggerakkan kendaraan (harus diimplementasikan oleh kelas turunan)
	public abstract void move();

	// Method abstrak untuk menghitung konsumsi bahan bakar (harus diimplementasikan oleh kelas turunan)
	public abstract double fuelConsumption();
}
