package uchidd.id;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

	    System.out.println("Coffe Machine");
	    System.out.println("======================");
	    System.out.println("[555] Espresso");
	    System.out.println("[312] Coffelatte");
	    System.out.println("[CC] Cappucino");
	    System.out.println("======================");
	    System.out.print("Masukan Kode Untuk Memilih: ");
		int pilihinput = scanner.nextInt();

		//TODO 1: Membuat Switch & Case untuk Action
		switch (pilihinput) {
			case 555:
				System.out.print("Pilihan anda Espresso: Silahkan dinikmati...");
				break;
			case 312:
				System.out.print("Pilihan anda Coffelatte: Silahkan dinikmati...");
				break;
			case 629:
				System.out.print("Pilihan anda Cappucino: Silahkan dinikmati...");
				break;
		}
    }
}
