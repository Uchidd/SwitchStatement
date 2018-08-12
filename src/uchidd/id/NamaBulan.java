package uchidd.id;;

import java.util.Scanner;

public class NamaBulan {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("================================================================================");
        System.out.println("Mencari Data Nama Bulan Menggunakan Urutannya.");
        System.out.println("================================================================================");
        System.out.println("Pilih Bulan Dalam Tahun:");
        System.out.println("[1] Masehi");
        System.out.println("[2] Hijriyah");
        System.out.println("================================================================================");
        System.out.print("Masukan Pilihan [1/2]: ");
        int tahun = scanner.nextInt();

        if (tahun == 1) {
            System.out.println("================================================================================");
            System.out.println("Anda Memilih Tahun Masehi.");
            System.out.println("================================================================================");
            System.out.print("Sekarang Masukan Angka Urutan Bulan Yang Ingin Dicari [1/12]: ");
            int bulan = scanner.nextInt();

            switch (bulan) {
                case 1:
                    System.out.println("================================================================================");
                    System.out.println("Data Ditemukan!");
                    System.out.println("Nama Bulan Dengan Urutan Pertama Di Dalam Tahun Masehi Yaitu Januari.");
                    System.out.println("================================================================================");
                    break;
                case 2:
                    System.out.println("================================================================================");
                    System.out.println("Data Ditemukan!");
                    System.out.println("Nama Bulan Dengan Urutan Kedua Di Dalam Tahun Masehi Yaitu Febuari.");
                    System.out.println("================================================================================");
                    break;
                case 3:
                    System.out.println("================================================================================");
                    System.out.println("Data Ditemukan!");
                    System.out.println("Nama Bulan Dengan Urutan Ketiga Di Dalam Tahun Masehi Yaitu Maret.");
                    System.out.println("================================================================================");
                    break;
                case 4:
                    System.out.println("================================================================================");
                    System.out.println("Data Ditemukan!");
                    System.out.println("Nama Bulan Dengan Urutan Kempat Di Dalam Tahun Masehi Yaitu April.");
                    System.out.println("================================================================================");
                    break;
                case 5:
                    System.out.println("================================================================================");
                    System.out.println("Data Ditemukan!");
                    System.out.println("Nama Bulan Dengan Urutan Kelima Di Dalam Tahun Masehi Yaitu Mei.");
                    System.out.println("================================================================================");
                    break;
                case 6:
                    System.out.println("================================================================================");
                    System.out.println("Data Ditemukan!");
                    System.out.println("Nama Bulan Dengan Urutan Keenam Di Dalam Tahun Masehi Yaitu Juni.");
                    System.out.println("================================================================================");
                    break;
                case 7:
                    System.out.println("================================================================================");
                    System.out.println("Data Ditemukan!");
                    System.out.println("Nama Bulan Dengan Urutan Ketujuh Di Dalam Tahun Masehi Yaitu Juli.");
                    System.out.println("================================================================================");
                    break;
                case 8:
                    System.out.println("================================================================================");
                    System.out.println("Data Ditemukan!");
                    System.out.println("Nama Bulan Dengan Urutan Kedelapan Di Dalam Tahun Masehi Yaitu Agustus.");
                    System.out.println("================================================================================");
                    break;
                case 9:
                    System.out.println("================================================================================");
                    System.out.println("Data Ditemukan!");
                    System.out.println("Nama Bulan Dengan Urutan Kesembilan Di Dalam Tahun Masehi Yaitu September.");
                    System.out.println("================================================================================");
                    break;
                case 10:
                    System.out.println("================================================================================");
                    System.out.println("Data Ditemukan!");
                    System.out.println("Nama Bulan Dengan Urutan Kesepuluh Di Dalam Tahun Masehi Yaitu Oktober.");
                    System.out.println("================================================================================");
                    break;
                case 11:
                    System.out.println("================================================================================");
                    System.out.println("Data Ditemukan!");
                    System.out.println("Nama Bulan Dengan Urutan Kesebelas Di Dalam Tahun Masehi Yaitu November.");
                    System.out.println("================================================================================");
                    break;
                case 12:
                    System.out.println("================================================================================");
                    System.out.println("Data Ditemukan!");
                    System.out.println("Nama Bulan Dengan Urutan Keduabelas Di Dalam Tahun Masehi Yaitu Desember.");
                    System.out.println("================================================================================");
                    break;
                default:
                    System.out.println("=====================================================");
                    System.out.println("Data Tidak Ada!!!");
                    System.out.println("=====================================================");
            }
        } else if (tahun == 2) {
            System.out.println("================================================================================");
            System.out.println("Anda Memilih Tahun Hijriyah.");
            System.out.println("================================================================================");
            System.out.print("Sekarang Masukan Angka Urutan Bulan Yang Ingin Dicari [1/12]: ");
            int bulan = scanner.nextInt();

            switch (bulan) {
                case 1:
                    System.out.println("================================================================================");
                    System.out.println("Data Ditemukan!");
                    System.out.println("Nama Bulan Dengan Urutan Pertama Di Dalam Tahun Hijiriyah Yaitu Muharram.");
                    System.out.println("================================================================================");
                    break;
                case 2:
                    System.out.println("================================================================================");
                    System.out.println("Data Ditemukan!");
                    System.out.println("Nama Bulan Dengan Urutan Kedua Di Dalam Tahun Hijiriyah Yaitu Safar.");
                    System.out.println("================================================================================");
                    break;
                case 3:
                    System.out.println("================================================================================");
                    System.out.println("Data Ditemukan!");
                    System.out.println("Nama Bulan Dengan Urutan Ketiga Di Dalam Tahun Hijiriyah Yaitu Rabiul awal.");
                    System.out.println("================================================================================");
                    break;
                case 4:
                    System.out.println("================================================================================");
                    System.out.println("Data Ditemukan!");
                    System.out.println("Nama Bulan Dengan Urutan Kempat Di Dalam Tahun Hijiriyah Yaitu Rabiul akhir.");
                    System.out.println("================================================================================");
                    break;
                case 5:
                    System.out.println("================================================================================");
                    System.out.println("Data Ditemukan!");
                    System.out.println("Nama Bulan Dengan Urutan Kelima Di Dalam Tahun Hijiriyah Yaitu Jumadil awal.");
                    System.out.println("================================================================================");
                    break;
                case 6:
                    System.out.println("================================================================================");
                    System.out.println("Data Ditemukan!");
                    System.out.println("Nama Bulan Dengan Urutan Keenam Di Dalam Tahun Hijiriyah Yaitu Jumadil akhir.");
                    System.out.println("================================================================================");
                    break;
                case 7:
                    System.out.println("================================================================================");
                    System.out.println("Data Ditemukan!");
                    System.out.println("Nama Bulan Dengan Urutan Ketujuh Di Dalam Tahun Hijiriyah Yaitu Rajab.");
                    System.out.println("================================================================================");
                    break;
                case 8:
                    System.out.println("================================================================================");
                    System.out.println("Data Ditemukan!");
                    System.out.println("Nama Bulan Dengan Urutan Kedelapan Di Dalam Tahun Hijiriyah Yaitu Sya'ban.");
                    System.out.println("================================================================================");
                    break;
                case 9:
                    System.out.println("================================================================================");
                    System.out.println("Data Ditemukan!");
                    System.out.println("Nama Bulan Dengan Urutan Kesembilan Di Dalam Tahun Hijiriyah Yaitu Ramadhan.");
                    System.out.println("================================================================================");
                    break;
                case 10:
                    System.out.println("================================================================================");
                    System.out.println("Data Ditemukan!");
                    System.out.println("Nama Bulan Dengan Urutan Kesepuluh Di Dalam Tahun Hijiriyah Yaitu Syawal.");
                    System.out.println("================================================================================");
                    break;
                case 11:
                    System.out.println("================================================================================");
                    System.out.println("Data Ditemukan!");
                    System.out.println("Nama Bulan Dengan Urutan Kesebelas Di Dalam Tahun Hijiriyah Yaitu Dzulkaidah.");
                    System.out.println("================================================================================");
                    break;
                case 12:
                    System.out.println("================================================================================");
                    System.out.println("Data Ditemukan!");
                    System.out.println("Nama Bulan Dengan Urutan Keduabelas Di Dalam Tahun Hijiriyah Yaitu Dzulhijjah.");
                    System.out.println("================================================================================");
                    break;
                default:
                    System.out.println("=====================================================");
                    System.out.println("Data Tidak Ada!!!");
                    System.out.println("=====================================================");
            }
        }

//        switch (bulan) {
//            case 1:
//            System.out.println("=====================================================");
//            System.out.println("Data Ditemukan!");
//            System.out.println("Nama Bulan Dengan Urutan Pertama Yaitu Januari.");
//            System.out.println("=====================================================");
//            break;
//            case 2:
//            System.out.println("=====================================================");
//            System.out.println("Data Ditemukan!");
//            System.out.println("Nama Bulan Dengan Urutan Kedua Yaitu Febuari.");
//            System.out.println("=====================================================");
//            break;
//            case 3:
//            System.out.println("=====================================================");
//            System.out.println("Data Ditemukan!");
//            System.out.println("Nama Bulan Dengan Urutan Ketiga Yaitu Maret.");
//            System.out.println("=====================================================");
//            break;
//            case 4:
//            System.out.println("=====================================================");
//            System.out.println("Data Ditemukan!");
//            System.out.println("Nama Bulan Dengan Urutan Kempat Yaitu April.");
//            System.out.println("=====================================================");
//            break;
//            case 5:
//            System.out.println("=====================================================");
//            System.out.println("Data Ditemukan!");
//            System.out.println("Nama Bulan Dengan Urutan Kelima Yaitu Mei.");
//            System.out.println("=====================================================");
//            break;
//            case 6:
//            System.out.println("=====================================================");
//            System.out.println("Data Ditemukan!");
//            System.out.println("Nama Bulan Dengan Urutan Keenam Yaitu Juni.");
//            System.out.println("=====================================================");
//            break;
//            case 7:
//            System.out.println("=====================================================");
//            System.out.println("Data Ditemukan!");
//            System.out.println("Nama Bulan Dengan Urutan Ketujuh Yaitu Juli.");
//            System.out.println("=====================================================");
//            break;
//            case 8:
//            System.out.println("=====================================================");
//            System.out.println("Data Ditemukan!");
//            System.out.println("Nama Bulan Dengan Urutan Kedelapan Yaitu Agustus.");
//            System.out.println("=====================================================");
//            break;
//            case 9:
//            System.out.println("=====================================================");
//            System.out.println("Data Ditemukan!");
//            System.out.println("Nama Bulan Dengan Urutan Kesembilan Yaitu September.");
//            System.out.println("=====================================================");
//            break;
//            case 10:
//            System.out.println("=====================================================");
//            System.out.println("Data Ditemukan!");
//            System.out.println("Nama Bulan Dengan Urutan Kesepuluh Yaitu Oktober.");
//            System.out.println("=====================================================");
//            break;
//            case 11:
//            System.out.println("=====================================================");
//            System.out.println("Data Ditemukan!");
//            System.out.println("Nama Bulan Dengan Urutan Kesebelas Yaitu November.");
//            System.out.println("=====================================================");
//            break;
//            case 12:
//            System.out.println("=====================================================");
//            System.out.println("Data Ditemukan!");
//            System.out.println("Nama Bulan Dengan Urutan Keduabelas Yaitu Desember.");
//            System.out.println("=====================================================");
//            break;
//            default:
//                System.out.println("=====================================================");
//                System.out.println("Data Tidak Ada!!!");
//                System.out.println("=====================================================");
//        }


    }
}
