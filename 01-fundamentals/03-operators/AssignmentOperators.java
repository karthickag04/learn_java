public class AssignmentOperators {

    public static void main(String[] args) {

        int x = 10;
        System.out.println("Initial value of x: " + x);

        // += (Add and assign)
        x += 5; // x = x + 5
        System.out.println("After x += 5: " + x);

        // -= (Subtract and assign)
        x -= 3; // x = x - 3
        System.out.println("After x -= 3: " + x);

        // *= (Multiply and assign)
        x *= 2; // x = x * 2
        System.out.println("After x *= 2: " + x);

        // /= (Divide and assign)
        x /= 4; // x = x / 4
        System.out.println("After x /= 4: " + x);

        // %= (Modulus and assign)
        x %= 3; // x = x % 3
        System.out.println("After x %= 3: " + x);

        // Use with another variable
        int y = 7;
        System.out.println("Initial value of y: " + y);

        y += x; // y = y + x
        System.out.println("After y += x (x = " + x + "): " + y);
    }
}
