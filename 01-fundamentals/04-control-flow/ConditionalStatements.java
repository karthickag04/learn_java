
// public class ConditionalStatements{
//     public static void main(String[] args) {
//         String number = "added";
//         switch (number) {
//             case "added": // String case not allowed in switch for int variable
//                 System.out.println("number is 20");
//                 break;
//             case "30":
//                 System.out.println("number is 30");
//                 break;
//             case "40":
//                 System.out.println("number is 40");
//                 break;
//             default:
//                 throw new AssertionError();
//         }


// }
// }





// public class ConditionalStatements{
//     public static void main(String[] args) {
//         int number = 30;
//         String result = (number == 20) ? "number is 20" : (number > 20) ? "number is greater than 20" : "number is not 20";
//         System.out.println(result);

//     }
// }





// public class ConditionalStatements{
//     public static void main(String[] args) {
//         int number = 30;
//         String result = (number == 20) ? "number is 20" : (number > 20) ? "number is greater than 20" : "number is not 20";
//         System.out.println(result);
//         // // System.out.println(number == 20 && number < 30);
//         // if( number == 20)
//         // {
//         //   System.out.println("number is 20");  
//         // }
//         // else if (number > 20){
//         //     System.out.println("number is greater than 20");
//         // }
//         // else if (number > 20){
//         //     System.out.println("number is greater than 20");
//         // }
//         // else if (number > 20){
//         //     System.out.println("number is greater than 20");
//         // }
//         // else if (number > 20){
//         //     System.out.println("number is greater than 20");
//         // }
//         // else{
//         //     System.out.println("number is not 20");
//         // }
//     }
// }























// import java.util.Scanner;


// public class ConditionalStatements{
//     public static void main(String[] args) {

//         String userNameFromDb = "Ravi";
//         String passwordFromDb = "R@123";

        
//         // String userNameGivenByUser = "Ravi";
//         // String passwordGivenByUser = "R@1231";

//         Scanner input = new Scanner(System.in);

//         System.out.println("Enter the username : ");
//         String userNameGivenByUser = input.nextLine();
//         System.out.println("Enter the password:");
//         String passwordGivenByUser = input.nextLine();

//         System.out.println(userNameGivenByUser);
//         System.out.println(passwordGivenByUser);


//         // if(userNameFromDb.equals(userNameGivenByUser)){
//         //     System.out.println("username matched");
            
//         //     if (passwordFromDb.equals(passwordGivenByUser)) {
//         //         System.out.println("yes both passwords matched");
//         //     }
//         //     else{
//         //         System.out.println("Passwords not matched");
//         //     }

//         // }

//         // // else if(userNameFromDb == "Ravi"){
//         // //     System.out.println("username matched but with Ravi");

//         // // }
        
//         // else{
//         //     System.out.println("username not matched");
//         // }

//         String result = (userNameFromDb.equals(userNameGivenByUser)) ? ((passwordFromDb.equals(passwordGivenByUser)) ? "username matched and checked the password then Password also matched" : "password not matched") : ("Username not matched so unbale to check password");
//         System.out.println(result);

        
//     }
// }




// public class ConditionalStatements{
//     public static void main(String[] args) {
//         int StudentTotal= 325;
//         int RequiredTotal = 415;
//         String StudentCommunity = "Ch";
//         int StudentMathMarks = 145;

//         System.out.println(StudentTotal > RequiredTotal);
//         System.out.println(StudentTotal > RequiredTotal && StudentTotal == 415);
       
       
//         if (StudentTotal >= RequiredTotal) {

//             if( StudentMathMarks >= 140 ) {
//                 System.out.println("StudentTotal is greater than RequiredTotal and Math marks are also good, we can admit the student");
//             }
//             else {
//                 System.out.println("StudentTotal is greater than RequiredTotal but Math marks are less, we need to re-evaluate");
//             }
//             // System.out.println("StudentTotal is greater than RequiredTotal and we can admit the student");
//         }    
//         else if (StudentTotal < RequiredTotal && StudentTotal >= 300 && StudentCommunity.equals("Ch") ) {
//             System.out.println("StudentTotal is less than RequiredTotal and we can keep them under waiting list");
//         }    
//         else if (StudentTotal < RequiredTotal && StudentTotal >= 300 && StudentCommunity.equals("Ch") ) {
//             System.out.println("StudentTotal is less than RequiredTotal and we can keep them under waiting list");
//         }    
//         else {
//             if(StudentCommunity.equals("Ch")) {
//                 System.out.println("StudentTotal is less than RequiredTotal and from Ch community, we can keep them under waiting list");
//             }
//             System.out.println("StudentTotal is less than RequiredTotal and we cannot admit the student");
//         }


