package Challenge;
import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        int count = 0;
        for (char i =0;i<str1.length();i++){
            for(char j =0 ;j<str2.length();j++){
                if (str1.codePointAt(i) == str2.codePointAt(j)){
                    count++;
                }
            }
        }
//        char[] arr = str1.toCharArray();
//        char[] arr2 = str2.toCharArray();



//        for (char str: arr){
//            System.out.println(str);
//        }
//        for (char str: arr2){
//            System.out.println(str);
//        }

        if((str1.equalsIgnoreCase(str2)) &&(str1.contentEquals(str2)) && (count >= 1)){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not Anagrams");
        }

    }
}
