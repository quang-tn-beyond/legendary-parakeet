package application.aicomic.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.aicomic.services.OrdersService;
import application.aicomic.dataAccess.OrdersDTO;
import application.aicomic.models.Orders;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequestMapping("/orders")
@RestController
public class OrdersController {
    private OrdersService ordersService;

    @GetMapping
    public List<Orders> getAllOrders() {
        return ordersService.getAllOrders();
    }

    @PostMapping
    public Orders getOrdersById(@PathVariable String ordersId) {
        return ordersService.getOrdersById(ordersId);
    }

    @PostMapping("/{create}")
    public Orders createOrders(@RequestBody Orders orders) {
        return ordersService.saveOrders(orders);
    }

    @PutMapping("/{update}")
    public Orders updateOrders(@PathVariable String id, @RequestBody OrdersDTO ordersDTO) {
        return ordersService.updateOrders(id, ordersDTO);
    }

    @DeleteMapping("/{delete}")
    public Orders deleteOrders(@PathVariable String id) {
        return ordersService.deleteOrders(id);
    }
}
