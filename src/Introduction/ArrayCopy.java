package Introduction;

public class ArrayCopy {

    public static void main(String[] args)
    {
        main();
    }
    public static void main() {
        String[] copyFrom = {
                "abc","ads","fbjd","dbj","asnkdfnkd","asbjee","asbdj","jrhej"
        };

        String[] copyTo = new String[5];
        System.arraycopy(copyFrom,3,copyTo,1,4);
        for (String aplhabets: copyTo
             ) {
            System.out.println(aplhabets + " ");

        }
    }
}
