package monitoringuiedit.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import monitoringuiedit.domain.*;
import monitoringuiedit.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
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

    public CookStarted(OrderMgmt aggregate) {
        super(aggregate);
    }

    public CookStarted() {
        super();
    }
}
//>>> DDD / Domain Event