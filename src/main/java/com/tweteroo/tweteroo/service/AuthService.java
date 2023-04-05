package com.tweteroo.tweteroo.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tweteroo.tweteroo.TweterooApplication;
import com.tweteroo.tweteroo.dto.UserDTO;
import com.tweteroo.tweteroo.model.User;

@Service
public class AuthService {  
  public void signUp(UserDTO user) {
    TweterooApplication.userRepository.save(new User(user));
  }

  public String getUserAvatar(String username) {
    Optional<User> user = TweterooApplication.userRepository.findByUsername(username);
    return user.get().getAvatar();
  }
}
