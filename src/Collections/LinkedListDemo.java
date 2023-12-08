package Collections;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.Iterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        //Same as LinkedList , so we can change LinkedList program here by linkedList, that's it all methods will work and other methods also can be used.
        LinkedList<Integer> al = new LinkedList<>();//thing here is ,it doesn't take the initial size.
        al.add(32);
        al.add(1,23);
        System.out.println(al);
        al.add(2,90);
        System.out.println(al);
        LinkedList<Integer> al2 = new LinkedList<>(Arrays.asList(23, 190, 12, 24, 75));
        al.addAll(2,al2);

        // METHODS
        System.out.println(al.contains(12));//It checks whether a particular element is present in the LinkedList or not.
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

        LinkedList<Integer> WCF = new LinkedList<>();
        WCF.add(1983);
        WCF.add(2003);
        WCF.add(2011);
        WCF.add(2023);
        System.out.println(WCF);

        LinkedList<Integer> WCS = new LinkedList<>();
        WCS.add(1983);
        WCS.add(1996);
        WCS.add(2003);
        WCS.add(2015);
        WCS.add(2019);
        WCS.add(2023);

        WCF.addAll(WCS);
        System.out.println(WCF);

        System.out.println(WCF.getFirst());
        System.out.println(WCF+"\n");

        System.out.println(WCF.getLast());
        System.out.println(WCF+"\n");

        System.out.println(WCF.element());//returns 1st element
        System.out.println(WCF+"\n");

        System.out.println(WCF.peek());//returns 1st element
        System.out.println(WCF+"\n");

        System.out.println(WCF.poll());//deletes 1st element from the list
        System.out.println(WCF+"\n");

        System.out.println(WCF.peekFirst());//returns starting element
        System.out.println(WCF+"\n");

        System.out.println(WCF.peekLast());//returns last element
        System.out.println(WCF+"\n");

        System.out.println(WCF.pollFirst());//deletes the 1st element
        System.out.println(WCF+"\n");

        System.out.println(WCF.pollLast());//deletes the last element
        System.out.println(WCF+"\n");

        System.out.println(WCF.pop());
        System.out.println(WCF+"\n");


        //Descending Iterator
        Iterator<Integer> descendingIterator = WCF.descendingIterator();
        while (descendingIterator.hasNext()){
            System.out.println(descendingIterator.next());
        }


        LinkedList<String> WCT = new LinkedList<>();
        WCT.add("Virat kohli");
        WCT.add("Shami");
        WCT.add("KL Rahul");
        WCT.add("Rohit Sharma");
        WCT.add("Jadeja");
        WCT.add("Siraj");

        LinkedList<String> T20 = new LinkedList<>();
        T20.add("Virat kohli");
        T20.add("Shardul Takur");
        T20.add("Hardik Pandya");
        T20.add("Shami");
        T20.add("Jadeja");
        T20.add("Rohit Sharma");

        Iterator<String> desc = WCT.descendingIterator();
        while (desc.hasNext()){
            System.out.println(desc.next());
        }

        WCT.retainAll(T20);//retainAll modifies the current list and retains only the elements common to both lists, and the order of elements in the resulting list may not necessarily be the same as the order in the original list.
        System.out.println(WCT);// retainAll will return the common elements from both the collections.

    }
}
