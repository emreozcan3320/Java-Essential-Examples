package OOP_Atm_example;

public class hesap {
    private String kullanıcı_adi;
    private String parola;
    private  int bakiye ;

    public hesap(String kullanıcı_adi, String parola, int bakiye){
        this.setKullanıcı_adi(kullanıcı_adi);
        this.setParola(parola);
        this.setBakiye(bakiye);
    }


    public String getKullanıcı_adi() {
        return kullanıcı_adi;
    }

    public void setKullanıcı_adi(String kullanıcı_adi) {
        this.kullanıcı_adi = kullanıcı_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public void paraYatir(int tutar){
        bakiye += tutar;
        System.out.println("Yeni Bakiyeniz:"+bakiye );
    }

    public void paraCek(int tutar){
        if(tutar > bakiye){
            System.out.println("Yetersiz bakiye");
        }else{
            bakiye -= tutar;
        }
    }
}
