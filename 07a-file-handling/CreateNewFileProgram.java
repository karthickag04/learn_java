import java.io.File;
import java.io.IOException;

public class CreateNewFileProgram {
    public static void main(String[] args) throws IOException {

        File file = new File("sample.txt");

        if (file.createNewFile()) {
            System.out.println("File created");
        } else {
            System.out.println("File already exists");
        }

        // Operations op=new Operations("sample.txt"   );
        // op.addition();
    }}

// }

// class Operations{

//     public String FileName = "";

//     public Operations(String name){
//         this.FileName =name;
//     }

    
//     public  void addition(){
//         System.out.println("Addition method called and given the file name: "+FileName);
//     }
// }