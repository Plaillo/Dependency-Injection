package FrameworkBeispiel;

import javax.inject.Inject;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class PersonService {

	@Inject
	Database database;
	
	public void add(Person person) {
		database.persist(person);
	}
	
	public static void main(String[] arguments) {
		Weld weld = new Weld();

		// Bean-Klassen explizit hinzufügen
		weld.addBeanClass(MySqlDatabase.class);
		weld.addBeanClass(PersonService.class);

		try (WeldContainer container = weld.initialize()) {
			// Neue Instanz des PersonService über Weld erzeugen
			PersonService personService = container.select(PersonService.class).get();
			// Testmethode aufrufen
			personService.doSomething();
		}
	}

	private void doSomething() {
		System.out.println(this.database);
	}

}
