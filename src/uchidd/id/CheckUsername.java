package uchidd.id;

import java.util.Scanner;

public class CheckUsername {

    public static void main(String[] main) {

        //USERNAME
        //1. Mursyid
        //2. Justin
        //3. Agatha
        //4. Alrick
        //5. Lady

        Scanner scanner = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("Check Username Kamu Disini...");
        System.out.println("=============================");
        System.out.print("Masukan Username [EX:Chelsea]: ");

        String name = scanner.nextLine();

        switch (name) {
            case "Mursyid":
                System.out.println("================================");
                System.out.println("Username Yang Anda Masukan Benar");
                System.out.println("================================");
                break;
            case "Justin":
                System.out.println("================================");
                System.out.println("Username Yang Anda Masukan Benar");
                System.out.println("================================");
                break;
            case "Agatha":
                System.out.println("================================");
                System.out.println("Username Yang Anda Masukan Benar");
                System.out.println("================================");
                break;
            case "Alrick":
                System.out.println("================================");
                System.out.println("Username Yang Anda Masukan Benar");
                System.out.println("================================");
                break;
            case "Lady":
                System.out.println("================================");
                System.out.println("Username Yang Anda Masukan Benar");
                System.out.println("================================");
                break;
             default:
                 System.out.println("================================");
                 System.out.println("!!ERROR!!!ERROR!!ERROR!!!ERROR!!");
                 System.out.println("================================");

        }

    }
}
