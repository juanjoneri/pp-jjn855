import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

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
            throw e;
        }
    }

    private static void runMain(LinkedList<String> args) {
        boolean hasHeaders = args.contains("-header");

        if (hasHeaders) {
            args.remove("-header");
        }

        Operation operation = Operation.fromFlag(args);

        if (operation.equals(Operation.PRINT)) {
            checkArgs(args, 3);
            List<Integer> cols = splitToListInt(args.get(0));
            String tableFile = args.get(1);
            String outFile = args.get(2);

            Program p = new Program(tableFile, hasHeaders);
            p.print(cols, outFile);
        }

        if (operation.equals(Operation.SUM)) {
            checkArgs(args, 3);
            Integer col = new Integer(args.get(0));
            String tableFile = args.get(1);
            String outFile = args.get(2);

            Program p = new Program(tableFile, hasHeaders);
            p.sum(col, outFile);
        }

        if (operation.equals(Operation.ACTION)) {
            List<Integer> cols = new ArrayList();
            if (args.size() == 3) {
                cols = splitToListInt(args.get(0));
                args.removeFirst();
            }
            checkArgs(args, 2);
            String tableFile = args.get(0);
            String outFile = args.get(1);

            Program p = new Program(tableFile, hasHeaders);
            p.action(cols);
            p.print(cols, outFile);
        }

        if (operation.equals(Operation.WHEN)) {
            checkArgs(args, 3);
            String condition = args.get(0);
            String tableFile = args.get(1);
            String outFile = args.get(2);

            Program p = new Program(tableFile, hasHeaders);
            p.when(condition);
            p.print(new ArrayList(), outFile);
        }

        if (operation.equals(Operation.UPDATE)) {
            checkArgs(args, 3);
            List<String> indices = Arrays.asList(args.get(0).split(","));
            String tableFile = args.get(1);
            String outFile = args.get(2);

            Program p = new Program(tableFile, hasHeaders);
            p.update(new Integer(indices.get(0)), new Integer(indices.get(1)), indices.get(2));
            p.print(new ArrayList(), outFile);
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

        static Operation fromFlag(LinkedList<String> flags) {
            if (flags.contains("-print")) {
                flags.remove("-print");
                return PRINT;
            }
            if (flags.contains("-sum")) {
                flags.remove("-sum");
                return SUM;
            }
            if (flags.contains("-action")) {
                flags.remove("-action");
                return ACTION;
            }
            if (flags.contains("-when")) {
                flags.remove("-when");
                return WHEN;
            }
            if (flags.contains("-update")) {
                flags.remove("-update");
                return UPDATE;
            }
            return FILE;
        }

    }
}
