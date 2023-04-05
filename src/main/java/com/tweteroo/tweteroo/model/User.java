package com.tweteroo.tweteroo.model;

import com.tweteroo.tweteroo.dto.UserDTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class User {
  public User() {}
 
  public User(UserDTO user) {
    this.username = user.username();
    this.avatar = user.avatar();
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(nullable = false)
  private String username;

  @Column(nullable = false)
  private String avatar;
}


