public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 2; // Binary: 0010
        int b = 3; // Binary: 0011

        System.out.println("a = " + a + " -> " + String.format("%4s", Integer.toBinaryString(a)).replace(' ', '0'));
        System.out.println("b = " + b + " -> " + String.format("%4s", Integer.toBinaryString(b)).replace(' ', '0'));
        System.out.println();

        // Bitwise AND
        int and = a & b;
        System.out.println("a & b = " + and + " -> " + String.format("%4s", Integer.toBinaryString(and)).replace(' ', '0'));

        // Bitwise OR
        int or = a | b;
        System.out.println("a | b = " + or + " -> " + String.format("%4s", Integer.toBinaryString(or)).replace(' ', '0'));

        // Bitwise XOR
        int xor = a ^ b;
        System.out.println("a ^ b = " + xor + " -> " + String.format("%4s", Integer.toBinaryString(xor)).replace(' ', '0'));

        // Bitwise NOT
        int notA = ~a;
        System.out.println("~a = " + notA + " -> " + Integer.toBinaryString(notA));

        // Left Shift
        int leftShift = a << 1;
        System.out.println("a << 1 = " + leftShift + " -> " + String.format("%4s", Integer.toBinaryString(leftShift)).replace(' ', '0'));

        // Right Shift (Arithmetic)
        int rightShift = a >> 1;
        System.out.println("a >> 1 = " + rightShift + " -> " + String.format("%4s", Integer.toBinaryString(rightShift)).replace(' ', '0'));

        // Unsigned Right Shift
        int unsignedRightShift = a >>> 1;
        System.out.println("a >>> 1 = " + unsignedRightShift + " -> " + String.format("%4s", Integer.toBinaryString(unsignedRightShift)).replace(' ', '0'));
    }
}
