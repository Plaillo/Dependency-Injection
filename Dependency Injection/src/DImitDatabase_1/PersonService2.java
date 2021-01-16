package DImitDatabase_1;

/**
 * Concrete(Bad) Example
 */
public class PersonService2 {

	public static void main(String[] args) {
		PersonService2 container = new PersonService2();
		// Oracle Datenbank kann nicht benutzt werden, weil die Instanz hart vercodet
		User user = container.new User(container.new MySqlDatabase());
		user.add("Irgendwelche Daten");

	}

	/**
	 * Business Layer Logic
	 */
	public class User {
		MySqlDatabase database;

		public User(MySqlDatabase database) {
			this.database = database;
		}

		public void add(String data) {
			database.persist(data);
		}
	}

	/**
	 * Database Access Layer
	 */
	public class MySqlDatabase {

		public void persist(String data) {
			System.out.println("MySql hält bereit: " + data);
		}
	}

	// Kunde will Oracle Datenbank
	public class OracleDatabase {

		public void persist(String data) {
			System.out.println("Oracle hält bereit: " + data);

		}

	}

}
