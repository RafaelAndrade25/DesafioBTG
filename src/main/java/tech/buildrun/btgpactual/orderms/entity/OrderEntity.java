package tech.buildrun.btgpactual.orderms.entity;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.math.BigDecimal;
import java.util.List;

@Document(collection = "tb_orders")
public class OrderEntity {
    @MongoId
    private Long orderId;

    @Indexed(name = "custumer_id_index")
    private Long customerId;

    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal total;
    private List<OrderItem> Items;

    public OrderEntity() {
    }

    public Long getOrderId() {
        return orderId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public List<OrderItem> getItems() {
        return Items;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public void setItems(List<OrderItem> items) {
        Items = items;
    }
}
