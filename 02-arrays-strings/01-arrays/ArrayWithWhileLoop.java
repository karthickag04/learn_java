public class ArrayWithWhileLoop {
    public static void main(String[] args) {

        // Flavors array – ice cream flavors list
        String[] flavors = {"Chocolate", "Vanilla", "Strawberry", "Mango", "Pista"};
        // Using while loop to print each flavor
        int i = 0;
        while (i < flavors.length) {
            System.out.println("Yummy flavor #" + (i + 1) + ": " + flavors[i]);
            i++;
        }

        // Animals array – pasu, poonai mathiri animal names
        String[] animals = {"Tiger", "Elephant", "Kangaroo", "Zebra", "Panda"};
        // Using while loop to print each animal
        int j = 0;
        while (j < animals.length) {
            System.out.println("I love the " + animals[j] + " 🐾");
            j++;
        }

        // Heroes array – super hero names
        String[] heroes1 = {"Spider-Man", "Iron Man", "Captain Marvel", "Hulk", "Batman"};
        // Using while loop to print each hero
        int k1 = 0;
        while (k1 < heroes1.length) {
            System.out.println(heroes1[k1] + " saves the day! 🦸‍♂️");
            k1++;
        }

        // Planets array – graham names
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        // Using while loop to print each planet
        int l = 0;
        while (l < planets.length) {
            System.out.println("Planet #" + (l + 1) + " is " + planets[l]);
            l++;
        }

        // Foods array – sapadu items
        String[] foods = {"Pizza", "Burger", "French Fries", "Noodles", "Ice Cream"};
        // Using while loop to print each food
        int m = 0;
        while (m < foods.length) {
            System.out.println("I want to eat: " + foods[m]);
            m++;
        }

        // Sports array – vilayattu names
        String[] sports = {"Cricket", "Football", "Basketball", "Tennis", "Hockey"};
        // Using while loop to print each sport
        int n = 0;
        while (n < sports.length) {
            System.out.println("Let's play " + sports[n] + " today!");
            n++;
        }

        // Party items array – kalyana items
        String[] partyItems = {"Cake", "Balloons", "Gifts", "Party Hats", "Music"};
        // Using while loop to print each party item
        int o = 0;
        while (o < partyItems.length) {
            System.out.println("Don't forget the " + partyItems[o] + "!");
            o++;
        }
    }
}