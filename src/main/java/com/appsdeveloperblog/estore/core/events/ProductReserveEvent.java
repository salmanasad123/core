package com.appsdeveloperblog.estore.core.events;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductReserveEvent {

    private final String productId;
    private final String orderId;
    private final Integer quantity;
    private final String userId;
}
