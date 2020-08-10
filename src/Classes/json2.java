package Classes;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class json2 {

	public static void main(String[] args) throws IOException, ParseException {
	
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader("TestData.json");
		//Read JSON file
		            Object obj = jsonParser.parse(reader);
		            JSONArray usersList = (JSONArray) obj;
		            System.out.println("Users List-> "+usersList); //This prints the entire json file
		            for(int i=0;i<usersList.size();i++) 
		            {
		            //JSONObject users = (JSONObject) usersList.get(i);
		           // System.out.println("Users -> "+users);//This prints every block - one json object
		            //JSONObject user = (JSONObject) users.get("users");
		           // System.out.println("User -> "+user); //This prints each data in the block
		          //  String username = (String) user.get("username");
		            //.username.String password = (String) user.get("password");
		            //System.out.println("The username in JSON is: "+username);
		              //System.out.println("The password in JSON is: "+password);
		            }
		
	}
	}


