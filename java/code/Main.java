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

        String arg = operation.getArg(args);
        String tableFile = operation.getTableFile(args);
        String outFile = operation.getOutFile(args);

        Program p = new Program(tableFile, outFile, hasHeaders);

        if (!operation.equals(Operation.FILE)) {
            operation.execute(p, arg);
        }

        if (Operation.ACTION.equals(operation)) {
            Operation.PRINT.execute(p, arg);
        }

        if (Arrays.asList(Operation.WHEN, Operation.UPDATE).contains(operation)) {
            Operation.PRINT.execute(p, "");
        }

        if (operation.equals(Operation.FILE)) {
            for (String line : Io.read(arg)) {
                LinkedList<String> lineArgs = new LinkedList(Arrays.asList(line.split("\\s+")));
                Operation lineOp = Operation.fromFlag(lineArgs);
                String lineArg = operation.getArg(lineArgs);
                lineOp.execute(p, lineArg);
            }
        }
    }
    
    private static List<Integer> splitToListInt(String s) {
        if (s.isEmpty()) {
            return new ArrayList();
        }
        return Arrays.asList(s.split(",")).stream().map(x -> new Integer(x)).collect(toList());

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

        String getArg(LinkedList<String> flags) {
            if (flags.size() == 2) {
                checkIsAction();
                return "";
            }
            return flags.get(0);
        }

        String getTableFile(LinkedList<String> flags) {
            if (flags.size() == 2) {
                checkIsAction();
                return flags.get(0);
            }
            return flags.get(1);
        }

        String getOutFile(LinkedList<String> flags) {
            if (flags.size() == 2) {
                checkIsAction();
                return flags.get(1);
            }
            return flags.get(2);
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

        void checkIsAction() {
            if (!this.equals(ACTION)) {
                throw new RuntimeException("OTHER ERROR");
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
