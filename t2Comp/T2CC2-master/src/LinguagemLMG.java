/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author crist
 */
public class LinguagemLMG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args.length < 2){
            System.out.println("LinguagemLMG.jar [caminho do arquivo LMG] [caminho do arquivo output-file.py]");
            System.exit(0);
        }
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            String codeFile = args[0];
            //String outputFile = args[1];

            String outputfile = args[1];

            DescriptiveErrorListener listener = new DescriptiveErrorListener();

            ANTLRInputStream ais = new ANTLRInputStream(new FileInputStream(codeFile));
            LinguagemLMGLexer lex = new LinguagemLMGLexer(ais);
            CommonTokenStream tokens = new CommonTokenStream(lex);
            LinguagemLMGParser parser = new LinguagemLMGParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(listener);

            LinguagemLMGParser.ProgramaContext programa = parser.programa();
            LMGVisitor visitor = new LMGVisitor();
            visitor.visitPrograma(programa);

            BufferedWriter out = new BufferedWriter(new FileWriter(outputfile));

            out.write(visitor.codigo.toString());

            out.close();

        } catch (IOException e) {

        }
    }
}
