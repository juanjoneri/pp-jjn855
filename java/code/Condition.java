import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Condition {

    private Matcher matcher;
    private String input;
    private boolean done;

    // (relCond) && (relCond) || (relCond) || (relCond)
    public Condition(String input) {
        this.input = "&& " + input;
        matcher = RelCond.PAT.matcher(this.input);
        if (!matcher.find()) {
            throw new RuntimeException("COND ERROR");
        }
        done = false;
    }

    public RelCond next() {
        if (done) {
            return null;
        }
        RelCond next = new RelCond(input.substring(matcher.start(), matcher.end()));
        done = !matcher.find();
        return next;
    }

    // && (exp)
    public static class RelCond {

        static Pattern PAT = Pattern.compile("(&&|\\|\\|)\\s*?(\\(.+?\\))");

        public Exp exp;
        public RelOp relOp;

        public RelCond(String input) {
            Matcher matcher = PAT.matcher(input);
            if (!matcher.matches()) {
                throw new RuntimeException("COND ERROR");
            }
            
            relOp = getRelOp(matcher.group(1));
            exp = new Exp(matcher.group(2));
        }

        enum RelOp {
            AND, OR
        }
        
        private RelOp getRelOp(String name) {
            if (name.equals("&&")) {
                return RelOp.AND;
            }
            if (name.equals("||")) {
                return RelOp.OR;
            }
            throw new RuntimeException("COND ERROR");
        }
        
        public String toString() {
            return String.format("%s %s", relOp, exp);
        }
    }

    // ($col == value)
    public static class Exp {

        static Pattern PAT = Pattern.compile("\\((.+?)(<>|==|<|>)(.+?)\\)");

        public Value col;
        public Value value;
        public Op op;

        public Exp(String input) {
            Matcher matcher = PAT.matcher(input);
            if (!matcher.matches()) {
                throw new RuntimeException("COND ERROR");
            }
            
            String left = matcher.group(1);
            if (left.startsWith("$")) {
                left = left.substring(1);
                col = Value.fromConstant(left);
            } else {
                value = Value.fromConstant(left);
            }

            String right = matcher.group(3);
            if (right.startsWith("$")) {
                right = right.substring(1);
                col = Value.fromConstant(right);
            } else {
                value = Value.fromConstant(right);
            }

            op = getOp(matcher.group(2));

            if (col == null || value == null) {
                throw new RuntimeException("COND ERROR");
            }

        }
        
        Op getOp(String name) {
            switch (name) {
            case "<":
                return Op.LT;
            case ">":
                return Op.GT;
            case "<>":
                return Op.NE;
            case "==":
                return Op.EQ;
            }
            throw new RuntimeException("COND ERROR");
            
        }
        
        public String toString() {
            return String.format("($%s %s %s)", col, op, value);
        }

        enum Op {
            LT, GT, NE, EQ
        }
    }

    public static class Value {
        private static Pattern FLOAT = Pattern.compile("^[-+]?[0-9]*\\.[0-9]*$");
        private static Pattern INT = Pattern.compile("^[-+]?[0-9]+$");

        private String s;
        private Float f;
        
        public Value(String s) {
            this.s = s;
        }

        public Value(Float f) {
            this.f = f;
        }

        public static Value fromConstant(String constant) {
            if (FLOAT.matcher(constant).matches() || INT.matcher(constant).matches()) {
                return new Value(new Float(constant));
            }
            return new Value(constant);
        }

        public boolean isString() {
            return this.s != null;
        }

        public boolean isNumeric() {
            return this.f != null;
        }

        public String getString() {
            return s;
        }

        public Float getFloat() {
            return f;
        }

        public String toString() {
            return isString() ? getString() : getFloat().toString();
        }
    }

    private Condition() {};
}