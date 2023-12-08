package Collections;

import java.util.Arrays;
import java.util.HashSet;

// HashSet is not "SORTED", it doesn't implements SortedSet
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>(Arrays.asList("Srimani","Narani","Lakshmi","Srimani","Mittu","Keeru","Krishna","Narani"));
        System.out.println(hashSet.contains("mittu"));
        System.out.println(hashSet.size());
        System.out.println(hashSet.clone());

        //This line will check for 'n' letter within the set list and filter out the Strings containing n.
        hashSet.stream().filter(n-> n.contains("n")).forEach(System.out::println);



    }
}
