package KalitimInheritance;

public class Calisan {
   protected String name, mail, phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static int getGirisSayisi() {
        return girisSayisi;
    }

    public static void setGirisSayisi(int girisSayisi) {
        Calisan.girisSayisi = girisSayisi;
    }

    public Calisan(String name, String mail, String phone) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
    }

    static int girisSayisi = 0;

   public String giris(){
        return this.name + " Giriş Yaptı.";
    }
    protected void cikis(){
        System.out.println("Mesai Sonu.");
    }
    protected void yemek(){
        System.out.println("Yemek yedi.");
    }
 public static void girislistele(Calisan[] girisYapanlar){
for (Calisan c : girisYapanlar){
    System.out.println(c.giris());
}
 }
}