public class DoWhileLoop01 {
    public static void main(String[] args)
    {

            
        String [] studentNames = {"John", "Jane", "Jack", "Jill"};
        int [] studentAges = {20, 21, 22, 23};


        int i = 0;
        do{

            int j = 0;
            do{
                 System.out.println(studentNames[i] + " is " + studentAges[j] + " years old.");
                 j++;

            }while(j < studentAges.length);
           
            i++;

        }while(i < studentNames.length);




    }
}
