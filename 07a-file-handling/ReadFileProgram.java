import java.io.File;
import java.util.Scanner;

public class ReadFileProgram {
    public static void main(String[] args) throws Exception {

        File file = new File("sample.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            System.out.println(data);
        }

        sc.close();
    }
}
