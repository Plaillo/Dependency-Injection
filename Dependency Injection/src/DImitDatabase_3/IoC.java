package DImitDatabase_3;

public class IoC {

	public static void main(String[] args) {
		IoC container = new IoC();
		User user = container.new User(container.new MySqlDatabase());
		user.add("This is some data");

	}

	public class User {
		// Änderung 1 - Abstraktion MySqlDatabase -> Database
		Database database;

		// Änderung 2 - Abstraktion MySqlDatabase -> Database
		public User(Database database) {
			this.database = database;
		}

		public void add(String data) {
			database.persist(data);
		}
	}

	// Änderung 3 - Implementierung Database
	public class MySqlDatabase implements Database{

		public void persist(String data) {
			System.out.println("Mysql has persisted: " + data);
		}
	}
	
	// Änderung 4 - Implementierung Interface Database
	public interface Database {

		void persist(String data);
	}

}
