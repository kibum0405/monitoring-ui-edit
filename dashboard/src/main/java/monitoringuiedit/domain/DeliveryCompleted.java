package monitoringuiedit.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import monitoringuiedit.infra.AbstractEvent;

@Data
public class DeliveryCompleted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String userId;
    private String receiverAddr;
    private String riderId;
    private String status;
}
