package com.tweteroo.tweteroo.model;

import com.tweteroo.tweteroo.dto.TweetDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Tweet {
  public Tweet() {}
 
  public Tweet(TweetDTO tweet) {
    this.username = tweet.username();
    this.text = tweet.text();
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(nullable = false)
  private String username;

  @Column(nullable = false)
  private String text;
}
