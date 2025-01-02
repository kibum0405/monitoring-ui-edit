package monitoringuiedit.domain;

import java.util.*;
import lombok.*;
import monitoringuiedit.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
public class CookStarted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String userId;
    private String storeId;
    private Integer totalAmount;
    private String comment;
    private List<OrderItem> orderItems;
    private Address address;
    private Status status;
}
//>>> DDD / Domain Event
