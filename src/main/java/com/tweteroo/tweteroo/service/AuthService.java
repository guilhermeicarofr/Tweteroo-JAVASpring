package com.tweteroo.tweteroo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweteroo.tweteroo.dto.UserDTO;
import com.tweteroo.tweteroo.model.User;
import com.tweteroo.tweteroo.repository.UserRepository;

@Service
public class AuthService {
  @Autowired
  private UserRepository repository;

  public void signUp(UserDTO user) {
    repository.save(new User(user));
  }
}
