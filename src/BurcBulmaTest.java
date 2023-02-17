import java.util.Scanner;

public class BurcBulmaTest {

    public static void main(String[] args) {

        String month;
        int day;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğum tarihi ay: ");
        month = input.nextLine();

        System.out.print("Doğum tarihi gün:");
        day = input.nextInt();

        if (month.equals("Ocak")) {
            if (day >= 22) {
                System.out.println("Burcunuz Kova.");
            } else {
                System.out.println("Burcunuz Oğlak.");
            }

        } else if (month.equals("Şubat")) {
            if (day >= 20) {
                System.out.println("Burcunuz Balık.");
            } else {
                System.out.println("Burcunuz Kova.");
            }
        } else if (month.equals("Mart")) {
            if (day <= 20) {
                System.out.println("Burcunuz Balık.");
            } else {
                System.out.println("Burcunuz Koç.");
            }
        } else if (month.equals("Nisan")) {
            if (day <= 20) {
                System.out.println("Burcunuz Koç.");
            } else {
                System.out.println("Burcunuz Boğa.");
            }
        } else if (month.equals("Mayıs")) {
            if (day < 22) {
                System.out.println("Burcunuz Boğa.");
            } else {
                System.out.println("Burcunuz İkizler.");
            }
        }else if (month.equals("Haziran")) {
            if (day < 23) {
                System.out.println("Burcunuz İkizler.");
            } else {
                System.out.println("Burcunuz Yengeç.");
            }
        } else if (month.equals("Temmuz")) {
            if (day < 23) {
                System.out.println("Burcunuz Yengeç.");
            } else {
                System.out.println("Burcunuz Aslan.");
            }
        } else if (month.equals("Ağustos")) {
            if (day < 23) {
                System.out.println("Burcunuz Aslan.");
            } else {
                System.out.println("Burcunuz Başak.");
            }
        } else if (month.equals("Eylül")) {
            if (day < 23) {
                System.out.println("Burcunuz Başak.");
            } else {
                System.out.println("Burcunuz Terazi.");
            }
        } else if (month.equals("Ekim")) {
            if (day <=23) {
                System.out.println("Burcunuz Terazi.");
            } else {
                System.out.println("Burcunuz Akrep.");
            }
        }else if (month.equals("Kasım")) {
            if (day < 22) {
                System.out.println("Burcunuz Akrep.");
            } else {
                System.out.println("Burcunuz Yay.");
            }
        }else if (month.equals("Aralık")) {
            if (day < 22) {
                System.out.println("Burcunuz Yay.");
            } else {
                System.out.println("Burcunuz Oğlak.");


            }

        }



    }
}