package Generics;
class Encapsulation<T>{
    private T obj;
    public void setData(T obj){
        this.obj = obj;
    }
    public T getData(){
        return obj;
    }
}
public class GenericsEncapsulation {
    public static void main(String[] args) {
        Encapsulation<String> c= new Encapsulation<String>();
        c.setData("Love you mittu");
        System.out.println(c.getData());

    }
}
