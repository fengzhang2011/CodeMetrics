import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;


public class ComputeMetrics {
    
    public static void main(String[] args) throws Exception {
        
        // Read in source code
        ANTLRFileStream input = new ANTLRFileStream(args[0]);
        
        // Put into lexer
        JavaLexer lexer = new JavaLexer(input);
        
        // Extract tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // Put into Parser
        JavaParser parser = new JavaParser(tokens);
        
        // Get java source return
        JavaParser.javaSource_return r = parser.javaSource();
        
        // Get tree from java source return
        CommonTree t = (CommonTree)r.getTree();
        
        // for debug - print AST tree
        //System.out.println(t.toStringTree());
        
        // Convert tree to node stream
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
        
        // Set tokens to node stream
        nodes.setTokenStream(tokens);
        
        // Now, walk through the tree via JavaTreeParser
        JavaTreeParser walker = new JavaTreeParser(nodes);
        
        // Set source file name
        walker.setSourceFile(args[0]);

        //System.out.println("\nWalk tree:\n");
        
        // walk through the source tree
        walker.javaSource();
        
        //System.out.println(tokens.toString());

        //System.out.println("metrics computed");

        // Compute non-AST based metrics
        CodeMetrics metric = CodeMetrics.instance();
        metric.computeNonASTMetrics();
        metric.print();
        
    }

}
