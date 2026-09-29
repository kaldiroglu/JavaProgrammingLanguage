# Sıkça Sorulan Sorular (SSS)

Bu dosyada *Java Programlama Dili* eğitimiyle ilgili sık sorulan soruların cevaplarını
bulabilirsiniz. Yansı numaraları, bu depodaki `Slides` klasöründeki PDF'lere göredir.

Sorunuzun cevabını burada bulamazsanız bana akin@javaturk.org adresinden ulaşabilirsiniz.
Yansılardaki hatalar için [DUZELTMELER.md](DUZELTMELER.md) dosyasına bakın.

## İçindekiler

- [Kurulum ve Ortam](#kurulum-ve-ortam)
- [Derleme ve Çalıştırma](#derleme-ve-çalıştırma)
- [IntelliJ IDEA](#intellij-idea)

---

## Kurulum ve Ortam

### "java komutu bulunamadı" hatası alıyorum

JDK kurulu değildir ya da PATH ayarı yapılmamıştır. `java -version` komutuyla kontrol edin.
Kurulum ve PATH ayarı için **Bölüm 1**'e bakın.

**İlgili:** Bölüm 1, *PATH ve JAVA_HOME* slaytları

### Hangi JDK'yı kurmalıyım?

Eğitim Java 25 ile işleniyor. Oracle JDK, Oracle'ın OpenJDK'sı, Eclipse Temurin ya da
Microsoft Build of OpenJDK — hangisini kurarsanız kurun, dersimiz için fark etmez.

**İlgili:** Bölüm 1, *Hangisini Kurayım?*

---

## Derleme ve Çalıştırma

### `javac` ile derledim, class dosyası nerede?
<span style="color: red">
`javac` komutunu çalıştırdığınız dizinde, kaynak dosyayla aynı yerde oluşur.
Derleme hatası varsa class dosyası oluşmaz.
</span>

**İlgili:** Bölüm 2, *SimpleSelam.java'yı Derleme*

### Yansılardaki kodları kopyala-yapıştıur ile çalıştırabilir miyim?

Yansılardaki tüm Java kodları bu repoda vardır, yansılardan kopyala-yapıştır ile alıp derlemeye çalışmayın.


---

## IntelliJ IDEA

### Komut satırında çalıştırınca `package` satırı hata veriyor

Depodaki kodların başında `package` satırı vardır. Komut satırında çalıştırmak için bu satırı
silin; `package` yapısı ileride ele alınacak.

**İlgili:** Bölüm 2, *Selam - V*