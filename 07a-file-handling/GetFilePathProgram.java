import java.io.File;

public class GetFilePathProgram {
    public static void main(String[] args) {

        File file = new File("sample.txt");

        System.out.println(file.getAbsolutePath());
    }
}
