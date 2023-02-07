package KalitimInheritance;

public class Ogretmen extends Akademisyen{
    String Unvan;

    public Ogretmen(String name, String mail, String phone, String departmants, String tasks, String clases, String unvan) {
        super(name, mail, phone, departmants, tasks, clases);
        Unvan = unvan;
    }

    protected void Meeting(){
        System.out.println("Toplantıya katıldı.");
    }
    protected void sinavoku(){
        System.out.println("Sınavları okudu.");
    }

    @Override
    public void classattent(int lessonHours) {
        System.out.println(getUnvan()+" "+ getName()+" "+getClases()+" dersine "+lessonHours+" saat girdi.");
    }

    public String getUnvan() {
        return Unvan;
    }

    public void setUnvan(String unvan) {
        Unvan = unvan;
    }
}
