package editor_grafic;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Form {

	public static void main(String[] args) {
		
		Circle cerc=new Circle(5,6);
		try {
			FileOutputStream fileOut=new FileOutputStream("./cerc.ser");
			ObjectOutputStream out=new ObjectOutputStream(fileOut);
			out.writeObject(cerc);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved");
		}catch(IOException i) {
			System.out.println("Serialized data not saved");
			i.printStackTrace();
		}

	}

}
