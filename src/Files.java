import java.io.File;
import java.io.FilenameFilter;


public class Files {

	public static void main(String[] args) {
		
		File file = new File("/Users/gordansajevic/Documents/workspace/StreamZadaca");
		System.out.println(file.isDirectory());
		File array[] = file.listFiles();
		int i = 0;
		do
		{
			if (array[i].isFile() == true || array[i].isDirectory() == true)
			{
				System.out.println(array[i]);
			}
			i++;
		}while (array[i] != null);
		
	}

}