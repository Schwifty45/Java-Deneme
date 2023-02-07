package KalitimInheritance;
//abstract olarak yazınca bu classtan nesne üretilmez.
public abstract class Akademisyen extends Calisan {//Calışanın alt sınıfında ondan dolayı calışandaki methodlar bu class ile kullanılır
    String departmants, tasks;
    String clases;

    public String getDepartmants() {
        return departmants;
    }
    @Override
    public String giris() {
        return "A kapısından " + super.giris(); //super bir üst classtan metodu çağırıyor.
    }

    public void setDepartmants(String departmants) {
        this.departmants = departmants;
    }

    public String getTasks() {
        return tasks;
    }

    public void setTasks(String tasks) {
        this.tasks = tasks;
    }

    public String getClases() {
        return clases;
    }

    public void setClases(String clases) {
        this.clases = clases;
    }

    public Akademisyen(String name, String mail, String phone, String departmants, String tasks, String clases) {
        super(name, mail, phone);
        this.departmants = departmants;
        this.tasks = tasks;
        this.clases = clases;
    }

    public abstract void classattent(int lessonHours);
}