package PraktekKelasAbstrakInterface;

//Kelas SepedaMotor yang merupakan turunan dari Kendaraan
public class SepedaMotor extends Kendaraan {

	// Atribut jenis mesin sepeda motor
	private String jenisMesin;

	// Constructor untuk menginisialisasi merk, tahun, kapasitas bahan bakar, dan
	// jenis mesin
	public SepedaMotor(String merk, int tahun, double kapasitasBahanBakar, String jenisMesin) {
		super(merk, tahun, kapasitasBahanBakar); // Memanggil constructor dari kelas induk (Kendaraan)
		this.jenisMesin = jenisMesin;
	}

	// Implementasi dari method startEngine() untuk sepeda motor
	@Override
	public void startEngine() {
		System.out.println("Mesin sepeda motor " + merk + " mulai dinyalakan.");
	}

	// Implementasi dari method move() untuk sepeda motor
	@Override
	public void move() {
		System.out.println("Sepeda motor " + merk + " sedang bergerak.");
	}

	// Implementasi dari method fuelConsumption() untuk menghitung konsumsi bahan
	// bakar sepeda motor
	@Override
	public double fuelConsumption() {
		// Menghitung konsumsi bahan bakar berdasarkan kapasitas bahan bakar sepeda
		// motor
		return kapasitasBahanBakar / 30; // Misalnya, per 30 km, 1 liter bahan bakar habis
	}
}
