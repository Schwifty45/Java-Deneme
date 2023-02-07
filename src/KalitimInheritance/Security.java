package KalitimInheritance;

public class Security extends Memurlar {
    String Belge;

    public Security(String name, String mail, String phone, String departmant, int mesai, String belge) {
        super(name, mail, phone, departmant, mesai);
        Belge = belge;
    }

    public void nobet(){
        System.out.println("Nöbette.");
    }
}
