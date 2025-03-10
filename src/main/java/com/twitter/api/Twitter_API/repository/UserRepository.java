package com.twitter.api.Twitter_API.repository;
import com.twitter.api.Twitter_API.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
