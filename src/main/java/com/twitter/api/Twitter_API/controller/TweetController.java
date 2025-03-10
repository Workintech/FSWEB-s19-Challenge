package com.twitter.api.Twitter_API.controller;

import com.twitter.api.Twitter_API.dto.TweetResponse;
import com.twitter.api.Twitter_API.entity.Tweet;
import com.twitter.api.Twitter_API.service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tweet")
public class TweetController {
    private TweetService tweetService;

    @Autowired
    public TweetController(TweetService tweetService) {
        this.tweetService = tweetService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TweetResponse save(@RequestBody Tweet tweet){
        Tweet savedTweet = tweetService.save(tweet);

        tweetService.save(savedTweet);
        return new TweetResponse(savedTweet.getContent(), savedTweet.getCreatedAt());
    }

    @GetMapping("/{userId}")
    public List<TweetResponse> findByUserId(@PathVariable("userId") Long id){
        List<Tweet> tweets = tweetService.findByUserId(id);
        return tweets.stream().map(tweet -> new TweetResponse(tweet.getContent(), tweet.getCreatedAt())).toList();
    }
}
