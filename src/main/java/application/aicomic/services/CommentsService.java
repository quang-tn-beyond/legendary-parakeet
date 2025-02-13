package application.aicomic.services;

import application.aicomic.dataAccess.CommentsDTO;
import application.aicomic.enums.CommentsEnums;
import application.aicomic.mapper.Mapper;
import application.aicomic.models.Comments;
import application.aicomic.repositories.CommentsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentsService {
    private CommentsRepository commentsRepository;
    private Mapper mapper;
    public List<Comments> getAllComments() {
        return commentsRepository.findAll();
    }

    public Comments getCommentById(String id) {
        return commentsRepository.findById(id).get();
    }

    public Comments addComment(Comments comment) {
        return commentsRepository.save(comment);
    }

    public Comments updateComment(String id, CommentsDTO commentsDTO) {
        Comments comments = commentsRepository.findById(id).orElseThrow(() -> new RuntimeException("Comment not found"));
        mapper.updateComments(comments, commentsDTO);
        return commentsRepository.save(comments);
    }

    public Comments deleteComment(String id) {
        //productsRepository.deleteById(id);
        Optional<Comments> comments = commentsRepository.findById(id);
        if (comments.isPresent()) {
            Comments x = comments.get();
            x.setStatus(CommentsEnums.AVAILABLE.getValue());
            return commentsRepository.save(x);
        }
        return null;
    }
}
