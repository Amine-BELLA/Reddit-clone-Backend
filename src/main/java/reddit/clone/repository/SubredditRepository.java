package reddit.clone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import reddit.clone.model.Subreddit;

import java.util.Optional;

public interface SubredditRepository extends JpaRepository<Subreddit, Long> {
    Optional<Subreddit> findByName(String subredditName);
}