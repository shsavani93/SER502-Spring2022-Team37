import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException

    {

        String format = args[0].substring(args[0].length()-4);
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

        LaxScriptLexer lsLexer = new LaxScriptLexer(cStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lsLexer);
        LaxScriptParser lsParser = new LaxScriptParser(tokenStream);
        ParseTree pTree = lsParser.p();
        LaxScriptEvaluate eval = new LaxScriptEvaluate();
        eval.visit(pTree);


    }
}
