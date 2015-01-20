import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Reader;

import javax.swing.JFileChooser;


public class ReadingAndWriting {
	
	private static void cleanBuffer(byte[] buffer, int numRead)
	{
		for (int i=0; i<buffer.length; i++)
		{
			buffer[i] = 0;
		}
	}
	
	public static void main(String[] args) {
		
		JFileChooser filePicker = new JFileChooser();
		File f = new File("");
		filePicker.setCurrentDirectory(new File(System.getProperty("user.home")+"/Documents/workspace"));
		int open = filePicker.showOpenDialog(filePicker);
		while (open != filePicker.APPROVE_OPTION)
		{
			filePicker.showOpenDialog(filePicker);
		}
		filePicker.showSaveDialog(filePicker);
		String pickerFile = filePicker.getSelectedFile().getAbsolutePath();
		Reader is;
		FileInputStream fs = null;
		
		byte[] inputBuffer = new byte[10];
		
		FileOutputStream ofs;
		
		
	}

}
