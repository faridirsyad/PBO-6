public class Service extends Motor{
    protected int id_Service;
    protected String jenis;
    protected String merk;
    protected String keluhan;
    protected int harga;

    public Service(int id_motor) {
        super(id_motor);
    }

    @Override
    public void Service(){
        System.out.println("1. Service + Ganti Oli , 120000");
        System.out.println("2. Service , 70000");
        System.out.println("3. Ganti Oli , 50000");
    }

    public int getId_Service() {
        return id_Service;
    }

    public void setId_Service(int id_Service) {
        this.id_Service = id_Service;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
