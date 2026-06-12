import java.io.File;

public class CheckFileExistsProgram {
    public static void main(String[] args) {

        File file = new File("sample.txt");

        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File not found");
        }
    }
}
