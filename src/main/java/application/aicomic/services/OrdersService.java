package application.aicomic.services;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import application.aicomic.dataAccess.OrdersDTO;
import application.aicomic.dataAccess.OrdersServiceResponseDTO;
import application.aicomic.enums.OrdersEnums;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import application.aicomic.models.Orders;
import application.aicomic.repositories.OrdersRepository;
import application.aicomic.mapper.Mapper;

@Service
public class OrdersService {
    private final OrdersRepository ordersRepository;
    private Mapper mapper;
    private static final Logger logger = LoggerFactory.getLogger(OrdersService.class);

    public OrdersService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    public List<Orders> getAllOrders() {
        return ordersRepository.findAll();
    }

    public Orders getOrdersById(String ordersId) {
        return ordersRepository.findById(ordersId).orElse(null);
    }

    public Orders saveOrders(Orders orders) {
        return ordersRepository.save(orders);
    }

    public OrdersServiceResponseDTO getById(String id) {
        Optional<Orders> ordersOptional = ordersRepository.findById(id);
        if (ordersOptional.isPresent()) {
            Orders orders = ordersOptional.get();
            return new OrdersServiceResponseDTO(true, "Orders found.", Collections.singletonList(orders));
        }
        return new OrdersServiceResponseDTO(false, "No orders found for the given orders ID.", Collections.emptyList());
    }

    public Orders addOrders(Orders orders) {
        return ordersRepository.save(orders);
    }

    public Orders updateOrders(String id, OrdersDTO ordersDTO) {
        Orders orders = ordersRepository.findById(id).orElseThrow(() -> new RuntimeException("Orders not found"));
        mapper.updateOrders(orders, ordersDTO);
        return ordersRepository.save(orders);
    }

    public Orders deleteOrders(String id) {
        Optional<Orders> orders = ordersRepository.findById(id);
        if (orders.isPresent()) {
            Orders x = orders.get();
            x.setOrderStatus(OrdersEnums.PENDING.getValue());
            return ordersRepository.save(x);
        } else if (orders.isPresent()) {
            Orders x = orders.get();
            x.setOrderStatus(OrdersEnums.COMPLETED.getValue());
            return ordersRepository.save(x);
        } else if (orders.isPresent()) {
            Orders x = orders.get();
            x.setOrderStatus(OrdersEnums.CANCEL.getValue());
            return ordersRepository.save(x);
        }
        return null;
    }
}
