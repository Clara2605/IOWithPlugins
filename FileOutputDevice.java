package fileioplugin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import iowithplugins.abstractions.IOutputDevice;

public class FileOutputDevice implements IOutputDevice {

	@Override
	public void WriteString(String s) {
		// TODO Auto-generated method stub
		File output = new File ("output");
		try {
			output.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			FileWriter myWriter = new FileWriter (output,true);
			myWriter.write(s+"\n");
			myWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
