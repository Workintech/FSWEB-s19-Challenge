package com.twitter.api.Twitter_API.repository;

import com.twitter.api.Twitter_API.entity.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
}
