package monitoringuiedit.infra;

import java.util.List;
import monitoringuiedit.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "orderHistories",
    path = "orderHistories"
)
public interface OrderHistoryRepository
    extends PagingAndSortingRepository<OrderHistory, Long> {
    List<OrderHistory> findByOrderId(String orderId);

    void deleteByRiderId(String riderId);
}
