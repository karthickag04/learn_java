import java.io.FileWriter;
import java.io.IOException;

public class AppendDataProgram {
    public static void main(String[] args) throws IOException {

        // true = append mode ON (adds new content without deleting old content)
        FileWriter writer = new FileWriter("sample.txt", true);

        writer.write("\nWelcome");
        writer.close();

        System.out.println("Data appended");
    }
}
