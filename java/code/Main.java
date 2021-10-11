import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        try {
            runMain(new LinkedList(Arrays.asList(args)));
        } catch (Exception e) {
            if (e.getMessage() != null) {
                System.out.println(e.getMessage());
            } else {
                System.out.println("OTHER ERROR");
            }
        }
    }

    private static void runMain(LinkedList<String> args) {
        boolean hasHeaders = args.peek().equals("-header");
        if (hasHeaders) {
            args.removeFirst();
        }

        Operation operation = Operation.fromFlag(args.peek());
        if (!operation.equals(Operation.FILE)) {
            args.removeFirst();
        }

        if (operation.equals(Operation.PRINT)) {
            checkArgs(args, 3);
            List<Integer> cols = splitToListInt(args.get(0));
            String tableFile = args.get(1);
            String outFile = args.get(2);

            Program p = new Program(tableFile, hasHeaders);
            p.print(cols, outFile);
        }
    }
    
    private static List<Integer> splitToListInt(String s) {
        return Arrays.asList(s.split(",")).stream().map(x -> new Integer(x)).collect(toList());

    }

    private static void checkArgs(List<String> args, int count) {
        if (args.size() != count) {
            throw new RuntimeException("OTHER ERROR");
        }
    }

    private enum Operation {
        PRINT, SUM, ACTION, WHEN, UPDATE, FILE;

        static Operation fromFlag(String flag) {
            switch(flag) {
                case "-print":
                    return PRINT;
                case "-sum":
                    return SUM;
                case "-action":
                    return ACTION;
                case "-when":
                    return WHEN;
                case "-update":
                    return UPDATE;
                default:
                    return FILE;
            }

        }

    }
}
