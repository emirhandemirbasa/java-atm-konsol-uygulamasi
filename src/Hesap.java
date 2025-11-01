public class Hesap {
    private String kullaniciAdi;
    private String sifre;
    private int bakiye;

    public Hesap(String kullaniciAdi, String sifre, int bakiye){
        this.kullaniciAdi=kullaniciAdi;
        this.sifre=sifre;
        this.bakiye=bakiye;
    }

    public String getKullaniciAdi(){
        return this.kullaniciAdi;
    }

    public String getSifre(){
        return this.sifre;
    }

    public int getBakiye(){
        return this.bakiye;
    }

    public void bakiyeYatir(int bakiye){
        this.bakiye += bakiye;
    }

    public void bakiyeCek(int bakiye){
        if (this.bakiye<bakiye){
            System.out.println("Hesabınızda "+bakiye+"TL çekebileceğiniz kadar bakiye yok!");
        }else{
            this.bakiye -= bakiye;
        }
    }
}
