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
            String cols = args.get(0);
            String tableFile = args.get(1);
            String outFile = args.get(2);

            Program p = new Program(tableFile, outFile, hasHeaders);
            Operation.PRINT.execute(p, cols);
        }

        if (operation.equals(Operation.SUM)) {
            checkArgs(args, 3);
            String col = args.get(0);
            String tableFile = args.get(1);
            String outFile = args.get(2);

            Program p = new Program(tableFile, outFile, hasHeaders);
            Operation.SUM.execute(p, col);
        }

        if (operation.equals(Operation.ACTION)) {
            String cols = "";
            if (args.size() == 3) {
                cols = args.get(0);
                args.removeFirst();
            }
            checkArgs(args, 2);
            String tableFile = args.get(0);
            String outFile = args.get(1);

            Program p = new Program(tableFile, outFile, hasHeaders);
            Operation.ACTION.execute(p, cols);
            Operation.PRINT.execute(p, cols);
        }

        if (operation.equals(Operation.WHEN)) {
            checkArgs(args, 3);
            String condition = args.get(0);
            String tableFile = args.get(1);
            String outFile = args.get(2);

            Program p = new Program(tableFile, outFile, hasHeaders);
            Operation.WHEN.execute(p, condition);
            Operation.PRINT.execute(p, "");
        }

        if (operation.equals(Operation.UPDATE)) {
            checkArgs(args, 3);
            String indices = args.get(0);
            String tableFile = args.get(1);
            String outFile = args.get(2);

            Program p = new Program(tableFile, outFile, hasHeaders);
            Operation.UPDATE.execute(p, indices);
            Operation.PRINT.execute(p, "");
        }
    }
    
    private static List<Integer> splitToListInt(String s) {
        if (s.isEmpty()) {
            return new ArrayList();
        }
        return Arrays.asList(s.split(",")).stream().map(x -> new Integer(x)).collect(toList());

    }

    private static void checkArgs(List<String> args, int count) {
        if (args.size() != count) {
            throw new RuntimeException("OTHER ERROR");
        }
    }

    private enum Operation {
        PRINT("-print"), SUM("-sum"), ACTION("-action"), WHEN("-when"), UPDATE("-update"), FILE("");

        private String flag;

        private Operation(String flag) {
            this.flag = flag;
        }

        String getFlag() {
            return flag;
        }

        void execute(Program p, String arg) {
            switch (this) {
                case PRINT:
                    p.print(splitToListInt(arg));
                    break;
                case SUM:
                    p.sum(new Integer(arg));
                    break;
                case ACTION:
                    p.action(splitToListInt(arg));
                    break;
                case WHEN:
                    p.when(arg);
                    break;
                case UPDATE:
                    List<String> indices = Arrays.asList(arg.split(","));
                    Integer row = new Integer(indices.get(0));
                    Integer col = new Integer(indices.get(1));
                    String value = String.join(",", indices.subList(2, indices.size()));
                    p.update(row, col, value);

            }
        }

        static Operation fromFlag(LinkedList<String> flags) {
            for (Operation op : Operation.values()) {
                if (flags.contains(op.getFlag())) {
                    flags.remove(op.getFlag());
                    return op;
                }
            }
            return FILE;
        }

    }
}
