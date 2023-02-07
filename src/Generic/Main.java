package Generic;

public class Main {
    public static void main(String[] args){
        Test<Integer> i = new Test<Integer>(15);
        i.print();
        Test<String> s = new Test<String>("Dogukan");
        s.print();
    }
}
