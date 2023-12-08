package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(5);
        al.add(32);
        al.add(1,23);
        System.out.println(al);
        al.add(2,90);
        System.out.println(al);
        ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(23, 190, 12, 24, 75));
        al.addAll(2,al2);

        // METHODS
        System.out.println(al.contains(12));//It checks whether a particular element is present in the ArrayList or not.
        System.out.println(al.get(7));//It returns the value at given index
      //  System.out.println(al.get(10));// This gives the IndexOutOfBoundException , since we are trying to get the index which is more than array size.
        System.out.println(al.size());
        System.out.println(al.indexOf(90));
        System.out.println(al.lastIndexOf(23));//If any element is repeated and we want to retrieve the last index in which the element is present, we use this method
        al.set(2,45);
        al.remove(7);
        al.add(87);
        System.out.println(al);

        al.replaceAll(n -> n<30 ? 40:n );//replace all is done by using unary operators, and here n is used and checked with the number 30, and replaced the numbers less than 30 with 40.
        System.out.println("after replace all :"+" "+al);

        al.removeIf(n -> n > 150);
        System.out.println(al);

        al.removeAll(al2);//since the numbers in al of al2 are completely modified and only 75 was their from intial part, 75 is removed.
        System.out.println(al);

        ArrayList<String> WCT = new ArrayList<>();
        WCT.add("Virat kohli");
        WCT.add("Shami");
        WCT.add("KL Rahul");
        WCT.add("Rohit Sharma");
        WCT.add("Jadeja");
        WCT.add("Siraj");
        
        ArrayList<String> T20 = new ArrayList<>();
        T20.add("Virat kohli");
        T20.add("Shardul Takur");
        T20.add("Hardik Pandya");
        T20.add("Shami");
        T20.add("Jadeja");
        T20.add("Rohit Sharma");

        WCT.retainAll(T20);//retainAll modifies the current list and retains only the elements common to both lists, and the order of elements in the resulting list may not necessarily be the same as the order in the original list.
        System.out.println(WCT);// retainAll will return the common elements from both the collections.

        //Iterating the elements of an array

        //1. forloop
        for (int i=0;i< WCT.size();i++){
            System.out.println(WCT.get(i));
        }

        //2. foreach
        for (String x: WCT) {
            System.out.println(x);
        }

        //3. Iterator
        Iterator<Integer> it = al.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //4. Lambda
        al.forEach(n-> System.out.println("Lambda Expression:"+" "+n));

        //5. Method Reference
        System.out.println("Using Method Reference");
        al.forEach(System.out::println);

    }
}
