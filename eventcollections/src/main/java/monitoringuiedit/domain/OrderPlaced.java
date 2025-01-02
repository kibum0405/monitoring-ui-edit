package monitoringuiedit.domain;

import java.util.*;
import lombok.*;
import monitoringuiedit.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String userId;
    private String storeId;
    private Integer totalAmount;
    private Address address;
    private List<OrderItem> orderItems;
    private Status status;
}
//>>> DDD / Domain Event
