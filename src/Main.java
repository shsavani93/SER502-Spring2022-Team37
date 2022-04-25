import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException

    {

        String format = args[0].substring(args[0].length()-5);
        if (!format.equals(".lax"))
        {
            throw new IllegalArgumentException(" Wrong file format, It should be .lax ");
        }

        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(args[0])));

        String generate = "";
        String data = "";

        while ((generate = bufferedReader.readLine()) != null)
        {
            data= data + generate;
        }

        CharStream cStream = CharStreams.fromString(data);

    }
}
