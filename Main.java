import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("text.txt"))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}
