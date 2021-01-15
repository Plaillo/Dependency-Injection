package DImitDatabase_2;

import DImitDatabase_4.IoC.Database;

/**
 * Concrete(Bad) Example
 */
public class IoC {

	public static void main(String[] args) {
		IoC container = new IoC();
		// Oracle Datenbank kann nicht benutzt werden, weil die Instanz hart vercodet
		// ist
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
	public class OracleDatabase implements Database {

		@Override
		public void persist(String data) {
			System.out.println("Oracle hält bereit: " + data);

		}

	}

}
