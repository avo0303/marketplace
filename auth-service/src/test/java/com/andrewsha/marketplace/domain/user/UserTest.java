package com.andrewsha.marketplace.domain.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.andrewsha.marketplace.user.UserService;

@SpringBootTest
public class UserTest {
	@Autowired
	private UserService service;
}