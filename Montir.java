public class Montir extends Motor{
    protected String id_montir;
    protected String nama_montir;

    public int total_harga(int harga, int service) {
        System.out.println("-");
        return 0;
    }

    public Montir(int id_motor) {
        super(id_motor);
    }

    public String getId_montir() {
        return id_montir;
    }

    public void setId_montir() {
        this.id_montir = id_montir;
    }

    public String getNama_montir() {
        return nama_montir;
    }

    public void setNama_montir(String nama_montir) {
        this.nama_montir = nama_montir;
    }
}