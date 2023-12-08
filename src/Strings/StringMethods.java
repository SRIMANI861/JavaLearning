package Strings;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Mr. Virat Kohli";
//        System.out.println(name.getBytes());
//        System.out.println(name.toString());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.toCharArray());
        System.out.println(name.charAt(9));
        System.out.println(name.trim());
        System.out.println(name.codePointAt(3));
        System.out.println(name.codePointBefore(5));
        System.out.println(name.concat(" "+" Is ahead of Sachin's Centuries..."));
        System.out.println(name.codePointCount(1,9));
        System.out.println(name.contentEquals("sachin"));
        System.out.println(name.hashCode());
        System.out.println(name.indexOf(4));
        System.out.println(name.indexOf("K"));
        System.out.println(name.indexOf(2,9));
        System.out.println(name.indexOf("irat"));
        System.out.println(name.lastIndexOf("i"));
        System.out.println(name.replace("Kohli","Anushka"));
        System.out.println(name.substring(3,9));
        System.out.println(name.charAt(4));

        System.out.println(name+"\n\n");
        String str = "geekss@for@geekss";
        String[] arrOfStr = str.split("s", 2);

        for (String a : arrOfStr)
            System.out.println(a);

        String web = "www.freepik.com";
        System.out.println(web.indexOf("."));
        System.out.println(web.indexOf(".",10));
        System.out.println(web.indexOf('m',9));
        System.out.println(web.indexOf(7));
        System.out.println(web.lastIndexOf("w"));
        System.out.println(web.lastIndexOf('e'));
        System.out.println(web.lastIndexOf("pik",17));
        System.out.println(web.substring(0,4));
        System.out.println(web.substring(4,9));
        System.out.println(web.length());

        String str1;
        str1 = "Mittu";
        String str2 = new String("Mittu");
        String str3 = new String("Mittu");
        String str4 = "Mittu";

        System.out.println(str1==str4);//literal and object declarations both are not same, they point to different references and when we use ==, it will check whether the locations are having the same string or not
        System.out.println("\"with == \""+" "+str1==str2);//It will check the reference, whether both strings pointing to same location or not
        System.out.println("\"with equals method\""+" "+str1.equals(str2));//It will just check the value
        System.out.println("\"with equals ignore \""+ " "+str1.equalsIgnoreCase(str3));
        System.out.println(str2.equals(str3));

        String s1 = "China Wall";
        String s2 = new String("China yall");

        System.out.println(s1.compareTo(s2));

    }
}
