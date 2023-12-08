package Generics;

class Data<T>{
    T obj;
    Data(T obj){
        this.obj = obj;
    }
//    public T getObject(){
//        return this.obj;
//    }
}
public class GenericsDemo {
    public static void main(String[] args) {
        Data<String> d = new Data<String>("Generics Example");
        System.out.println(d.obj);

        //or System.out.println(d.getObject()); will print the same

        Data<Integer> dobj = new Data<Integer>(23);
        System.out.println(dobj.obj);

        Data<Double> data = new Data<Double>(23.22321);
        System.out.println(data.obj);
    }
}
