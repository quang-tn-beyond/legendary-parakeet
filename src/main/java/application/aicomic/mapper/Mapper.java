package application.aicomic.mapper;

import application.aicomic.dataAccess.CommentsDTO;
import application.aicomic.dataAccess.CurrentChapterDTO;
import application.aicomic.dataAccess.OrderDetailsDTO;
import application.aicomic.dataAccess.TransactionsDTO;
import application.aicomic.models.Comments;
import application.aicomic.models.CurrentChapter;
import application.aicomic.models.OrderDetails;
import application.aicomic.models.Transactions;
import org.mapstruct.MappingTarget;

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
}
