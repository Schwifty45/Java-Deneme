package Generic;

public class Test  <T>{ //birden fazla değişten sınıfı da atanılabilir
    T obj;
    Test (T obj){
        this.obj = obj;

    }
public void print(){
        System.out.println(obj);
}
public class Test2<R, Y>{
        R obj1;
        Y obj2;
        Test2 (R obj1, Y obj2){
            this.obj1=obj1;
            this.obj2=obj2;
        }
    }
    public T getObj() {
        return this.obj;
    }
}