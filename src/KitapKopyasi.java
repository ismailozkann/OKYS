import java.util.ArrayList;
import java.util.List;

public class KitapKopyasi
{
    private String barkodNo;
    private Kitap kitap;
    private KitapDurumu durum;
    private List<OduncAlma> oduncListesi;

    public KitapKopyasi(String barkodNo, Kitap kitap)
    {
        this.barkodNo = barkodNo;
        this.kitap = kitap;
        this.durum = KitapDurumu.MEVCUT;
        this.oduncListesi = new ArrayList<>();
        kitap.kopyaEkle(this);
    }

    public String getBarkodNo()
    {
        return barkodNo;
    }

    public Kitap getKitap()
    {
        return kitap;
    }

    public KitapDurumu getDurum()
    {
        return durum;
    }

    public void setDurum(KitapDurumu durum)
    {
        this.durum = durum;
    }

    public List<OduncAlma> getOduncListesi()
    {
        return oduncListesi;
    }

    public void oduncEkle(OduncAlma odunc)
    {
        this.oduncListesi.add(odunc);
    }
}