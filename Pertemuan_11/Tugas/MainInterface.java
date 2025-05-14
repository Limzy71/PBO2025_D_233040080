package PraktekKelasAbstrakInterface;

public class MainInterface {
	public static void main(String[] args) {
		// Membuat objek Mobil Listrik dengan merk, tahun, dan kapasitas baterai
		KendaraanListrik mobilListrik = new MobilListrik("Tesla", 2023, 100);

		// Membuat objek Sepeda Motor Listrik dengan merk, tahun, dan kapasitas baterai
		KendaraanListrik motorListrik = new SepedaMotorListrik("Zero", 2022, 50);

		// Mengisi baterai mobil listrik
		mobilListrik.charge();

		// Mengisi baterai sepeda motor listrik
		motorListrik.charge();

		// Menampilkan kendaraan bergerak
		mobilListrik.move();
		motorListrik.move();

		// Menampilkan level baterai mobil listrik
		System.out.println("Level baterai mobil: " + mobilListrik.batteryLevel() + " kWh.");

		// Menampilkan level baterai sepeda motor listrik
		System.out.println("Level baterai motor: " + motorListrik.batteryLevel() + " kWh.");
	}
}
