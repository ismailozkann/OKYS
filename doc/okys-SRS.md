Online Kütüphane Yönetim Sistemi (OKYS) Senaryo Metni

1. Sistemin Amacı
Bu sistem, kütüphane kaynaklarının takibini kolaylaştırmak, okuyucuların kitaplara dijital ortamda erişmesini sağlamak ve kütüphane personelinin ödünç/iade işlemlerini düzenli şekilde yürütmesi için geliştirilmiştir.

2. Sistemin İşleyişi ve Kurallar

2.1. Kullanıcı Rolleri ve Erişim
- Sistem üzerinde iki yetki grubu bulunur: Üye ve Kütüphane Görevlisi.
- Sisteme kayıtlı her kişinin tekil bir kullanıcı ID'si, adı, e-posta adresi ve parolası yer alır.
- İşlem yapabilmek için kullanıcıların öncelikle sisteme giriş yapması zorunludur.

2.2. Üye Yetkileri
- Üyeler katalogdaki kitaplar arasında arama yapabilir.
- Kütüphanede uygun fiziksel kopyası bulunan kitapları ödünç alabilir.
- Aldıkları kitapların teslim tarihi gelmeden sistem üzerinden ek süre talebinde bulunabilir.
- Üye, daha önce okuduğu veya o an elinde bulunan kitapların listesini görüntüleyebilir.

2.3. Kütüphane Görevlisi Yetkileri
- Kütüphaneye yeni gelen kitapları ve bu kitapların fiziksel kopyalarını sisteme ekleyebilir.
- Mevcut kitapların künye bilgilerini güncelleyebilir.
- Üyelerin oluşturduğu ödünç alma taleplerini kontrol ederek onaylar ve teslim durumunu takip eder.

2.4. Kitap ve Fiziksel Kopya Kuralları
- Sistemdeki her kitap; ISBN numarası, kitap adı, yazar adı, basım yılı ve durum bilgisini taşır.
- Bir kitaptan kütüphanede birden çok adet bulunabilir. Bu fiziksel kopyaların her biri bağımsız bir barkod numarasına sahiptir.
- Fiziksel kopyalar ait olduğu kitaptan bağımsız olarak sistemde yer alamaz.

2.5. Ödünç Alma Mantığı
- Gerçekleşen her işlem için tekil bir işlem numarası oluşturulur.
- Kayıtta ödünç tarihi, teslim edilmesi gereken son gün ve kitabın geri getirildiği asıl teslim tarihi yer alır.
- Her ödünç alma kaydı tam olarak bir üye ve bir fiziksel kopya ile eşleşir.
- Bir üye tek seferde birden fazla kitap alsa dahi, her bir fiziksel kopya için ayrı bir ödünç kaydı tutulur.