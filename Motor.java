import java.util.Scanner;

public class Motor {
    private int id_motor;

    public Motor(int id_motor) {
        this.id_motor = id_motor;
    }

    public void Service(){
        Scanner in = new Scanner(System.in);
        System.out.println("Pilih Service ");
        System.out.println("1. Service + Ganti Oli");
        System.out.println("2. Service Biasa");
        System.out.println("3. Ganti Oli");
        System.out.println("Masukkan Pilihan : ");
        System.out.println("Id Motor     : ");
        id_motor = in.nextInt();
    }

}
