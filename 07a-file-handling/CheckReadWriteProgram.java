import java.io.File;

public class CheckReadWriteProgram {
    public static void main(String[] args) {

        File file = new File("sample.txt");

        System.out.println("Readable : " + file.canRead());
        System.out.println("Writable : " + file.canWrite());
    }
}
