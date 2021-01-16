package FrameworkBeispiel;

import javax.inject.Inject;

public class User {

	@Inject
	Database database;

	public User(Database database) {
		this.database = database;
	}

	public void add(Person data) {
		database.persist(data);
	}
}
