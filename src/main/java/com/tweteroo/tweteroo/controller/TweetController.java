package com.tweteroo.tweteroo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.tweteroo.dto.TweetDTO;
import com.tweteroo.tweteroo.model.Tweet;
import com.tweteroo.tweteroo.service.TweetService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/tweets")
public class TweetController {
  @Autowired
  private TweetService service;

  @PostMapping
  public String postTweet(@RequestBody @Valid TweetDTO body) {
    service.create(body);
    return("OK");
  }

  @GetMapping
  public List<Tweet> getTweets(@RequestParam("page") String page) {
    return service.getTweetsPage(Integer.parseInt(page));
  }
}
