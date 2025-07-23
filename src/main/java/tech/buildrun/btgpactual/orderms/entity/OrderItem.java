package tech.buildrun.btgpactual.orderms.entity;

import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.math.BigDecimal;

public class OrderItem {
    private String product;
    private Integer quantity;
    private BigDecimal price;

    public OrderItem(String product, Integer quantity, BigDecimal price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public OrderItem() {
    }

    public String getProduct() {
        return product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Field(targetType = FieldType.DECIMAL128)
    public BigDecimal getPrice() {
        return price;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
