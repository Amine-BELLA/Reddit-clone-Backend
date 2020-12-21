package reddit.clone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import reddit.clone.model.Comment;
import reddit.clone.model.Post;
import reddit.clone.model.User;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}