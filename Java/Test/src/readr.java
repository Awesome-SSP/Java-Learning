import java.io.*;

public class readr {
    
    public static void main(String [] args) throws IOException
    {
        InputStreamReader in = null;
        in = new InputStreamReader(System.in);
        System.out.println("Enter character, e for exit");

        char ch;

        do{
            ch = (char) in.read();
            System.out.println(ch);
        }while(ch != 'e');

        if ( in != null)
        {
            in.close();

        }


    }
}
