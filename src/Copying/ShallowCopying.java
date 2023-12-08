package Copying;

import java.util.Arrays;

public class ShallowCopying {
    public static void main(String[] args) throws CloneNotSupportedException {

        Human Srimani = new Human(20,"Srimani");
        Human twin = (Human) Srimani.clone();

        twin.array[0]=20;
        System.out.println(Arrays.toString(twin.array));
        System.out.println(Arrays.toString(Srimani.array));

        //Here we are not changing the Srimani object's array value, only changing the twin array's value.
        //But Srimani's object's value is also changed due to "Shallow Copying"

        //Shallow Copying refers to the concept where the duplicate object is referencing to the original object items itself.
        //For non-primitives like Strings, Arrays duplicates are not created, just the new object's reference points to old reference objects itself.

    }
}
