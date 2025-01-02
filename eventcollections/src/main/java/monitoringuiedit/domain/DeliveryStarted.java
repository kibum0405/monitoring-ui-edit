package monitoringuiedit.domain;

import java.util.*;
import lombok.*;
import monitoringuiedit.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String userId;
    private String receiverAddr;
    private String riderId;
    private String status;
}
//>>> DDD / Domain Event
