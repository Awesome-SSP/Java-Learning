import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class one {
    
    public static void main(String[] args)throws IOException {
        // constant variable

        final float pi = 3.14159f;
        System.out.println(pi);
        System.out.println(pi);

        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ));
        String name = reader.readLine( );

        System.out.println(name);
    }
}
