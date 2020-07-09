package com.test.istio.service;

import java.util.List;

import com.test.istio.model.User;

public class UserService {

	private List<User> users;

	public List<User> getUsers() {
		users.add(new User("Carlos"));
		return users;
	}

}
