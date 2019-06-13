package main;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * A class for reading and then storing data from a JSON Array into a Storage
 * Class
 */
public class Storer {
	// Two Storage Classes, to separate by owner gender
	private Storage maleOwner;
	private Storage femaleOwner;

	public Storer() {
		this.maleOwner = new Storage("Male Owner");
		this.femaleOwner = new Storage("Female Owner");
	}

	/**
	 * Method that attempts to parse the JSON array and store any animals names
	 * found to the relevant Storage class. e.g. male owned cat names go to
	 * maleOwnder Storage Class
	 */
	public void parseArrayAndStore(JSONArray jsonArray) {
		for (Object o : jsonArray) {
			JSONObject person = (JSONObject) o;
			String gender = person.get("gender").toString();
			JSONArray pets = (JSONArray) person.get("pets");
			
			// Try/Catch in case of No pets (NULL)
			try {
				for (Object o2 : pets) {
					JSONObject pet = (JSONObject) o2;
					if (pet.get("type").toString().equals("Cat")) {
						if (gender.equals("Male")) {
							this.maleOwner.addName(pet.get("name").toString());
						} else {
							this.femaleOwner.addName(pet.get("name").toString());
						}
					}
				}
			} catch (NullPointerException ex) {
				// Just gets caught and ignored
			}
		}
	}

	/**
	 * Method that gets the two Storage classes to display their stored names
	 */
	public void display() {
		this.maleOwner.displayNames();
		this.femaleOwner.displayNames();
	}

}
