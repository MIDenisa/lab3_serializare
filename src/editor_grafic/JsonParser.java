package editor_grafic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import editor_grafic.Circle;

public class JsonParser {

	public static void scriere_json_cercuri(int nr_cercuri, Circle cercuri[])
	{
		Gson gson=new GsonBuilder().setPrettyPrinting().create();
		
		try(FileWriter file=new FileWriter("json/cercuri.json")){
			gson.toJson(cercuri,file);
		}
		
		catch(JsonIOException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static Circle[] citire_json_nr_cercuri() {
		Gson gson=new Gson();
		Circle[] cercuri=new Circle[0];
		try(FileReader file=new FileReader("json/cercuri.json"))
		{
			cercuri=new Gson().fromJson(file,Circle[].class);
	        /*System.out.println(Circle[0].width);*/
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e1)
		{
			e1.printStackTrace();
		}
		return cercuri;
	}

}
