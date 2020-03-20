package fluxinputoutput;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestPerson {

	public static void main(String[] args) throws IOException {
		List<Person> listOfPersons = new ArrayList<Person>();
		Person p1 = new Person("Stefan", "Andrei", 1994, false, 1000);
		Person p2 = new Person("Serbanescu", "Andrei", 1994, true, 1000);
		listOfPersons.add(p1);
		listOfPersons.add(p2);
		Person.writeToBinaryFile(listOfPersons);
		
		
	}

}
