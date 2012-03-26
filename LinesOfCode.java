/**
 * @author fengzhang
 * 
 */

import java.util.Arrays;
import java.util.List;

public class LinesOfCode
{
	// Lines of code
	private int LOC;

	// Lines of code that are comments or just blank lines
	private int CLOC;

	// Lines of code that contain executable source statements
	private int NCLOC;

	/**
	 * @return the LOC
	 */
	public int getLOC()
	{
		return this.LOC;
	}

	/**
	 * @return the CLOC
	 */
	public int getCLOC()
	{
		return this.CLOC;
	}

	/**
	 * @return the NCLOC
	 */
	public int getNCLOC()
	{
		return this.NCLOC;
	}
	
	public void computeFromFile(String javaFilePath) throws Exception
	{
		String sourceCodeText = FileOperator.readFile(javaFilePath);
		
		this.computeFromString(sourceCodeText);
//                System.out.println("source="+sourceCodeText);
	}
	
	public void computeFromString(String sourceCodeText) throws Exception
	{
		int codeLine = 0;
		int commentLine = 0;
		int emptyLine = 0;

		boolean bCommentMode = false;
		String[] linesStringArray = sourceCodeText.split("\n");
		List<String> lines = Arrays.asList(linesStringArray);
		int nbLines = lines.size();
		for(int i=0; i<nbLines; i++)
		{
			String trimmed = lines.get(i).trim();
			if (trimmed.length() == 0)
			{
				emptyLine++;
//				System.out.println("empty line");
			}
			else
			{
//				System.out.println("nonempty line "+trimmed);
				if (trimmed.startsWith("/*"))
				{
					bCommentMode = true;
					commentLine ++;
				}
				else if (trimmed.indexOf("/*") != -1)
				{
					bCommentMode = true;
					codeLine ++;
				}
				else if (trimmed.endsWith("*/"))
				{
					bCommentMode = false;
					commentLine ++;
				}
				else if (trimmed.indexOf("*/") != -1)
				{
					bCommentMode = false;
					codeLine ++;
				}
				else if (trimmed.startsWith("//"))
				{
					commentLine ++;
				}
				else if (bCommentMode)
				{
					commentLine ++;
				}
				else
				{
					codeLine ++;
				}
			}
		}

		this.NCLOC = codeLine;
		this.CLOC = commentLine + emptyLine;
		this.LOC = this.NCLOC + this.CLOC;

//		System.out.println("NCLOC=" + this.NCLOC);
//		System.out.println("CLOC=" + this.CLOC);
//		System.out.println("LOC=" + this.LOC);
	}
}

