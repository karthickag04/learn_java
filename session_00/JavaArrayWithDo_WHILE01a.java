public class JavaArrayWithDo_WHILE01a {
    public static void main(String[] args) {

                String[] StudentNames={"Ram", "Ravi", "Rajesh"};


        /* 
        
        
      
        Starting index value;
        do {
        type the statement to execute 
        index++;
        
        }
        while(condition to check)
          
          
        */


        int index=2;
        do {  
            System.out.println(StudentNames[index]);
            index++;
            
        } 
        while( index < StudentNames.length);


        
    }
}
    

