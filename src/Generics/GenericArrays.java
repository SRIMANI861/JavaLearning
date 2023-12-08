package Generics;
@SuppressWarnings("unchecked")
class Array<T>{
    T A[]=(T[]) new Object[10];
    int length =0;

    public void append(T v){
        A[length++] = v;
    }
    public void display(){
        for(int i=0;i<length;i++){
            System.out.println(A[i]);
        }
    }
}
public class GenericArrays {
    public static void main(String[] args) {
        Array<Integer> arr = new Array<>();
        arr.append(12);
        arr.append(134);
        arr.display();
        Array<String> str = new Array<>();
        str.append("Srimani");
        str.append("mittu");
        str.append("midhuna");
        str.display();
    }
}
