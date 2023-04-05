package com.tweteroo.tweteroo.model;

import com.tweteroo.tweteroo.dto.TweetDTO;

public class Tweet extends User {
  private String text;

  public Tweet(TweetDTO tweet) {
    this.text = tweet.text();
    super.setTweetUser(tweet);
  }
}
