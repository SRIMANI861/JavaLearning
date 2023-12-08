package Collections;

import java.util.Arrays;
import java.util.TreeSet;

//TreeSet is a "SORTED" set, which implements SortedSet collection
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Float> treeSet = new TreeSet<>(Arrays.asList(23.123f,12321.54f,9012.90f,8475.34f,9748.898f));
        System.out.println(treeSet.headSet(44.44f));
        System.out.println(treeSet+"\n");

        System.out.println(treeSet.ceiling(78.99f));
        System.out.println(treeSet+"\n");

        System.out.println(treeSet.first());
        System.out.println(treeSet+"\n");

        System.out.println(treeSet.last());
        System.out.println(treeSet+"\n");

        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet+"\n");

        System.out.println(treeSet.pollLast());
        System.out.println(treeSet+"\n");

        System.out.println(treeSet.floor(123.34f));
        System.out.println(treeSet+"\n");

        System.out.println(treeSet.higher(9000.23f));
        System.out.println(treeSet+"\n");

        System.out.println(treeSet.lower(90.12f));
        System.out.println(treeSet+"\n");

        System.out.println(treeSet.remove(0.0f));
        System.out.println(treeSet+"\n");

        System.out.println(treeSet.subSet(25.90f,120.43f));
        System.out.println(treeSet+"\n");

        System.out.println(treeSet.spliterator());

        System.out.println(treeSet.tailSet(12.232f,false));



    }
}
