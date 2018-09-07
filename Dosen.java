
public class Dosen {

	String nama;
	int nik;
	int lamaMengajar;
	
	public Dosen(String nama, int nik, int lamaMengajar) {
		super();
		this.nama = nama;
		this.nik = nik;
		this.lamaMengajar = lamaMengajar;
	}
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public int getNik() {
		return nik;
	}
	public void setNik(int nik) {
		this.nik = nik;
	}
	public int getLamaMengajar() {
		return lamaMengajar;
	}
	public void setLamaMengajar(int lamaMengajar) {
		this.lamaMengajar = lamaMengajar;
	}
	
}
