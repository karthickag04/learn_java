public class JavaArrayWithDo_WHILE {
    public static void main(String[] args) {

        // Flavors array – ice cream flavors list
        String[] flavors = {"Chocolate", "Vanilla", "Strawberry", "Mango", "Pista"};
        // Using do-while loop to print each flavor
        int i = 0;
        do {
            System.out.println("Yummy flavor #" + (i + 1) + ": " + flavors[i]);
            i++;
        } while (i < flavors.length);







        
        // Animals array – pasu, poonai mathiri animal names
        String[] animals = {"Tiger", "Elephant", "Kangaroo", "Zebra", "Panda"};
        // Using do-while loop to print each animal
        int j = 0;
        do {
            System.out.println("I love the " + animals[j] );
            j++;
        } while (j < animals.length);
    }
}
    

