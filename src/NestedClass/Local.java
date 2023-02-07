package NestedClass;

public class Local {
    public void run(){
        class Yerel{
            // Şuanki class a yanlızca run metodunun içinde erişebilirim.
            int a;
            Yerel(int a){
                this.a = a;
            }
            public void print(){
                System.out.println(a);
            }
        }
        Yerel y = new Yerel(10);
            y.print();
    }
}
