import java.io.File;

// Listing of files and folders
public class nav{
    public static void main(String [] args)
    {
        File f = null;
        
        String paths[];
        f = new File("/Application");

        paths = f.list();

        for(String p: paths)
        {
            System.out.println(p);
        }
    }
}