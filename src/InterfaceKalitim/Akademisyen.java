package InterfaceKalitim;

public class Akademisyen implements ICalisan{
   private String name, department, task;

    @Override
    public void giris() {
System.out.println("Giriş Yapıldı");
    }

    @Override
    public void cikis() {
System.out.println("Çıkış Yapıldı");
    }

    @Override
    public boolean yemek(int saat) {
        System.out.println("Yemek Yedi.");
        return true;
    }

    public Akademisyen(String name, String department, String task) {
        this.name = name;
        this.department = department;
        this.task = task;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}