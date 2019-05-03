package generic;

import java.util.List;

public class GenericsC<T> {
    private T t;

    public void setT(T t){
        this.t = t;
    }

    public T getT(){
        return this.t;
    }

    public <V> int sumT(List<V> ts){
        return 2;
    }

}
