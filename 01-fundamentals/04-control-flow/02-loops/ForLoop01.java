public class ForLoop01{
    public static void main(String[] args) {

        // String[] studentNames = {"Ali", "Ayse", "Ahmet", "Mehmet", "Fatma"};
        // int[] studentAges = {20, 21, 22, 23, 24};

        // ForLoopSingle(studentNames);
        // System.out.println("-----------------------------");
        // System.out.println("-----------------------------");
        // System.out.println("-----------------------------");
        // ForLoopNested(studentNames, studentAges);
        printRightTriangle(5);
    }


    public static void ForLoopSingle(String[] studentNames) {

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println(studentNames[i]);
        }

    }

    public static void ForLoopSingleWithTwoArgs(String[] studentNames, String[] studentAges) {

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("Name: " + studentNames[i] + ", Age: " + studentAges[i]);
        }

    }

    public static void ForLoopNested(String[] studentNames, int[] studentAges) {

        for (int firstIndexOfStudentNames = 0; firstIndexOfStudentNames < studentNames.length; firstIndexOfStudentNames++) {


            for (int firstIndexOfStudentAges= 0; firstIndexOfStudentAges < studentAges.length; firstIndexOfStudentAges++) {

                System.out.println("Name: " + studentNames[firstIndexOfStudentNames] + ", Age: " + studentAges[firstIndexOfStudentAges]);

            //     if (studentAges[j] == "22") {
            //         System.out.println("Name: " + studentNames[i] + ", Age: " + studentAges[j]);
            //     }


            }
        }

    }





        public static void printRightTriangle(int rows) {
      
      
            for (int i = 1; 2<= 5; i++) {


            for (int j = 1; 1 <= 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}