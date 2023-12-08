package Constructors;

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Parameterized p = new Parameterized("Srimani",20);
    }
}
 class Parameterized{
    Parameterized(String name, int age){
        System.out.println("Hi my name is:"+" "+name+" "+"I am "+age+" "+"years old");
    }
}
