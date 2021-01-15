package DImitDatabase_3;

import DImitDatabase_4.IoC.Database;

/**
 * Abstract(Good) Example
 */
public class IoC {

	public static void main(String[] args) {
		IoC container = new IoC();
		User user = container.new User(container.new OracleDatabase());
		user.add("Irgendwelche Daten");

	}

	public class User {
		// �nderung 1 - Abstraktion MySqlDatabase -> Database
		Database database;

		// �nderung 2 - Abstraktion MySqlDatabase -> Database
		public User(Database database) {
			this.database = database;
		}

		public void add(String data) {
			database.persist(data);
		}
	}

	// �nderung 3 - Implementierung Database
	/**
	 * 
	 * @author NiK
	 *
	 */
	public class MySqlDatabase implements Database{

		public void persist(String data) {
			System.out.println("MySql h�lt bereit: " + data);
		}
	}
	
	public class OracleDatabase implements Database {

		@Override
		public void persist(String data) {
			System.out.println("Oracle h�lt bereit: " + data);

		}
	}
	
	// �nderung 4 - Erstellung eines Interface Database
	public interface Database {

		void persist(String data);
	}

}
