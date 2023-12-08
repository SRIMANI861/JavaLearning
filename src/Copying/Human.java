package Copying;

//Cloneable is an interface used for cloning
public class Human implements Cloneable{

    int age;
    String name;

    int[] array;
    public Human(int age,String name) {
        this.age=age;
        this.name=name;
        this.array = new int[]{3,8,9,2,4,5};
    }

    public Human(Human object) {
        this.age=object.age;
        this.name=object.name;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
