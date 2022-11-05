import java.util.Scanner;
public class Main {
    private static int id_motor;

    public static void main(String[] args) {
        String id_montir;
        String nama_montir;
        Montir mntr = new Montir(id_motor);
        Scanner in = new Scanner(System.in);
        System.out.println("Input Data Montir");
        System.out.println("Masukkan id montir = ");
        id_montir = in.nextLine();
        System.out.println("Masukkan Nama = ");
        nama_montir = in.nextLine();

        String id_customer;
        String nama_customer;
        String no_hp;
        Customer custom = new Customer();
        Scanner cs = new Scanner(System.in);
        System.out.println("Input Data Customer");
        System.out.println("Masukkan id customer : ");
        id_customer = cs.nextLine();
        System.out.println("Masukkan Nama Customer : ");
        nama_customer = cs.nextLine();
        System.out.println("Masukkan no hp : ");
        no_hp = cs.nextLine();

        int pilih, harga = 0;
        String kerusakan, service = null;
        Service ser = new Service(id_motor);
        Scanner servis = new Scanner(System.in);
        System.out.println("Pilih Service ");
        System.out.println("1. Service + Ganti Oli");
        System.out.println("2. Service Biasa ");
        System.out.println("3. Ganti Oli");
        System.out.println("Masukkan Pilihan :");
        pilih = servis.nextInt();

        if (pilih==1){
            harga=120000;
            service="Service + Ganti Oli";
            System.out.println("Masukkan Kerusakan : ");
            kerusakan = servis.nextLine();
        } else if (pilih==2) {
            harga=70000;
            service="Service Biasa";
            System.out.println("Masukkan Kerusakan : ");
            kerusakan = servis.nextLine();
        } else if (pilih==3) {
            harga=50000;
            service="Ganti Oli";
            System.out.println("Masukkan Kerusakan : ");
            kerusakan = servis.nextLine();
        }

        System.out.println("Data Bengkel");
        System.out.println("Montir          : "+nama_montir);
        System.out.println("Nama Customer   : "+nama_customer);
        System.out.println("Pilihan Service : "+pilih);
        System.out.println("Service         : "+service);
        System.out.println("Total Harga     : "+harga);

    }
}