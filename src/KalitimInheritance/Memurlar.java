package KalitimInheritance;

public abstract class Memurlar extends Calisan{ //abstract olarak yazınca bu classtan nesne üretilmez.
    String departmant;
    int mesai;
    @Override
    public String giris(){
        return "B kapısından " + super.giris(); // super bir üst classtan metodu çağırıyor.
    }
    public String getDepartmant() {
        return departmant;
    }

    public void setDepartmant(String departmant) {
        this.departmant = departmant;
    }

    public int getMesai() {
        return mesai;
    }

    public void setMesai(int mesai) {
        this.mesai = mesai;
    }

    public Memurlar(String name, String mail, String phone, String departmant, int mesai) {
        super(name, mail, phone);
        this.departmant = departmant;
        this.mesai = mesai;
    }


public void gorevde(){
    System.out.println("Görevde!!");
}
}