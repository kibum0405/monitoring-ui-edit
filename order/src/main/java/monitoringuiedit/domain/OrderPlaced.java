package monitoringuiedit.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import monitoringuiedit.domain.*;
import monitoringuiedit.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String userId;
    private String storeId;
    private Integer totalAmount;
    private Address address;
    private List<OrderItem> orderItems;
    private Status status;

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
//>>> DDD / Domain Event
