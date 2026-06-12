import java.io.File;

public class GetFileSizeProgram {
    public static void main(String[] args) {

        File file = new File("sample.txt");

        System.out.println(file.length() + " bytes");
    }
}
