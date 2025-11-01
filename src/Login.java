import java.util.Scanner;
public class Login {
    public boolean login(Hesap hesap){
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adı girin:");
        String kullaniciAdi = input.nextLine();
        System.out.print("Şifre girin:");
        String sifre = input.nextLine();
        if (kullaniciAdi.equals(hesap.getKullaniciAdi()) && sifre.equals(hesap.getSifre())){
            return true;
        }else{
            return false;
        }
    }
}
