package ObjectCloning;

//Cloneable is an interface used for cloning
public class Human implements Cloneable{

    int age;
    String name;

    public Human(int age,String name) {
        this.age=age;
        this.name=name;
    }

    public Human(Human object) {
        this.age=object.age;
        this.name=object.name;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
