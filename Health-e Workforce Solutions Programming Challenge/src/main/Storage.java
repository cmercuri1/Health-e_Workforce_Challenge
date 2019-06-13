package main;

import java.util.ArrayList;

/** A storage class for the names of the animals */
public class Storage {
	private String name;
	private ArrayList<String> animalNames;

	/** Storage Class Constructor */
	public Storage(String name) {
		this.name = name;
		this.animalNames = new ArrayList<String>();
	}

	/** Adds a name to the list */
	public void addName(String newName) {
		this.animalNames.add(newName);
	}

	public String getName() {
		return name;
	}

	/**
	 * Prints the stored names out to console. If there are none, then indicates
	 * as such
	 */
	public void displayNames() {
		System.out.println(this.name);
		if (this.animalNames.isEmpty()) {
			System.out.println("No Names");
		} else {
			for (String name : this.animalNames) {
				System.out.println("- " + name);
			}
		}
		System.out.print("\n");
	}
}
