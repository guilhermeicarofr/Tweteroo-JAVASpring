package com.tweteroo.tweteroo.repository;

import java.util.ArrayList;
import java.util.List;

import com.tweteroo.tweteroo.model.Tweet;

public class TweetRepository {
  private List<Tweet> tweets = new ArrayList<>();

  public void save(Tweet tweet) {
    tweets.add(tweet);
  }
}
