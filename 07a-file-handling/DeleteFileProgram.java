import java.io.File;

public class DeleteFileProgram {
    public static void main(String[] args) {

        File file = new File("sample.txt");

        if (file.delete()) {
            System.out.println("File deleted");
        } else {
            System.out.println("Cannot delete");
        }
    }
}
