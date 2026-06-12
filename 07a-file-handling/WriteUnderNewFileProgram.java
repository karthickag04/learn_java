
import java.io.FileWriter;
import java.io.IOException;

public class WriteUnderNewFileProgram {
    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("sample.txt");

        writer.write("Hello Java");
        writer.close();

        System.out.println("Data written");
    }
}