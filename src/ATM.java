import java.util.Scanner;
public class ATM {
    public void calis(){
        Scanner input = new Scanner(System.in);
        String kullaniciAdi,sifre;
        Hesap hesap = null;
        while(true){
            System.out.println("1-ATM Giriş");
            System.out.println("2-ÇIKIŞ");
            System.out.print("Seçiminiz:");
            String secim = input.nextLine();
            switch(secim){
                case "1":
                    while(true){
                        System.out.println();
                        System.out.println("*****************");
                        System.out.println("1-Hesap oluştur");
                        System.out.println("2-Hesabınıza giriş yapın");
                        System.out.println("3-Çıkış");
                        System.out.println("Seçiminiz");
                        secim = input.nextLine();
                        switch(secim){
                            case "1":
                                System.out.println();
                                System.out.println("***************");
                                System.out.println("Hesap oluşturuyorsunuz...");
                                System.out.print("Kullanıcı adınızı girin:");
                                kullaniciAdi = input.nextLine();
                                System.out.print("Şifrenizi girin:");
                                sifre = input.nextLine();
                                System.out.print("Yatırmak istediğiniz bakiye:");
                                int miktar = input.nextInt();
                                hesap = new Hesap(kullaniciAdi,sifre,miktar);
                                System.out.println("Hesabınız başarıyla oluşturuldu!");
                                break;
                            case "2":
                                if (hesap==null){
                                    System.out.println("Herhangi bir hesap oluşturmadınız!");
                                    continue;
                                }
                                Login login = new Login();

                                System.out.println();
                                System.out.println("***************");

                                if (login.login(hesap)){
                                    System.out.println("Giriş başarılı!");
                                    while(true){
                                        System.out.println();
                                        System.out.println("******************");
                                        System.out.println("1-Bakiye Görüntüle");
                                        System.out.println("2-Bakiye Yatır");
                                        System.out.println("3-Bakiye Çek");
                                        System.out.println("4-Çıkış");
                                        System.out.print("Seçiminiz:");
                                        secim = input.nextLine();
                                        switch(secim){
                                            case "1":
                                                System.out.println("Bakiyeniz: "+hesap.getBakiye()+"TL");
                                                break;
                                            case "2":
                                                System.out.print("Yatırılacak miktar:");
                                                miktar = input.nextInt();
                                                input.nextLine();
                                                hesap.bakiyeYatir(miktar);
                                                System.out.println("Güncel bakiye: "+hesap.getBakiye());
                                                break;
                                            case "3":
                                                System.out.print("Çekilecek miktar:");
                                                miktar = input.nextInt();
                                                input.nextLine();
                                                hesap.bakiyeCek(miktar);
                                                System.out.println("Güncel bakiye: "+hesap.getBakiye());
                                                break;
                                            case "4":
                                                System.exit(0);
                                        }
                                    }
                                }else{
                                    System.out.println("Kullanıcı adı veya şifre yanlış!");
                                }
                                break;
                            case "3":
                                System.exit(0);
                        }
                    }
                case "2":
                    System.exit(0);

            }
        }
    }
}
