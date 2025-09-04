package com.reactspring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reactspring.Dao.UserDaoRepo;
import com.reactspring.Model.UserDao;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class MainController {

	@Autowired
	UserDaoRepo userDaoRepo;

	static class LoginRequest {
		public String username;
		public String password;
	}

	@PostMapping("/login")
	public String login(@RequestBody UserDao udd) {

		UserDao byUsername = userDaoRepo.findByUsername(udd.getUsername());
		if (byUsername == null) {
			return "this id is not exist";
		}
		if (byUsername.getPassword().equals(udd.getPassword())) {
			return "successfull";
		} else {

			return "invalid credentials";
		}

	}

	@PostMapping("/test/{username}")
	public String test(Model model, @PathVariable String username, @RequestBody UserDao ud) {

		UserDao save = userDaoRepo.save(ud);
		return "successfully resistered";
	}
}
