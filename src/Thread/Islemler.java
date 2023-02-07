package Thread;

public class Islemler implements Runnable{
  String name;

    public Islemler(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Process Begin");
            try {
                for (int j=0 ; j<=5 ; j++) {
                    System.out.println(this.name + " = " + j);
                    Thread.sleep(1000); // sleep metodu ile kod çalışırken 1 sn bekletiliyor
                }
            } catch (Exception e) {
                System.out.println(this.name + "Error");
            }
            System.out.println(this.name + " Process End Properly.");
        }
    }