package main;

/** Simple runner class to operate the system */
public class Runner {

	public Runner() {

	}

	public static void main(String[] args) {
		Reader read = new Reader();
		Storer store = new Storer();

		store.parseArrayAndStore(read.readAndParse("people.json"));
		store.display();
	}

}
