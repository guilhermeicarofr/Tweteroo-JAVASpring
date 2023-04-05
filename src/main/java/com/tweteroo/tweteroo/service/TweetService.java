package com.tweteroo.tweteroo.service;

import com.tweteroo.tweteroo.TweterooApplication;
import com.tweteroo.tweteroo.dto.TweetDTO;
import com.tweteroo.tweteroo.model.Tweet;

public class TweetService {
  public void create(TweetDTO tweet) {
    TweterooApplication.tweetRepository.save(new Tweet(tweet));
  }
}
