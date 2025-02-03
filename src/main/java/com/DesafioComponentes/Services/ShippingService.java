package com.DesafioComponentes.Services;

import com.DesafioComponentes.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        double freight = 0;

        if (order.getBasic() < 100) {
            freight = 20;
        } else if (order.getBasic() >= 100 && order.getBasic() < 200) {
            freight = 12;
        } else {
            freight = 0;
        }
        return freight;
    }
}
