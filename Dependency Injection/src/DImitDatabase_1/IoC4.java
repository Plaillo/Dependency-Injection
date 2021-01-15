package DImitDatabase_1;

import DImitDatabase_1.IoC3.MySqlDatabase;
import DImitDatabase_1.IoC3.User;

/**
 * Spring Framework Example
 */
public class IoC4 {

	/**
	 * XML Configuration
	 * 
	 * <bean id="MySql" class="com.java.MySql"/>
	 * <bean id="Oracle" class="com.java.Oracle"/>
	 * 
	 * --- Initialisierung der User --- 
	 * <bean id="user" class="com.java.user"/>
	 * 		<arg ref="MySql"/> 
	 * 		<arg ref="Oracle"/> 
	 * </bean>
	 */

	public static void main(String[] args) {
		IoC4 container = new IoC4();

		// Spring Notation zur Initialisierung 
		// Abhängigkeiten werden injiziert und / auto-initialisiert durch XML
		
		@Autowired
		User user;

		@Autowired
		User user2;

		@Autowired
		User user3;

		user.add("Irgendwelche Daten");
	}

	/**
	 * Business Layer Logic
	 */
	public class User {
		Database database;

		public User(Database database) {
			this.database = database;
		}

		public void add(String data) {
			database.persist(data);
		}
	}

	public interface Database {

		void persist(String data);
	}

	/**
	 * Database Access Layer
	 */
	public class MySqlDatabase implements Database {

		@Override
		public void persist(String data) {
			System.out.println("MySql hält bereit: " + data);
		}
	}

	public class OracleDatabase implements Database {

		@Override
		public void persist(String data) {
			System.out.println("Oracle hält bereit: " + data);

		}

	}

}
