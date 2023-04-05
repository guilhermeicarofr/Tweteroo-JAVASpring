package com.tweteroo.tweteroo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tweteroo.tweteroo.repository.TweetRepository;
import com.tweteroo.tweteroo.repository.UserRepository;

@SpringBootApplication
public class TweterooApplication {

	public static final UserRepository userRepository = new UserRepository();
	public static final TweetRepository tweetRepository = new TweetRepository();
	
	public static void main(String[] args) {
		SpringApplication.run(TweterooApplication.class, args);
	}

}
