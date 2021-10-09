import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.IOException;

public class Program {

    private Table table;

    public Program(String inFile, boolean header) throws IOException {
        File file = new File(inFile);
        Scanner scanner = new Scanner(file);

        List<List<String>> data = new ArrayList();
        while(scanner.hasNextLine()) {
            List<String> row = Arrays.asList(scanner.nextLine().split("\\s+"));
            data.add(row);
        }
        table = new TableBuilder(data, header).validate().build();
    }

    public void print(List<Integer> cols, String outFile) throws IOException {
        File file = new File(outFile);
        file.createNewFile();
        FileWriter writer = new FileWriter(outFile);
        writer.write(table.print(cols));
        writer.close();
    }

    public void sum(int col) {

    }

    public void action(List<Integer> cols) {
        
    }

    public void when(String condition) {

    }

    public void update(int row, int col, String value) {

    }
}