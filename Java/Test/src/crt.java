import java.io.File;
// Creating a new file directory in windows

public class crt{
    public static void main(String[] args)
    {

        String directory = "---";
        File f = new File(directory);

        f.mkdirs();

    }
}