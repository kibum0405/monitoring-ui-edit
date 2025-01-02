package monitoringuiedit.domain;

import java.util.*;
import lombok.*;
import monitoringuiedit.domain.*;
import monitoringuiedit.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String userId;
    private String storeId;
    private Integer totalAmount;
    private Object address;
    private Object orderItems;
    private Object status;
}
