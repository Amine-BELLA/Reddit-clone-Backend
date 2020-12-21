package reddit.clone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import reddit.clone.model.Post;
import reddit.clone.model.User;
import reddit.clone.model.Vote;

import java.util.Optional;

public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}