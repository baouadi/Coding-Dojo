package com.fullspring.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import com.fullspring.models.LoginUser;
import com.fullspring.models.User;
import com.fullspring.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    
    public User getUserById(Long id) {
    	Optional<User> potentialUser = userRepository.findById(id);
    	if(potentialUser.isPresent()) {
    		return potentialUser.get();
    	}
    	return null;
    }

    public User register(User newUser, String confirmPassword, BindingResult result) {
        Optional<User> existingUser = userRepository.findByEmail(newUser.getEmail());
        if (existingUser.isPresent()) {
            result.rejectValue("email", "error.user", "Email is already registered");
            return null;
        }
        if (!newUser.getPassword().equals(confirmPassword)) {
            result.rejectValue("confirmPassword", "error.user", "Passwords do not match");
            return null;
        }
        if (!result.hasErrors()) {
            String hashedPassword = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
            newUser.setPassword(hashedPassword);
            return userRepository.save(newUser);
        } else {
            return null;
        }
    }

    public User login(LoginUser newLoginObject, BindingResult result) {
        Optional<User> potentialUser = userRepository.findByEmail(newLoginObject.getEmail());
        if (!potentialUser.isPresent()) {
            result.rejectValue("email", "error.user", "User not found");
            return null;
        }

        User user = potentialUser.get();
        
        if (!BCrypt.checkpw(newLoginObject.getPassword(), user.getPassword())) {
            result.rejectValue("password", "error.user", "Invalid password");
            return null;
        }
        if (!result.hasErrors()) {
            return user;
        } else {
            return null;
        }
    }


}
