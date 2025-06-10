package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import stmall.infra.AbstractEvent;

@Data
public class ShippingReturned extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String customerId;
    private String itemid;
    private Integer qty;
    private String address;
}
