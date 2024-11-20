package com.yurivasques.desafio.entities;

import com.yurivasques.desafio.services.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order){

        double discount = order.getDiscount() / 100.0;
        double totalPriceDiscount = order.getBasic() - (order.getBasic() * discount);

        return totalPriceDiscount + ShippingService.shipment(order);

    }

}
