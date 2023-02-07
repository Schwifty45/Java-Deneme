package NestedClass;

public class NonStatic {
    private int a = 10;
    public class Inner{
        int a = 1;
public void run(){
    System.out.println(a);
    System.out.println(this.a);
}
    }
    public void run(){
        System.out.println(a);
        System.out.println(this.a);
        //System.out.println(Inner.this.a); // Statik olmadığı için aşağıdaki satırdaki gibi önce nesne üretilmeli.
        Inner i = new Inner();
        System.out.println(i.a);
    }
}
