public class ConditionalStatements{
    public static void main(String[] inputs){

        int x = 20;
        int y = 10;
        System.out.println("x is " + x + " and y is " + y);
        System.out.println(x > y);
        System.out.println("********************************");
        System.out.println("********************************");
        System.out.println("********************************");

        if(x > y){
            System.out.println("x is greater than y");
        }
        else {
            System.out.println("x is not greater than y");
        }

        System.out.println("********************************");
        System.out.println("********************************");
        System.out.println("********************************");

        if(x > y){
            System.out.println("x is greater than y");
        }
        else if(x == y){
            System.out.println("x is equal to y");
        }
        else {
            System.out.println("x is not greater than y");
        }
        System.out.println("********************************");
        System.out.println("********************************");
        System.out.println("Nested if example:");
        System.out.println("********************************");

        if(x > y){
            if(x - y > 5){
                System.out.println("x is greater than y by more than 5");
            }
            else {
                System.out.println("x is greater than y by 5 or less");
            }
        }
        else if(x == y){
            System.out.println("x is equal to y");
        }
        else {
            System.out.println("x is not greater than y");
        }
    }
}





// public class ConditionalStatements {
//     public static void main(String[] args) {
//         int number = 15;

//         // if-else condition
//         if (number > 0) {
//             System.out.println("The number is positive.");
//         } else if (number < 0) {
//             System.out.println("The number is negative.");
//         } else {
//             System.out.println("The number is zero.");
//         }

//         // Nested if
//         if (number != 0) {
//             if (number % 2 == 0) {
//             System.out.println("It is an even number.");
//             } else {
//             System.out.println("It is an odd number.");
//             }
//         } else {
//             System.out.println("The number is zero, so it is neither even nor odd.");
//         }

//         // Ternary Operator
//         String result = (number > 10  ) ? "Greater than 10" : "10 or less";
//         System.out.println("Ternary check: " + result);
//     }
// }


// public class ConditionalStatements {
//     public static void main(String[] args) {
//         int number = 100;

//         // switch condition (rule switch)
//         switch (number) {
//             case 10 -> System.out.println("The number is ten.");
//             case 15 -> System.out.println("The number is fifteen.");
//             case 20 -> System.out.println("The number is twenty.");
//             default -> System.out.println("The number is neither ten, fifteen, nor twenty.");
//         }
        
//     }
// }



// Task 1: Check if the number is between 10 and 20 using if-else.

// Task 2: Determine if the number is positive and divisible by 5 using nested if.

// Task 3: Use a ternary operator to check if the number is even or odd.

// Task 4: Check if the number is a multiple of 3 using if-else.

// Task 5: Determine if the number is negative and divisible by 4 using nested if.

// Task 6: Use a ternary operator to check if the number is greater than or equal to 50.

// Task 7: Check if the number is between -10 and 10 using if-else.

// Task 8: Determine if the number is positive and a multiple of 7 using nested if.

// Task 9: Use a ternary operator to check if the number is less than 100.

// Task 10: Check if the number is a two-digit number using if-else.

// Task 11: Determine if the number is negative and divisible by 6 using nested if.

// Task 12: Use a ternary operator to check if the number is divisible by 10.

// Task 13: Check if the number is greater than 0 and less than 5 using if-else.

// Task 14: Determine if the number is positive and divisible by 9 using nested if.

// Task 15: Use a ternary operator to check if the number is greater than or equal to 100.

// Task 16: Check if the number is a three-digit number using if-else.

// Task 17: Determine if the number is negative and divisible by 8 using nested if.

// Task 18: Use a ternary operator to check if the number is less than or equal to 0.

// Task 19: Check if the number is between 30 and 40 using if-else.

// Task 20: Determine if the number is positive and divisible by 11 using nested if.
