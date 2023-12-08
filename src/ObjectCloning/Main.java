package ObjectCloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human Srimani = new Human(20,"Narani Srimani");
//        Human twin = new Human(Srimani);

        //Instead of creating a twin using the Srimani reference which takes more memory, we can actually use the concept called
        //"OBJECT CLONING"

        // OBJECT CLONING is making the exact copy of one object

        //Object cloning refers to the process of creating an exact copy of an existing object.

        Human twin = (Human) Srimani.clone();
        System.out.println(twin.age+" "+twin.name);
    }
}
