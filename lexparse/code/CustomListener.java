import org.antlr.v4.runtime.*;

public class CustomListener extends BaseErrorListener {

    private String message;

    public CustomListener(String message) {
        super();
        this.message = message;
    }
    
    @Override
    public void syntaxError(
        Recognizer<?, ?> recognizer, 
        Object offendingSymbol, 
        int line, 
        int charPositionInLine,
        String msg,
        RecognitionException e) {
            System.out.println(message);
        }
 }