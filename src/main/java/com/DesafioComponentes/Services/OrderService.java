package com.DesafioComponentes.Services;

import com.DesafioComponentes.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        double total = 0;
        double discount = 0;

        discount = order.getDiscount() * order.getBasic();

        total = (order.getBasic() - discount) + shippingService.shipment(order);
        return total;
    }
}
