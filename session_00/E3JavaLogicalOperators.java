public class E3JavaLogicalOperators {
    public static void main(String[] args) {
        // Boolean examples
        boolean a = true;
        boolean b = false;
        System.out.println("a && b: " + (a && b ));
        System.out.println("a || b: " + (a || b));
        System.out.println("!a: " + (!a));
        boolean c = true;
        boolean d = false;
        System.out.println("(a && b) || (c && d): " + ((a && b) && (c && d)));

        // Integer comparisons
        int x = 10;
        int y = 20;
        // Check if x is less than y and if x is non-zero
        System.out.println("x < y and x != 0: " + (x < y && x != 0));
        // Check if x is less than y or if y is even (using modulo)
        System.out.println("x < y or y is even: " + (x < y || y % 2 == 0));

        // String comparisons
        String str1 = "hello";
        String str2 = "world";
        // Check if str1 equals "hello" and str2 equals "world"
        System.out.println("str1 equals 'hello' and str2 equals 'world': " + (str1.equals("hello") && str2.equals("world")));
        // Check if either string is equal to "hello"
        System.out.println("Either string equals 'hello': " + (str1.equals("hello") || str2.equals("hello")));
    }
}
