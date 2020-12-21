package reddit.clone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import reddit.clone.model.Post;
import reddit.clone.model.Subreddit;
import reddit.clone.model.User;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}