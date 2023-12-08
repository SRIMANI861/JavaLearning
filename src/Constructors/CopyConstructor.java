package Constructors;
class Construct{
    int id;
    char gender;
    Construct(int id,char gender){
        this.id = id;
        this.gender = gender;
    }
    Construct(Construct object){
        this.id = object.id;
        this.gender = object.gender;

    }

}
public class CopyConstructor {
    public static void main(String[] args) {
        Construct c = new Construct(22,'M');
        System.out.println("The employee id is "+" "+c.id+" "+"and employee is Male");
        Construct c2 = new Construct(c);
        System.out.println("Harini got married to"+" "+c2.id+" "+"employee from our company");

    }
}
