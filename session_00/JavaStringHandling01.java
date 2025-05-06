public class JavaStringHandling01 {

    public static void main(String[] args) {
        String input = "Hel  lo, Wor ld  !";

        System.out.println("Original String: " + input);
        System.out.println("Uppercase String: " + input.toUpperCase());
        System.out.println("Lowercase String: " + input.toLowerCase());
        System.out.println("String Length: " + input.length());
        System.out.println("Character at Index 1: " + input.charAt(1));
        System.out.println("Substring (0, 5): " + input.substring(0, 5));
        System.out.println("String Contains 'World': " + input.contains("World"));
        System.out.println("String Starts With 'Hello': " + input.startsWith("Hello"));
        System.out.println("String Ends With '!': " + input.endsWith("!"));
        System.out.println("String Replaced 'World' with 'Java': " + input.replace("World", "Java"));
        System.out.println("String Without Whitespace: " + input.replaceAll("\\s", "###"));
        System.out.println("String Concatenated with ' Enjoy!': " + (input + " Enjoy!"));
        System.out.println("Is String Empty: " + input.isEmpty());
    }
}
