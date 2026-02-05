public class prgm5{
    public static void main(String[] args) {

        int a = 10;   // 1010 in binary
        int b = 6;    // 0110 in binary

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();

        // Bitwise Logical Operators
        System.out.println("----- Bitwise Logical Operators -----");
        System.out.println("a & b  = " + (a & b));   // Bitwise AND
        System.out.println("a | b  = " + (a | b));   // Bitwise OR
        System.out.println("a ^ b  = " + (a ^ b));   // Bitwise XOR
        System.out.println("~a     = " + (~a));      // Bitwise NOT (1’s complement)
        System.out.println();

        // Shift Operators
        System.out.println("----- Shift Operators -----");
        System.out.println("a << 1  = " + (a << 1));   // Left shift
        System.out.println("a >> 1  = " + (a >> 1));   // Right shift
        System.out.println("a >>> 1 = " + (a >>> 1));  // Unsigned right shift
    }
}
