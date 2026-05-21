public class WhileLoop01{
    public static void main(String[] args)
    {
     
        String [] studentNames = {"John", "Jane", "Jack", "Jill"};
        int [] studentAges = {20, 21, 22, 23};


    


        int i = 0;
        while(i < studentNames.length){

            int j = 0;
            while(j < studentAges.length){
                 System.out.println(studentNames[i] + " is " + studentAges[j] + " years old.");
                 j++;

            }
           
            i++;

        }

    }
}