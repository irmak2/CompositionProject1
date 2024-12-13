package cumartesi.src.main.java.compositionOr2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Ürün çeşidini giriniz: ");
        String urunCesidi = scanner.nextLine();

        System.out.println("İlk başta mağazada bulunan ürün adedini giriniz: ");
        int urunAdedi=scanner.nextInt();

        System.out.println("Ürün fiyatını giriniz: ");
        int urunFiyati = scanner.nextInt();


        Urun urun=new Urun(urunCesidi,urunAdedi,urunFiyati);
        UrunIslemleri urunIslemleri=new UrunIslemleri(urun);

        System.out.println("Satilan ürün adedini giriniz: ");
        int satilan= scanner.nextInt();

        urunIslemleri.satilanUrun(satilan);
        scanner.close();
    }
}
