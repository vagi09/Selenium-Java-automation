package jsonfilereader;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadingJSONfile {

	public static void main(String[] args) throws IOException, ParseException {

		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(".\\Jsonfiles\\emloyee.json");

		Object obj = jsonparser.parse(reader); // Object obj is normal java object to be converted in to JSON object.
		JSONObject empjsonobj = (JSONObject) obj; // java obj to json obj, type casting

		String fname = (String) empjsonobj.get("firstName");
		String lname = (String) empjsonobj.get("lastName");

		System.out.println("First Name: " + fname); // direct keys can be accessed easily
		System.out.println("Last Name: " + lname); // direct keys can be accessed easily

		// address is JSON array. extract whole array and access one by one

		JSONArray array = (JSONArray) empjsonobj.get("address");
		for (int i = 0; i < array.size(); i++) { //iterating the jason array.

			JSONObject address = (JSONObject) array.get(i);
			String street = (String) address.get("street");
			String city = (String) address.get("city");
			String state = (String) address.get("state");

			System.out.println("Address of " + i + "is.......");
			System.out.println("street: " + street);
			System.out.println("city: " + city);
			System.out.println("state: " + state);
		}

	}

}
