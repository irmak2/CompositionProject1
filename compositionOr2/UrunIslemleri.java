package cumartesi.src.main.java.compositionOr2;

public class UrunIslemleri {
    public Urun urun;
    public UrunIslemleri(Urun urun){
        this.urun=urun;
    }
    public void satilanUrun(int satilan){
        System.out.println("Son durumda mağazada kalan ürün adedi: " +(urun.urunAdedi-satilan));
    }
}
