import java.util.ArrayList;
import java.util.List;

public class Uye extends Kullanici
{
    private List<OduncAlma> okudugumKitaplar;

    public Uye(String id, String ad, String eposta, String sifre)
    {
        super(id, ad, eposta, sifre);
        this.okudugumKitaplar = new ArrayList<>();
    }

    public List<OduncAlma> getOkudugumKitaplar()
    {
        return okudugumKitaplar;
    }

    public void oduncKaydiEkle(OduncAlma oduncAlma)
    {
        this.okudugumKitaplar.add(oduncAlma);
    }
}