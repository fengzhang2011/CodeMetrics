/**
 * @author fengzhang
 *
 */

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class FileOperator
{

	public static String readFile(String fileName) throws IOException
	{
            String sourceText = null;
            try
            {
		FileInputStream fin = new FileInputStream(fileName);
		FileChannel fch = fin.getChannel();
		// map the contents of the file into ByteBuffer
		ByteBuffer byteBuff = fch.map(FileChannel.MapMode.READ_ONLY, 0, fch.size());
		// convert ByteBuffer to CharBuffer
		CharBuffer chBuff = Charset.defaultCharset().decode(byteBuff);

		sourceText = chBuff.toString();
             }
             catch(IOException e)
             {
                 System.out.println("IOException"+e);
                 e.printStackTrace();
             }
	
             return sourceText;	
	}
}
