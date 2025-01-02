package monitoringuiedit.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import monitoringuiedit.infra.AbstractEvent;

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
