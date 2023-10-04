package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.entity.User;

public class UserDao {

	private SessionFactory factory;

	public UserDao(SessionFactory factory) {
		super();
		this.factory = factory;
	}

	// Getting Details by email and password
	public User getDetailByEmailAndPassword(String email, String password) {
		User user = null;

		try {
			String query = "From User Where emial = :e and password =:password";

			Session session = factory.openSession();
			Query<User> hibQuery = session.createQuery(query, User.class);
			hibQuery.setParameter("e", email);
			hibQuery.setParameter("p", password);

			user = (User) hibQuery.uniqueResult();
			return user;

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return user;

	}

}
