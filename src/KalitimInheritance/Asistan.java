package KalitimInheritance;

public class Asistan extends Akademisyen{
    String YuksekLisans;

    public Asistan(String name, String mail, String phone, String departmants, String tasks, String clases, String yuksekLisans) {
        super(name, mail, phone, departmants, tasks, clases);
        YuksekLisans = yuksekLisans;
    }
    @Override
    public String giris() {
        return  this.YuksekLisans + super.giris();}
    protected void lab(){
        System.out.println("Lablara katıldı.");
    }
    protected void quizoku(){
        System.out.println("Quizleri okudu.");
    }
    @Override
    public void classattent(int lessonHours) {
        System.out.println(getName()+" "+getClases()+" dersine "+lessonHours+" saat girdi.");

    }

    public String getYuksekLisans() {
        return YuksekLisans;
    }

    public void setYuksekLisans(String yuksekLisans) {
        YuksekLisans = yuksekLisans;
    }
}