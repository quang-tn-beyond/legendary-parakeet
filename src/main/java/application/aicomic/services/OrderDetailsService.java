package application.aicomic.services;

import application.aicomic.dataAccess.CommentsDTO;
import application.aicomic.dataAccess.OrderDetailsDTO;
import application.aicomic.enums.CommentsEnums;
import application.aicomic.mapper.Mapper;
import application.aicomic.models.Comments;
import application.aicomic.models.OrderDetails;
import application.aicomic.repositories.OrderDetailsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderDetailsService {
    private OrderDetailsRepository orderDetailsRepository;
    private Mapper mapper;
    public List<OrderDetails> getAllOrderDetails() {
        return orderDetailsRepository.findAll();
    }

    public OrderDetails getOrderDetailById(String id) {
        return orderDetailsRepository.findById(id).get();
    }

    public OrderDetails addOrderDetail(OrderDetails orderDetail) {
        return orderDetailsRepository.save(orderDetail);
    }

    public OrderDetails updateOrderDetail(String id, OrderDetailsDTO orderDetailsDTO) {
        OrderDetails orderDetails = orderDetailsRepository.findById(id).orElseThrow(() -> new RuntimeException("OrderDetails not found"));
        mapper.updateOrderDetails(orderDetails, orderDetailsDTO);
        return orderDetailsRepository.save(orderDetails);
    }

//    public Comments deleteComment(String id) {
//        Optional<Comments> comments = commentsRepository.findById(id);
//        if (comments.isPresent()) {
//            Comments x = comments.get();
//            x.setStatus(CommentsEnums.AVAILABLE.getValue());
//            return commentsRepository.save(x);
//        }
//        return null;
//    }
}
