public class JavaStringHandling01 {

    public static void main(String[] args) {

        
        String input = "Hello, Corld! Rorld! sorld world";

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
        System.out.println("String Without Whitespace: " + input.replaceAll("world", "Students"));
        System.out.println("String Concatenated with ' Enjoy!': " + (input + " Enjoy!"));
        System.out.println("Is String Empty: " + input.isEmpty());
    }
}


/*
 * String methods:
 * - toUpperCase()
 * - toLowerCase()
 * - length()
 * - charAt()
 * - substring()
 * - contains()
 * - startsWith()
 * - endsWith()
 * - replace()
 * - replaceAll()
 * - replaceFirst()         // Regex-based first occurrence replacement
 * - isEmpty()
 * - equals()
 * - equalsIgnoreCase()
 * - indexOf()
 * - lastIndexOf()
 * - trim()
 * - split()
 * - format()
 * - join()
 * - compareTo()
 * - compareToIgnoreCase()
 * - valueOf()
 * - intern()
 * - codePointAt()
 * - codePointBefore()
 * - codePointCount()
 * - regionMatches()
 * - hashCode()
 * - concat()
 * - matches()
 * - subSequence()
 * - toCharArray()
 * - getBytes()
 * - chars()
 * - codePoints()
 * - repeat()       // Java 11+
 * - formatted()    // Java 15+
 * - strip()        // Java 11+
 * - stripLeading() // Java 11+
 * - stripTrailing()// Java 11+
 * - isBlank()      // Java 11+
 * - lines()        // Java 11+
 * - indent()       // Java 12+
 * - transform()    // Java 12+
 * 
 * Additional methods:
 * - contentEquals(CharSequence cs)
 * - contentEquals(StringBuffer sb)
 */