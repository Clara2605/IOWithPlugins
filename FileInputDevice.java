package fileioplugin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import iowithplugins.abstractions.IInputDevice;

public class FileInputDevice implements IInputDevice {
	
	Scanner consoleScanner;
	FileInputDevice(){
		File myFile = new File("input");
		try {
			myFile.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			 consoleScanner = new Scanner(myFile) ;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	@Override
	public String ReadString() {
	 		return consoleScanner.nextLine();

	}

}
