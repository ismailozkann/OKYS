import java.util.ArrayList;
import java.util.List;

public class Kitap
{
    private String isbn;
    private String baslik;
    private String yazar;
    private int yayinYili;
    private String durum;
    private List<KitapKopyasi> fizikselKopyalar;

    public Kitap(String isbn, String baslik, String yazar, int yayinYili)
    {
        this.isbn = isbn;
        this.baslik = baslik;
        this.yazar = yazar;
        this.yayinYili = yayinYili;
        this.durum = "Mevcut";
        this.fizikselKopyalar = new ArrayList<>();
    }

    public boolean oduncIste()
    {
        for (KitapKopyasi kopya : fizikselKopyalar)
        {
            if (kopya.getDurum() == KitapDurumu.MEVCUT)
            {
                return true;
            }
        }
        return false;
    }

    public void kopyaEkle(KitapKopyasi kopya)
    {
        this.fizikselKopyalar.add(kopya);
    }

    public String getIsbn()
    {
        return isbn;
    }

    public String getBaslik()
    {
        return baslik;
    }

    public String getYazar()
    {
        return yazar;
    }

    public int getYayinYili()
    {
        return yayinYili;
    }

    public String getDurum()
    {
        return durum;
    }

    public void setDurum(String durum)
    {
        this.durum = durum;
    }

    public List<KitapKopyasi> getFizikselKopyalar()
    {
        return fizikselKopyalar;
    }
}