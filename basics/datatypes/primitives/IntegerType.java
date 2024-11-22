package basics.datatypes.primitives;

public class IntegerType {
    /*  
    * There are four types of integer data type --> 1. byte 2. short 3. int 4. long
    * We can't assign other than numeric values
    */

    // 1. byte
    public static void byteExample(){
    byte b = 127; // maximum value is 127
    byte b1 = -128; // minimum value is -128
    byte b2=0;

    System.out.println("byte data type");
    System.out.println("Maximum value for byte --> "+b);
    System.out.println("Minimum value for byte --> "+b1);
    System.out.println("Default value for byte --> "+b2);
    }

    // 2. short
    public static void shortExample(){
        short s = 32767; // maximum value is 32767
        short s1 = -32768; // minimum value is -32768
        short s2=0;

        System.out.println("\nshort data type");
        System.out.println("Maximum value for short --> "+s);
        System.out.println("Minimum value for short --> "+s1);
        System.out.println("Default value for short --> "+s2);
    }

    // 3. int
    public static void intExample(){
        int i = 2147483647; // maximum value is 2147483647
        int i1 = -2147483648; // minimum value is -2147483648
        int i2=0;

        System.out.println("\nint data type");
        System.out.println("Maximum value for int --> "+i);
        System.out.println("Minimum value for int --> "+i1);
        System.out.println("Default value for int --> "+i2);
    }

    // 4. long
    public static void longExample(){
        long l = 9223372036854775807L; // maximum value is 9223372036854775807
        long l1 = -9223372036854775808L; // minimum value is -9223372036854775808
        long l2=0L;

        System.out.println("\nlong data type");
        System.out.println("Maximum value for long --> "+l);
        System.out.println("Minimum value for long --> "+l1);
        System.out.println("Default value for long --> "+l2);
    }
    public static void main(String[] args) {
        byteExample();
        shortExample();
        intExample();
        longExample();
    }
}
