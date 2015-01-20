import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;


public class StreamReadWrite {

	private static void cleanBuffer(byte[] buffer, int numRead)
	{
		for (int i=0; i<buffer.length; i++)
		{
			buffer[i] = 0;
		}
	}
	
	public static void main(String[] args) {
		
		FileInputStream fs = null;
		Reader is;
		byte[] inputBuffer = new byte[10];
		OutputStream os = new DataOutputStream(System.out);
		StringBuilder outputBuilder = new StringBuilder();
		FileOutputStream ofs;
		
		try {
			fs = new FileInputStream("./Folder/Input.txt");
			is = new InputStreamReader(fs);
			BufferedReader bs = new BufferedReader(is);
			ofs = new FileOutputStream("./Folder/Input.txt",true);
			os = new DataOutputStream(ofs);
			int numRead = 0;
			String lineString = "";
			while((lineString = bs.readLine()) != null)
			{
				outputBuilder.append(lineString).append("\n");
			}
			os.write(outputBuilder.toString().getBytes());
			System.out.println("Reading over.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
