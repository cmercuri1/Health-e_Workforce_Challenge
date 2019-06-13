package main;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

/**
 * A class for reading in files and returning JSON Arrays containing data from
 * said files
 */
public class Reader {

	public Reader() {

	}

	/**
	 * Method that creates a JSON Array to have the file data read to
	 */
	public JSONArray readAndParse(String fileName) {
		JSONArray temp = new JSONArray();
		temp = this.readFileToArray(fileName, temp);
		return temp;
	}

	/** Method that attempts to read a JSON file to a JSON Array */
	private JSONArray readFileToArray(String fileName, JSONArray jsonArray) {
		JSONParser parser = new JSONParser();

		try {
			jsonArray = (JSONArray) parser.parse(new FileReader(fileName));
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}

		return jsonArray;
	}

}
