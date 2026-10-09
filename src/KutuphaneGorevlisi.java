public class KutuphaneGorevlisi extends Kullanici
{
    public KutuphaneGorevlisi(String id, String ad, String eposta, String sifre)
    {
        super(id, ad, eposta, sifre);
    }

    public void kitapEkle(Kitap kitap)
    {
        System.out.println(kitap.getBaslik() + " sisteme eklendi.");
    }

    public void oduncOnayla(OduncAlma islem)
    {
        System.out.println(islem.getIslemNo() + " nolu islem onaylandi.");
    }
}