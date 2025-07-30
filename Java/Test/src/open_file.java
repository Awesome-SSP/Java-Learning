import java.io.*;

public class open_file{
    public static void main(String [] args) throws IOException
    {

        // FileInputStream input = null;

        // input = new FileInputStream("FileInput.txt");
        // int number;
         
        // while((number = input.read()) != -1)
        // {
        //     System.out.println(number);
        // }

        // FileOutputStream output = null;
        // output = new FileOutputStream("Awesome.txt");
        // output.write(65);
        // output.write(67);





        FileReader input = null;

        input = new FileReader("FileInput.txt");
        int number;
         
        while((number = input.read()) != -1)
        {
            System.out.println(number);
        }

        FileWriter output = null;
        output = new FileWriter("Awesome.txt");
        output.write(65);
        output.write(67);
    }
}