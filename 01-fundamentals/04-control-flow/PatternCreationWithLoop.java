public class PatternCreationWithLoop {
    public static void main(String[] args) {
        System.out.println("--- Basic Patterns ---");
        System.out.println("Pattern 1: Right-angled Triangle (for)");
        printRightTriangle(5);

        System.out.println("\nPattern 2: Inverted Triangle (while)");
        printInvertedTriangle(5);

        System.out.println("\nPattern 3: Square Pattern (do-while)");
        printSquare(5);

        System.out.println("\n--- Advanced Patterns ---");
        System.out.println("Pattern 4: Pyramid Pattern");
        printPyramid(5);

        System.out.println("\nPattern 5: Diamond Pattern");
        printDiamond(5);

        System.out.println("\nPattern 6: Floyd's Triangle (Number Pattern)");
        printFloydsTriangle(5);

        System.out.println("\nPattern 7: Hollow Square");
        printHollowSquare(5);
    }

    /**
     * Prints a right-angled triangle pattern:
     * *
     * **
     * ***
     */
    public static void printRightTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Prints an inverted triangle pattern:
     * *****
     * ****
     * ***
     */
    public static void printInvertedTriangle(int rows) {
        int i = rows;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }

    /**
     * Prints a square pattern:
     * *****
     * *****
     */
    public static void printSquare(int size) {
        int i = 1;
        do {
            int j = 1;
            do {
                System.out.print("*");
                j++;
            } while (j <= size);
            System.out.println();
            i++;
        } while (i <= size);
    }

    /**
     * Prints a pyramid pattern:
     *     *
     *    ***
     *   *****
     */
    public static void printPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Prints a diamond pattern.
     */
    public static void printDiamond(int rows) {
        // Upper part
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }
        // Lower part
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }
    }

    /**
     * Prints Floyd's Triangle:
     * 1
     * 2 3
     * 4 5 6
     */
    public static void printFloydsTriangle(int rows) {
        int number = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    /**
     * Prints a hollow square pattern.
     */
    public static void printHollowSquare(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
