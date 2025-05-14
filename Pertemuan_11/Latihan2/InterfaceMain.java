package P11_AbstractInterface;

// Kelas utama untuk menjalankan program
public class InterfaceMain {
	    // Method main → titik awal program Java
	    public static void main(String[] args) {
	        // Membuat objek KartuElektronik dengan kodeBank "IF111" dan PIN "123"
	        KartuElektronik kartu = new KartuElektronik("IF111", "123");

	        // Melakukan otentikasi dengan input PIN "123"
	        // Lalu mencetak hasilnya ke layar
	        System.out.println("Otentikasi:" + kartu.otentikasi("123"));
	    }
}
