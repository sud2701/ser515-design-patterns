import java.io.IOException;
@SuppressWarnings(value="unused")
public class Main {
    public static void main(String[] args) throws IOException {
        try {
            Facade f = new Facade();
        }
        catch(Exception e){
            e.getMessage();
        }
    }
}
