package com.tweteroo.tweteroo.model;

import org.springframework.beans.factory.annotation.Autowired;

import com.tweteroo.tweteroo.dto.TweetDTO;
import com.tweteroo.tweteroo.dto.UserDTO;
import com.tweteroo.tweteroo.service.AuthService;

public class User {
  @Autowired
  AuthService authService;

  private String username;
  private String avatar;
 
  public User() {}

  public User(UserDTO user) {
    this.username = user.username();
    this.avatar = user.avatar();
  }

  public void setTweetUser(TweetDTO tweet) {
    this.username = tweet.username();
    this.avatar = authService.getUserAvatar(username);
  }

  public String getUsername() {
    return this.username;
  }

  public String getAvatar() {
    return this.avatar;
  }
}
