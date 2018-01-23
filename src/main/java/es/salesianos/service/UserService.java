package es.salesianos.service;

import javax.servlet.http.HttpServletRequest;

import es.salesianos.assembler.UserAssembler;
import es.salesianos.model.User;
import es.salesianos.repository.UserRepository;

public class UserService implements Service {

	private UserAssembler assembler = new UserAssembler();

	private UserRepository repository = new UserRepository();

	public User createNewUserFromRequest(HttpServletRequest req) {
		User user = assembler.createUserFromRequest(req);
		return user;
	}

	public void insertUser(User user) {
			repository.insert(user);
	}

}
