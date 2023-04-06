package com.appsdeveloperblog.estore.core.commands;
import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

// this command will be handled by the aggregate class of the products service
@Data
@Builder
public class ReserveProductCommand {

    // this annotation will help axon framework to find the correct aggregate class.
    @TargetAggregateIdentifier
    private final String productId;
    private final String orderId;
    private final Integer quantity;
    private final String userId;
}
