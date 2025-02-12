package application.aicomic.mapper;

import application.aicomic.dataAccess.CommentsDTO;
import application.aicomic.dataAccess.CurrentChapterDTO;
import application.aicomic.models.Comments;
import application.aicomic.models.CurrentChapter;

import org.mapstruct.MappingTarget;

@org.mapstruct.Mapper(componentModel = "spring")
public interface Mapper {
    CurrentChapter toCurrentChapter(CurrentChapterDTO currentChapterDTO);
    void updateCurrentChapter(@MappingTarget CurrentChapter currentChapters, CurrentChapterDTO currentChapterDTO);
    Comments toComments(CommentsDTO commentsDTO);
    void updateComments(@MappingTarget Comments comments, CommentsDTO commentsDTO);
}
