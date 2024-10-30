import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Hesap Makinesi");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");
        System.out.print("Bir işlem seçin (1-4): ");
        int secim = scanner.nextInt();

//        if (secim != 1 && secim != 2 && secim != 3 && secim != 4) {
//            System.out.println("Yanlış bir tuşlama yaptınız");
//            System.exit(0);
//        }
        // Seçim koşulunu böyle de yapabilirsiniz 49. ve 52. satırlardaki gibi de yapabilirsiniz.

        System.out.println("Birinci sayıyı giriniz > ");
        double sayi1 = scanner.nextDouble();

        System.out.println("İkinci sayıyı giriniz > ");
        double sayi2 = scanner.nextDouble();

        double sonuc = 0;
        switch (secim) {
            case 1:
                sonuc = calculator.toplama(sayi1, sayi2);
                break;
            case 2:
                sonuc = calculator.çikarma(sayi1, sayi2);
                break;
            case 3:
                sonuc = calculator.carpma(sayi1, sayi2);
                break;
            case 4:
                try {
                    sonuc = calculator.bolme(sayi1, sayi2);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    scanner.close();
                    return;
                }
                break;
//            default:
//                System.out.println("Geçersiz seçim yaptınız.");
//                scanner.close();
//                return;
        }
        System.out.println("Yapılan işlem sonucu > " + sonuc);
        scanner.close();
    }
}