package tech.buildrun.btgpactual.orderms.listener.dto;

import java.math.BigDecimal;

public record OrdemItemEvent(String produto,
                             Integer quantidade,
                             BigDecimal preco) {
}
