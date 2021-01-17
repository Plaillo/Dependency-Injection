package FrameworkBeispiel;



import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.jupiter.api.Test;

class FrameworkTest {


	@Test
	void test() {

		
		Weld weld = new Weld();
		
		// Bean-Klassen explizit hinzufügen
		weld.addBeanClass(MockDatabase.class);
		weld.addBeanClass(PersonService.class);
		
		WeldContainer container = weld.initialize();
			PersonService personService = container.select(PersonService.class).get();
			
			assertEquals(MockDatabase.class, personService.database.getClass());
			
			
			
		
	}

}
