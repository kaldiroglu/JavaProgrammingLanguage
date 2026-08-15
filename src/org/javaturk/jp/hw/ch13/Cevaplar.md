# Bölüm 2 — Ödev Çözümleri

**Model:** Claude Opus 5 (1M context) — `claude-opus-5[1m]`
**Oluşturulma tarihi:** 2026-08-15

Kod çözümleri bu klasördeki üç dosyadadır; hepsi derlenip çalıştırılarak doğrulanmıştır
(Java 25, `javac` çıkış kodu 0).

| Dosya | Ödev | Depodaki yeri |
|---|---|---|
| `Song.java` | 1 | `src/org/javaturk/jp/hw/ch13/Song.java` |
| `SongTest.java` | 1 ve 2 | `src/org/javaturk/jp/hw/ch13/SongTest.java` |
| `ReferenceDemo.java` | 3 | `src/org/javaturk/jp/hw/ch13/ReferenceDemo.java` |

Sınıflar paket-özeldir (`class Song`, `public class` değil), çünkü erişim niteleyicileri
"Sarmalama ve Bilgi Saklama" bölümüne kadar anlatılmıyor. `public static void main` korunmuştur.

---

## Ödev 1 — beklenen çıktı

```
Homework 1a
  Bohemian Rhapsody by Queen, 355 seconds

Homework 1b
  Yesterday by The Beatles, 125 seconds
```

### (c) şıkkının cevabı: derleme hatası

Öğrencilerin çoğu `null` bekler. Doğru cevap, kodun **hiç derlenmemesidir**:

```
SongTest.java:39: error: variable song2 might not have been initialized
                System.out.println(song2);
                                   ^
1 error
```

**Neden:** `song2` bir **yerel değişkendir**. Yerel değişken, ilk değer atanmadan
okunamaz — Java bunu derleme zamanında engeller. Değişken `null` değildir; hiçbir değeri
yoktur. Bu, "Değişkenlerin Özellikleri" bölümündeki "değeri olmayan değişkenler kullanılamaz,
derleyici hata verir" kuralının aynısıdır.

`song2` bir **alan** olsaydı sonuç farklı olurdu: alanlara derleyici varsayılan bir ilk değer
verir ve referans alanların varsayılanı `null`'dır. Bu ayrım 3. bölümün konusudur; burada
öğrenciden yalnızca farkı görmesi beklenir.

Karşılaştırma için:

| | İlk değer atanmadan | Sonuç |
|---|---|---|
| Yerel değişken | `Song s;` sonra `s`'yi oku | ❌ derleme hatası |
| Alan | `Song s;` sınıf gövdesinde | ✅ `null` |

---

## Ödev 2 — beklenen çıktı

```
Homework 2
  read through song2: Hey Jude, 431 seconds
  read through song3: Hey Jude, 431 seconds
  There is one object and there are two references to it.
```

### (c) şıkkının cevabı

`Song song3 = song2;` satırı **yeni bir nesne oluşturmaz**. `new` yoktur, dolayısıyla kurucu
çağrısı da yoktur — nesne yaratmanın dört adımından yalnızca *tanıtım* ve *atama* vardır.
Kopyalanan şey nesne değil, nesnenin adresidir.

Sonuç: ortada **bir nesne** ve **iki referans** vardır. `song3` üzerinden yapılan değişiklik
`song2` üzerinden de görülür, çünkü ikisi de heapteki aynı nesneyi gösterir. Bu, slayt 20'nin
"bir nesneye aynı anda birden fazla referans olabilir" maddesinin doğrudan karşılığıdır.

---

## Ödev 3 — cevaplar

```java
Song s1 = new Song();   // 1
Song s2 = new Song();   // 2
s1 = s2;                // 3
s2 = null;              // 4
```

### (a) Her satırdan sonra durum

| Satırdan sonra | Nesne | Referans | Durum |
|---|---|---|---|
| 1 | 1 | 1 | `s1` → birinci nesne |
| 2 | 2 | 2 | `s1` → birinci, `s2` → ikinci |
| 3 | 2 | 2 | `s1` ve `s2` **ikisi de** ikinci nesneyi gösterir |
| 4 | 2 | 2 | `s1` → ikinci nesne, `s2` → hiçbir şey (`null`) |

Dikkat: 3. satır bir nesneyi yok etmez. Referans sayısı da değişmez — değişen, referansların
nereyi gösterdiğidir.

### (b) Son satırdan sonra

`s1`, ikinci satırda oluşturulan nesneyi gösterir. `s2` hiçbir nesneyi göstermez; değeri
`null`'dır.

### (c) Birinci nesneye ulaşılabiliyor mu?

**Hayır.** Üçüncü satırda `s1` başka bir nesneyi göstermeye başlayınca, birinci satırda
oluşturulan nesneyi gösteren tek referans kaybolmuş oldu. Nesne heapte durmaya devam eder ama
programın hiçbir yerinden ona ulaşılamaz.

Bu nesnelerin ne olduğu "Bellek Yönetimi" bölümünün konusudur; burada öğrenciden yalnızca
ulaşılamaz hale geldiğini fark etmesi beklenir.

---

## Ödev 4 — cevaplar

| | Cümle | "nesne" ile kastedilen |
|---|---|---|
| a | "Bu programda üç tane `Song` nesnesi var." | **nesne** |
| b | "`Song` nesnesinin bir `title` alanı vardır." | **sınıf** |
| c | "`song1` nesnesinin `title` alanını değiştirdim." | **referans** |
| d | "Bu nesneyi `null` yaptım." | **referans** |

**Tartışma için:** (b) ile (c) birebir aynı cümle kalıbını kullanıyor —
"`X` nesnesinin `title` alanı…" — ama biri sınıfı, diğeri referansı kastediyor. Farkı yaratan
tek şey öznenin sınıf adı mı (`Song`) yoksa referans adı mı (`song1`) olduğu.

(d) en yanıltıcı olanı: `null` yapılan şey nesne değildir, olamaz. Nesne heapte durmaya devam
eder; değişen yalnızca referansın değeridir. Bu cümle, slayt 24'ün "sıklıkla nesne derken
aslında referansı kastettiğimiz de olur" maddesinin en saf örneğidir.
