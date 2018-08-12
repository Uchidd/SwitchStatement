package uchidd.id;

import java.util.Scanner;

public class MemilihJenisKelamin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("======Memilih Jenis Kelamin======");
        System.out.println("=================================");
        System.out.println("Masukan L untuk memlih Laki-Laki.");
        System.out.println("Masukan P untuk memlih Perempuan.");
        System.out.println("=================================");
        System.out.print("Masukan Pilihan [L/P]: ");
        String pilih = scanner.nextLine();

        switch (pilih) {
            case "L":
                System.out.println("========================================");
                System.out.println("Kelamin Yang Anda Pilih Adalah Laki-Laki");
                System.out.println("========================================");
                break;
            case "P":
                System.out.println("========================================");
                System.out.println("Kelamin Yang Anda Pilih Adalah Perempuan");
                System.out.println("========================================");
                break;
             default:
                 System.out.println("=================================");
                 System.out.println("!!!ERROR!!ERROR!!ERROR!!ERROR!!!");
                 System.out.println("=================================");
        }
    }
}
