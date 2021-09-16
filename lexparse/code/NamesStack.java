import java.util.HashSet;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Deque;
import java.util.Set;

/**
 * Keeps track of variables in the stack.
 */
@SuppressWarnings({"unchecked"})
public class NamesStack {

    private Deque<Scope> stack;

    @Override
    public String toString() {
        String value = "Stack:\n";
        for (Scope s : stack) {
            value += "Scope:\n";
            value += s.names;
            value += "\n";
        }
        return value;
    }

    /**
     * Checks that the given name was defined in the stack (any of the enclosing scopes).
     * 
     * <p> Used to check that a variable name usage is valid.
     */
    public void checkInStack(String name) {
        for (Scope s : stack) {
            if (s.contains(name)) {
                return;
            }
        }
        System.out.println("NAME USE ERROR: " + name);
        return;
    }

    public void removeLastScope() {
        stack.pop();
    }

    public void addNewScope() {
        stack.push(new Scope());
    }

    public void addNameToCurrentScope(String name) {
        stack.peek().addName(name);
    }

    public NamesStack() {
        stack = new ArrayDeque<Scope>();
    }

    class Scope {

        private Set<String> names;

        public boolean contains(String name) {
            return names.contains(name);
        }

        public void addName(String name) {
            if (names.contains(name)) {
                System.out.println("VAR ERROR: " + name);
            }
            names.add(name);
        }

        Scope() {
            names = new HashSet();
        }

    }
}