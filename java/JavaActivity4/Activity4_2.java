package JavaActivity_4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class Activity4_2 {
	public static void main(String[] args) throws IOException
	{
		File file = new File("src/newfile.txt");
        
		if (file.exists())
		{
			System.out.println("The file "+ file.getName() + " already exists");
		}
		else
		{
		file.createNewFile();
		System.out.println("The file "+ file.getName() + " is created");
		}
	    
		FileWriter myWriter = new FileWriter(file);
	    myWriter.write("File Created and write performed");
	    myWriter.close();
		
	    File read = FileUtils.getFile(file);
        System.out.println("Content of the file: " + FileUtils.readFileToString(read, "UTF8"));
        
        File dir = new File("src/Testdirectory");
        FileUtils.copyFileToDirectory(file, dir);

        File newFile = FileUtils.getFile(dir, "newfile.txt");
        String newread = FileUtils.readFileToString(newFile, "UTF8");
        System.out.println("Content of the file from the new Directory: " + newread);
	}
}
