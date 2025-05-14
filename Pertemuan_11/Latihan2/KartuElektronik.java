package P11_AbstractInterface;

// Class KartuElektronik mengimplementasikan interface Kartu
public class KartuElektronik implements Kartu{
	    // Properti kodeBank untuk menyimpan kode bank
	    private String kodeBank;

	    // Properti pin untuk menyimpan PIN kartu
	    private String pin;

	    // Constructor KartuElektronik dengan parameter kodeBank dan pin
	    public KartuElektronik(String kodeBank, String pin) {
	        super(); // Memanggil constructor Object (bisa dihapus juga sebenarnya)
	        this.kodeBank = kodeBank;
	        this.pin = pin;
	    }

	    // Implementasi method otentikasi dari interface Kartu
	    // Mengecek apakah pin yang dimasukkan (pinInput) sama dengan pin yang disimpan di properti
	    @Override
	    public boolean otentikasi(String pinInput) {
	        if (pin.equals(pinInput))
	            return true;
	        else
	            return false;
	    }

	    // Implementasi method encode dari interface Kartu
	    // Sementara belum diisi (return null)
	    @Override
	    public String encode(String pin) {
	        // melakukan enkripsi inputan PIN
	        return null;
	    }
}
