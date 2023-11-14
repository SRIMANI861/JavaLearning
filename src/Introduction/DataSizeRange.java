package Introduction;

import com.sun.beans.editors.ByteEditor;

public class DataSizeRange {
    public static void main(String[] args) {
        //Integer
        System.out.println("Int Min value: "+" "+Integer.MIN_VALUE);
        System.out.println("Int Max value: "+" "+Integer.MAX_VALUE);
        System.out.println("Int Bytes:"+" "+Integer.BYTES);
        System.out.println("Int bits:"+" "+Integer.bitCount(200));//200 in binary format is 11001000 , so it has 3 "1's" , hence bit count is 3
        System.out.println(Integer.max(342313214,1231241));
        System.out.println(Integer.numberOfTrailingZeros(232000000));
        System.out.println(Integer.compareUnsigned(90,450));

        //Byte
        System.out.println("Byte Min value:" + " "+Byte.MIN_VALUE);
        System.out.println("Byte Max value:" + " "+ Byte.MAX_VALUE);
        System.out.println("Byte Bytes:"+" "+Byte.SIZE);
        System.out.println(Byte.BYTES);

    }
}