//         System.out.println("********************************");
//         System.out.println("********************************");
//         System.out.println("********************************");
//         System.out.println("********************************");

//         // Ternary Operator
//         String result = (StudentTotal >= RequiredTotal) ? "Eligible for admission" : "Not eligible for admission";
//         System.out.println("Ternary check: " + result);

//         // Ternary Operator
//         String result_01 = (StudentTotal >= RequiredTotal) ? (StudentCommunity == "Ch" ? "Eligible for admission" : "Not eligible for admission") : "Not eligible for admission";
//         System.out.println("Ternary check: " + result_01);
    
    
//     }
// }






// public class ConditionalStatements{
//     public static void main(String[] args) {
        
//         int number = 10;

//         // switch condition (rule switch)
//         switch (number) {
//             case 10 : {
//                 System.out.println("The number is ten.");
//                 break;
//             }
//             case 's' : {
//                 System.out.println("The number is ten.");
//                 break;
//             }
//             case 11 : {
//                 System.out.println("The number is ten.");
//                 break;
//             }
            
//         }
        
//     }
// }



public class ConditionalStatements{
    public static void main(String[] args) {
        
        int number = 10;

        // switch condition (rule switch)
        switch (number) {
            case 10 -> System.out.println("The number is ten.");
            case 's' -> System.out.println("The letter is s.");
            case 20 -> System.out.println("The number is twenty.");
            default -> System.out.println("The number is neither ten, fifteen, nor twenty.");
        }
        
    }
}



// public class ConditionalStatements {
//     public static void main(String[] args) {
//         Random rand = new Random();
//         int number = rand.nextInt(20); // generates a random int from 0 to 19

//         System.out.println("Random number generated: " + number);

//         // switch condition with 20 cases (0 to 19)
//         switch (number) {
//             case 0 -> System.out.println("Case 0: Zero");
//             case 1 -> System.out.println("Case 1: One");
//             case 2 -> System.out.println("Case 2: Two");
//             case 3 -> System.out.println("Case 3: Three");
//             case 4 -> System.out.println("Case 4: Four");
//             case 5 -> System.out.println("Case 5: Five");
//             case 6 -> System.out.println("Case 6: Six");
//             case 7 -> System.out.println("Case 7: Seven");
//             case 8 -> System.out.println("Case 8: Eight");
//             case 9 -> System.out.println("Case 9: Nine");
//             case 10 -> System.out.println("Case 10: Ten");
//             case 11 -> System.out.println("Case 11: Eleven");
//             case 12 -> System.out.println("Case 12: Twelve");
//             case 13 -> System.out.println("Case 13: Thirteen");
//             case 14 -> System.out.println("Case 14: Fourteen");
//             case 15 -> System.out.println("Case 15: Fifteen");
//             case 16 -> System.out.println("Case 16: Sixteen");
//             case 17 -> System.out.println("Case 17: Seventeen");
//             case 18 -> System.out.println("Case 18: Eighteen");
//             case 19 -> System.out.println("Case 19: Nineteen");
//             default -> System.out.println("This should never happen.");
//         }
//     }
// }
















// public class ConditionalStatements{
//     public static void main(String[] inputs){

//         int x = 20;
//         int y = 10;
//         System.out.println("x is " + x + " and y is " + y);
//         System.out.println(x > y);
//         System.out.println("********************************");
//         System.out.println("********************************");
//         System.out.println("********************************");

//         if(x > y){
//             System.out.println("x is greater than y");
//         }
//         else {
//             System.out.println("x is not greater than y");
//         }

//         System.out.println("********************************");
//         System.out.println("********************************");
//         System.out.println("********************************");

//         if(x > y){
//             System.out.println("x is greater than y");
//         }
//         else if(x == y){
//             System.out.println("x is equal to y");
//         }
//         else {
//             System.out.println("x is not greater than y");
//         }
//         System.out.println("********************************");
//         System.out.println("********************************");
//         System.out.println("Nested if example:");
//         System.out.println("********************************");

//         if(x > y){
//             if(x - y > 5){
//                 System.out.println("x is greater than y by more than 5");
//             }
//             else {
//                 System.out.println("x is greater than y by 5 or less");
//             }
//         }
//         else if(x == y){
//             System.out.println("x is equal to y");
//         }
//         else {
//             System.out.println("x is not greater than y");
//         }
//     }
// }





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
