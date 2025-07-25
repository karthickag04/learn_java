public class ArrayWithForLoop {
    public static void main(String[] args) {

        // Flavors array – ice cream flavors list
        String[] flavors = {"Chocolate", "Vanilla", "Strawberry", "Mango", "Pista"};
        // For loop la namma ellaa flavor-aiyum oru thadava print panrom
        for (int i = 0; i < flavors.length; i++) {
            System.out.println("Yummy flavor #" + (i + 1) + ": " + flavors[i]);
        }

        // Animals array – pasu, poonai mathiri animal names
        String[] animals = {"Tiger", "Elephant", "Kangaroo", "Zebra", "Panda"};
        for (int i = 0; i < animals.length; i++) {
            System.out.println("I love the " + animals[i] + " 🐾");
        }

        // Heroes array – super hero names
        String[] heroes = {"Spider-Man", "Iron Man", "Captain Marvel", "Hulk", "Batman"};
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i] + " saves the day! 🦸‍♂️");
        }

        // Cartoons array – cartoon character names
        String[] cartoons = {"Mickey", "Tom", "Jerry", "Doraemon", "SpongeBob"};
        for (int i = 0; i < cartoons.length; i++) {
            System.out.println("I watch " + cartoons[i] + " every weekend!");
        }

        // Planets array – solar system la iruka grahangal
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        for (int i = 0; i < planets.length; i++) {
            System.out.println("Planet #" + (i + 1) + " is " + planets[i]);
        }

        // Foods array – pasikkum pothu sapidura item names
        String[] foods = {"Pizza", "Burger", "French Fries", "Noodles", "Ice Cream"};
        for (int i = 0; i < foods.length; i++) {
            System.out.println("I want to eat: " + foods[i]);
        }

        // Instruments array – isai karuvigal (musical instruments)
        String[] instruments = {"Guitar", "Piano", "Drums", "Flute", "Violin"};
        for (int i = 0; i < instruments.length; i++) {
            System.out.println("Let's play the " + instruments[i]);
        }

        // Game characters array – video game la iruka character names
        String[] gameCharacters = {"Mario", "Luigi", "Sonic", "Pikachu", "Link"};
        for (int i = 0; i < gameCharacters.length; i++) {
            System.out.println(gameCharacters[i] + " is ready to play!");
        }

        // Sports array – vilayattu names
        String[] sports = {"Cricket", "Football", "Basketball", "Tennis", "Hockey"};
        for (int i = 0; i < sports.length; i++) {
            System.out.println("Let's play " + sports[i] + " today!");
        }

        // Party items array – oru party ku thevaiyana items
        String[] partyItems = {"Cake", "Balloons", "Gifts", "Party Hats", "Music"};
        for (int i = 0; i < partyItems.length; i++) {
            System.out.println("Don't forget the " + partyItems[i] + "!");
        }

        // Apples per day – daily ethana apple sapitom
        int[] applesPerDay = {3, 5, 2, 4, 6, 1, 3};
        for (int i = 0; i < applesPerDay.length; i++) {
            System.out.println("Day " + (i + 1) + ": " + applesPerDay[i] + " apples 🍎");
        }

        // Temperatures – daily body temperature reading
        double[] temperatures = {36.5, 37.2, 36.8, 37.0, 36.7, 37.1, 36.9};
        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("Temperature on day " + (i + 1) + ": " + temperatures[i] + "°C 🌡️");
        }

        // Lucky letters – kids ku pidicha lucky alphabets
        char[] luckyLetters = {'A', 'B', 'C', 'D', 'E'};
        for (int i = 0; i < luckyLetters.length; i++) {
            System.out.println("Lucky letter #" + (i + 1) + ": " + luckyLetters[i]);
        }

        // Did homework – true/false nu homework senjingala nu kaatuvathu
        boolean[] didHomework = {true, false, true, true, false};
        for (int i = 0; i < didHomework.length; i++) {
            System.out.println("Day " + (i + 1) + ": Homework done? " + didHomework[i]);
        }

        // Toppings – pizza toppings names
        String[] toppings = {"Cheese", "Tomato", "Onion", "Capsicum", "Olives"};
        for (int i = 0; i < toppings.length; i++) {
            System.out.println("Topping #" + (i + 1) + ": " + toppings[i]);
        }

        // Marks – subject la vangina marks list
        int[] marks = {85, 78, 92, 88, 76};
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i] + " marks");
        }

        // Countries – future la visit panna aasaiya iruka desangal
        String[] countries = {"Japan", "France", "Italy", "Canada", "Brazil"};
        for (int i = 0; i < countries.length; i++) {
            System.out.println("I want to visit: " + countries[i]);
        }

        // Item prices – kadai la item oda price list
        double[] itemPrices = {99.99, 49.50, 30.25, 75.00, 10.99};
        for (int i = 0; i < itemPrices.length; i++) {
            System.out.println("Item " + (i + 1) + ": ₹" + itemPrices[i]);
        }

        // Initials – friend-oda first letter (initial)
        char[] initials = {'S', 'K', 'A', 'N', 'M'};
        for (int i = 0; i < initials.length; i++) {
            System.out.println("Friend #" + (i + 1) + " starts with: " + initials[i]);
        }

        // Answers – true/false questions answers for quiz
        boolean[] answers = {true, false, true, true, false};
        for (int i = 0; i < answers.length; i++) {
            // ternary operator use panni correct or wrong nu kaatrom
            System.out.println("Question " + (i + 1) + ": " + (answers[i] ? "Correct ✅" : "Wrong ❌"));
        }
    }
}
