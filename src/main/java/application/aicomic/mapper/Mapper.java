package application.aicomic.mapper;

import org.mapstruct.MappingTarget;

import application.aicomic.dataAccess.CommentsDTO;
import application.aicomic.dataAccess.CurrentChapterDTO;
import application.aicomic.dataAccess.GenresDTO;
import application.aicomic.dataAccess.OrderDetailsDTO;
import application.aicomic.dataAccess.TransactionsDTO;
import application.aicomic.models.Comments;
import application.aicomic.models.CurrentChapter;
import application.aicomic.models.Genres;
import application.aicomic.models.OrderDetails;
import application.aicomic.models.Transactions;

@org.mapstruct.Mapper(componentModel = "spring")
public interface Mapper {
    CurrentChapter toCurrentChapter(CurrentChapterDTO currentChapterDTO);
    void updateCurrentChapter(@MappingTarget CurrentChapter currentChapters, CurrentChapterDTO currentChapterDTO);
    Comments toComments(CommentsDTO commentsDTO);
    void updateComments(@MappingTarget Comments comments, CommentsDTO commentsDTO);
    Transactions toTransactions(TransactionsDTO transactionsDTO);
    void updateTransactions(@MappingTarget Transactions transactions, TransactionsDTO transactionsDTO);
    OrderDetails toOrderDetails(OrderDetailsDTO orderDetailsDTO);
    void updateOrderDetails(@MappingTarget OrderDetails orderDetails, OrderDetailsDTO orderDetailsDTO);
    Genres toGenres(GenresDTO genresDTO);
    void updateGenres(@MappingTarget Genres genres, GenresDTO genresDTO);
}
