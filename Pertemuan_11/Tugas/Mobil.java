package PraktekKelasAbstrakInterface;

//Kelas Mobil yang merupakan turunan dari Kendaraan
public class Mobil extends Kendaraan {

	// Atribut jumlah pintu pada mobil
    private int jumlahPintu;

    // Constructor untuk menginisialisasi merk, tahun, kapasitas bahan bakar, dan jumlah pintu
    public Mobil(String merk, int tahun, double kapasitasBahanBakar, int jumlahPintu) {
        super(merk, tahun, kapasitasBahanBakar); // Memanggil constructor dari kelas induk (Kendaraan)
        this.jumlahPintu = jumlahPintu;
    }

    // Implementasi dari method startEngine() untuk mobil
    @Override
    public void startEngine() {
        System.out.println("Mesin mobil " + merk + " mulai dinyalakan.");
    }

    // Implementasi dari method move() untuk mobil
    @Override
    public void move() {
        System.out.println("Mobil " + merk + " sedang bergerak.");
    }

    // Implementasi dari method fuelConsumption() untuk menghitung konsumsi bahan bakar mobil
    @Override
    public double fuelConsumption() {
        // Menghitung konsumsi bahan bakar berdasarkan kapasitas bahan bakar mobil
        return kapasitasBahanBakar / 15; // Misalnya, per 15 km, 1 liter bahan bakar habis
    }
}
