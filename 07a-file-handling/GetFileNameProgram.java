import java.io.File;

public class GetFileNameProgram {
    public static void main(String[] args) {

        File file = new File("sample.txt");

        System.out.println(file.getName());
    }
}
