import java.time.LocalDate;

public class OduncAlma
{
    private String islemNo;
    private LocalDate oduncTarihi;
    private LocalDate sonTeslimTarihi;
    private LocalDate teslimTarihi;
    private Uye uye;
    private KitapKopyasi kitapKopyasi;

    public OduncAlma(String islemNo, LocalDate oduncTarihi, LocalDate sonTeslimTarihi, Uye uye, KitapKopyasi kitapKopyasi)
    {
        this.islemNo = islemNo;
        this.oduncTarihi = oduncTarihi;
        this.sonTeslimTarihi = sonTeslimTarihi;
        this.uye = uye;
        this.kitapKopyasi = kitapKopyasi;
        this.teslimTarihi = null;

        uye.oduncKaydiEkle(this);
        kitapKopyasi.oduncEkle(this);
        kitapKopyasi.setDurum(KitapDurumu.ODUNC_ALINDI);
    }

    public String getIslemNo()
    {
        return islemNo;
    }

    public LocalDate getOduncTarihi()
    {
        return oduncTarihi;
    }

    public LocalDate getSonTeslimTarihi()
    {
        return sonTeslimTarihi;
    }

    public LocalDate getTeslimTarihi()
    {
        return teslimTarihi;
    }

    public void setTeslimTarihi(LocalDate teslimTarihi)
    {
        this.teslimTarihi = teslimTarihi;
        this.kitapKopyasi.setDurum(KitapDurumu.MEVCUT);
    }

    public Uye getUye()
    {
        return uye;
    }

    public KitapKopyasi getKitapKopyasi()
    {
        return kitapKopyasi;
    }
}