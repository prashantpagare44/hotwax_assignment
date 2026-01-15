package com.example.demo.service;

import com.example.demo.entity.OrderHeader;
import com.example.demo.entity.OrderItem;
import com.example.demo.repository.OrderRepository;
import com.example.demo.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    public OrderHeader createOrder(OrderHeader order) {
        return orderRepository.save(order);
    }

    public OrderHeader updateOrder(Integer id, OrderHeader newDetails) {
        OrderHeader existing = getOrderById(id);
        if (newDetails.getOrderDate() != null) {
            existing.setOrderDate(newDetails.getOrderDate());
        }
        return orderRepository.save(existing);
    }

    public OrderHeader getOrderById(Integer id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found with id: " + id));
    }

    public OrderItem addOrderItem(OrderItem item) {
        return orderItemRepository.save(item);
    }

    public OrderItem updateItemStatus(Integer itemId, String status) {
        OrderItem item = orderItemRepository.findById(itemId)
                .orElseThrow(() -> new RuntimeException("Item not found with id: " + itemId));
        if (status != null) {
            item.setStatus(status);
        }
        return orderItemRepository.save(item);
    }

    public void deleteOrder(Integer id) {
        orderRepository.deleteById(id);
    }

    public void deleteOrderItem(Integer itemId) {
        orderItemRepository.deleteById(itemId);
    }

    public List<OrderHeader> getAllOrders() {
        return orderRepository.findAll();
    }
}