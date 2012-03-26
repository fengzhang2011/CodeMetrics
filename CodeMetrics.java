/**
 * @author fengzhang
 * 
 */

import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;

public class CodeMetrics
{
    private boolean isDebug = false;

    public static CodeMetrics theInstance = new CodeMetrics();

    private String currentFileName = null;
    private String currentClassName = null;
    private String currentInterfaceName = null;
    private String currentFunctionName = null;
    private ArrayList<String> currentFunctionList = new ArrayList<String>();
    private int currentCyclomatic = 1;

    // metrics - NOC (Number of Classes)
    HashMap<String, Integer> metricsNOC = new HashMap<String, Integer>();
    // metrics - NOI (Number of Interfaces)
    HashMap<String, Integer> metricsNOI = new HashMap<String, Integer>();
    // metrics - NOF (Number of Attributes)
    HashMap<String, Integer> metricsNOF = new HashMap<String, Integer>();
    // metrics - NOM (Number of Methods)
    HashMap<String, Integer> metricsNOM = new HashMap<String, Integer>();
    // metrics - NOSM (Number of Static Methods)
    HashMap<String, Integer> metricsNOSM = new HashMap<String, Integer>();
    // metrics - PAR (Number of Parameters)
    HashMap<String, Integer> metricsPAR = new HashMap<String, Integer>();
    // metrics - LOC (Lines of Code)
    HashMap<String, Integer> metricsLOC = new HashMap<String, Integer>();
    // metrics - CLOC (Lines of Comment)
    HashMap<String, Integer> metricsCLOC = new HashMap<String, Integer>();
    // metrics - NCLOC (Lines of Non-Comment)
    HashMap<String, Integer> metricsNCLOC = new HashMap<String, Integer>();
    // metrics - VG (McCabe Cyclomatic Complexity)
    HashMap<String, Integer> metricsVG = new HashMap<String, Integer>();
    // metrics - WMC (Weighted Methods per Class)
    HashMap<String, Integer> metricsWMC = new HashMap<String, Integer>();

    private CodeMetrics() {
    }

    public static CodeMetrics instance() {
        return theInstance;
    }
 
    public void setSourceFile(String fileName)
    {
        currentFileName = fileName;
        metricsNOC.put(currentFileName, 0);
        metricsNOI.put(currentFileName, 0);
        if(isDebug) System.out.println(fileName);
    }

    public void addClassDeclaration(String className)
    {
        if( currentClassName!=null && !currentClassName.isEmpty() )
        {
            metricsNOM.put(currentClassName, currentFunctionList.size());
            currentFunctionList.clear();
        }
        currentClassName = className;
        if(metricsNOC.containsKey(currentFileName))
        {
            metricsNOC.put(currentFileName, metricsNOC.get(currentFileName)+1);
        }
        else
        {
            metricsNOC.put(currentFileName, 1);
        }
        metricsNOM.put(currentClassName, 0);
        classDeclarationFinished();
        if(isDebug) System.out.println("Class is defined:" + className);
    }

    public void addInterfaceDeclaration(String interfaceName)
    {
        currentInterfaceName = interfaceName;
        if(metricsNOI.containsKey(currentFileName))
        {
            metricsNOI.put(currentFileName, metricsNOI.get(currentFileName)+1);
        }
        else
        {
            metricsNOI.put(currentFileName, 1);
        }
        metricsNOM.put(currentClassName, 0);
        classDeclarationFinished();
        if(isDebug) System.out.println("Interface is defined:" + interfaceName);
    }

    public void addFunctionDeclaration(String functionName)
    {
        currentFunctionName = functionName;
        currentFunctionList.add(functionName);
        functionDeclarationFinished();
        if(isDebug) System.out.println("addFunctionDeclaration : "+currentClassName + "::" + functionName);
    }

    public void addClassAttribute(String type, String name)
    {
        if(isDebug) System.out.println("addClassAttributes: "+type+ "=>" + name);
    }

    public void addFunctionParameter(String type, String name)
    {
        if(isDebug) System.out.println("addFunctionParameter: "+type+ "=>" + name);
    }

    public void addFunctionLocalVariable(String type, String name)
    {
        if(isDebug) System.out.println("addFunctionLocalVariable: "+type+ "=>" + name);
    }

    public void increaseCyclomatic()
    {
        currentCyclomatic ++;
    }

//    private int loc = 0;
    public void addNewLine(int positionInLine)
    {
//        System.out.println("new line added "+ ++loc + " : "+positionInLine);
    }
   
    public void classDeclarationFinished()
    {
        if(isDebug) System.out.println("classDeclarationFinished");
    }

    public void functionDeclarationFinished()
    {
        if(isDebug) System.out.println("functionDeclarationFinished");
    }

    public void functionLocalVariableDeclarationFinished()
    {
        if(isDebug) System.out.println("functionLocalVariableDeclarationFinished");
    }

    public void finish()
    {
        if( currentClassName!=null && !currentClassName.isEmpty() )
        {
            metricsNOM.put(currentClassName, currentFunctionList.size());
        }

        if(isDebug) System.out.println("finish");
    }

    public void computeNonASTMetrics() throws Exception
    {
        computeLineOfCode();
    }

    protected void computeLineOfCode() throws Exception
    {
       try
       {
            // compute loc
            LinesOfCode loc = new LinesOfCode();
            loc.computeFromFile(currentFileName);
            // write to metric hash
            metricsLOC.put(currentFileName, loc.getLOC());
            metricsCLOC.put(currentFileName, loc.getCLOC());
            metricsNCLOC.put(currentFileName, loc.getNCLOC());
        }
        catch (Exception e)
        {
            System.out.println("Exception caught"+e);
            e.printStackTrace();
        }
    }

    public void print()
    {
        System.out.println("file: "+currentFileName);
        System.out.println("NOC="+metricsNOC.get(currentFileName));
        System.out.println("NOI="+metricsNOI.get(currentFileName));
        System.out.println("NOM="+metricsNOM.get(currentClassName));
        System.out.println("VG="+currentCyclomatic);
        System.out.println("LOC="+metricsLOC.get(currentFileName));
        System.out.println("CLOC="+metricsCLOC.get(currentFileName));
        System.out.println("NCLOC="+metricsNCLOC.get(currentFileName));
    }
}
