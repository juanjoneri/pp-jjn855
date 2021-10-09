import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.IOException;

public final class Io {

    public static List<String> read(String inFile) {
        List<String> lines = new ArrayList();
        try {
            File file = new File(inFile);
            Scanner scanner = new Scanner(file);

            
            while(scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("OTHER ERROR");
        }
        return lines;
    }

    public static void write(String value, String outFile) {
        try {
            File file = new File(outFile);
            file.createNewFile();
            FileWriter writer = new FileWriter(outFile);
            writer.write(value);
            writer.close();
        } catch (IOException e) {
            System.out.println("OTHER ERROR");
        }
    }

}