package Generics;

class Generic<H, I>{
    H obj1;
    I obj2;
    Generic(H obj1,I obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
public class GenericsMultipleParams {
    public static void main(String[] args) {
        Generic<Integer,Float> gobj = new Generic<Integer,Float>(232,332.43f);
        gobj.print();
    }
}
