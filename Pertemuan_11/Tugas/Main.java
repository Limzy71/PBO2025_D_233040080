package PraktekKelasAbstrakInterface;

public class Main {
	public static void main(String[] args) {
		// Membuat objek mobil dengan merk, tahun, kapasitas bahan bakar, dan jumlah
		// pintu
		Mobil mobil1 = new Mobil("Toyota", 2020, 50, 4);

		// Membuat objek sepeda motor dengan merk, tahun, kapasitas bahan bakar, dan
		// jenis mesin
		SepedaMotor motor1 = new SepedaMotor("Honda", 2021, 10, "4 Tak");

		// Menghidupkan mesin mobil
		mobil1.startEngine();
		// Menghidupkan mesin sepeda motor
		motor1.startEngine();

		// Menampilkan pesan kendaraan bergerak
		mobil1.move();
		motor1.move();

		// Menampilkan konsumsi bahan bakar mobil
		System.out.println("Konsumsi bahan bakar mobil: " + mobil1.fuelConsumption() + " liter per 100 km.");
		// Menampilkan konsumsi bahan bakar sepeda motor
		System.out.println("Konsumsi bahan bakar motor: " + motor1.fuelConsumption() + " liter per 100 km.");
	}
}
