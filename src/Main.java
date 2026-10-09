import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {
        Uye ogrenci = new Uye("1", "İsmail Özkan", "ismailozkan7872@gmail.com", "1234");
        KutuphaneGorevlisi gorevli = new KutuphaneGorevlisi("2", "Nejat İşler", "nejatisler@gmail.com", "5678");

        Kitap roman = new Kitap("978-975-458-925-2", "Otomatik Portakal", "Anthony Burgess", 1962);
        KitapKopyasi kopya1 = new KitapKopyasi("001", roman);
        KitapKopyasi kopya2 = new KitapKopyasi("002", roman);

        gorevli.kitapEkle(roman);

        System.out.println("Kullanici: " + ogrenci.getAd() + " (" + ogrenci.getEposta() + ")");
        System.out.println("Gorevli: " + gorevli.getAd() + " (" + gorevli.getEposta() + ")");
        System.out.println("Kitap: " + roman.getBaslik());
        System.out.println("Toplam Kopya: " + roman.getFizikselKopyalar().size());
        System.out.println("Odunc Alinabilir mi: " + roman.oduncIste());

        LocalDate bugun = LocalDate.now();
        LocalDate iade = bugun.plusDays(14);

        OduncAlma islem = new OduncAlma("1", bugun, iade, ogrenci, kopya1);
        gorevli.oduncOnayla(islem);

        System.out.println("Barkod No: " + islem.getKitapKopyasi().getBarkodNo());
        System.out.println("Kopya Durum: " + kopya1.getDurum());
        System.out.println("Uyenin Kitap Sayisi: " + ogrenci.getOkudugumKitaplar().size());

        islem.setTeslimTarihi(bugun.plusDays(7));
        System.out.println("Iade Sonrasi Kopya Durum: " + kopya1.getDurum());
    }
}