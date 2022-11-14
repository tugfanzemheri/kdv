import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        // Projemizde gerekli tüm değişkenleri burada belirliyoruz.

            double fiyat, kdvOrani = 0.18, kdvTutari, kdvliFiyat;

        // Kullanıcıdan para değerini burada allıyoruz.

            System.out.print("Lütfen Para Değerini Giriniz: ");

        // Kullanıcıdan alınan para değerini geçici tutmak için bellekte yer ayırıyoruz.

            Scanner girilenFiyat = new Scanner(System.in);

        // Kullanıcın girmiş olduğu para değerini fiyat değişkenine atıyoruz.

            fiyat = girilenFiyat.nextDouble();

        // Kdv tutarını hesaplıyoruz.

            kdvTutari = fiyat * kdvOrani;

        // Kdvli fiyatı buluyoru.

            kdvliFiyat = fiyat + kdvTutari;

        /* Kullanıcının görmesini istediği bilgileri burada ekrana gönderiyoruz. Tutarların aynı sırada
        alt alta düzgün gürünmesi için \t kaçış karakteri kullanıyoruz.
         */

            System.out.println("Para Değeri\t\t\t\t\t:" + (fiyat));
            System.out.println("KDV Oranı\t\t\t\t\t:" + (kdvOrani));
            System.out.println("KDV Tutarı\t\t\t\t\t:" + (kdvTutari));
            System.out.println("KDV'li Tutar\t\t\t\t:" + (fiyat));


    }
}
