public class JavaArrayWithWHILE01a {
    public static void main(String[] args) {



        String[] StudentNames={"Ram", "Ravi", "Rajesh"};


        /* 
       
        
        starting index value;
        while(condition to check)
        {

        statement to execute;

        increament;
        }
          
          
        */


        int index=0;
        while( index < StudentNames.length){
            System.out.println(StudentNames[index]);

            index++;
            
        }

    }
}