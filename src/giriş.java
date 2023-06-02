import java.util.Scanner;
public class giriş {
    public static void main(String[] args) {

        String ad, şifre, yeni, kullanıcı, kşifre, sec;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen kullanıcı adını giriniz :");
        kullanıcı = inp.nextLine();
        System.out.print("Lütfen Şifrenizi Giriniz :");
        kşifre = inp.nextLine();

        if (kullanıcı.equals("patika") && kşifre.equals("java12")) {
            System.out.print("Giriş Yaptınız");
        } else {
            System.out.print("Yanlış Giriş yaptınız Şifrenizi Sıfırlamak istermisiniz (evet/hayır)  :");
            sec = inp.nextLine();
            switch (sec) {
                case ("evet"):
                   System.out.print("Degiştirmek istediginiz şifreyi giriniz :");
            }
            yeni = inp.nextLine();
            if (yeni.equals("java12")) {

                System.out.print("Şifre önceki şifreniz ile aynı olamaz");
            }else {
                System.out.println("başarılı bir şekilde yeni şifre oluşturdunuz "); }


            System.out.print("Lütfen kullanıcı adını giriniz :");
            kullanıcı = inp.nextLine();
            System.out.print("Lütfen Şifrenizi Giriniz :");
            yeni = inp.nextLine();


            if (kullanıcı.equals("patika") && yeni.equals(yeni)) {
                System.out.print("Giriş Yaptınız");

        }else{
                System.out.print("tekrar deneyiniz");
            }
    }

    }
}
