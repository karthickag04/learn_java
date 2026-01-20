public class NestedForWhileDoWhile {
     public static void main(String[] args) {
        
        
        
        for (int i = 0; i < 3; i++){
            System.out.println("the value of i is .." + i);
             for (int j = 0; j < 12; j++){
            System.out.println("the value of J is .." + j);
             }
         }



        int ii = 0;
         while ( ii < 3)
            {
                System.out.println("the value of ii is .." + ii);
                int jj = 0;
                while( jj < 12){
                    System.out.println("the value of Jj is .." + jj);
                    jj++;
                }
                ii++;
         }



            int iii = 4;
            do
                {
                    System.out.println("the value of iii is .." + iii);
                    int jjj = 0;
                    do{
                            System.out.println("the value of jjj is .." + jjj);
                            jjj++;
                        } while( jjj < 12);
                        iii++;
            }while ( iii < 3);

     }
}
