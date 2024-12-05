package com.sellopy.service;

import com.sellopy.entity.User;

public interface UserService {
	
	public User saveUser(User user);
	
	public boolean existEmailCheck(String email);

//	public boolean existPasswordCheck(String password);
}
