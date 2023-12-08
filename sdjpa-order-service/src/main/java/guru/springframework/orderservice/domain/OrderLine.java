package guru.springframework.orderservice.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@Entity
public class OrderLine extends BaseEntity{

    private Integer quantityOrdered;

    @ManyToOne
    private OrderHeader orderHeader;

    @ManyToOne
    private Product product;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        OrderLine orderLine = (OrderLine) o;

        return Objects.equals(quantityOrdered, orderLine.quantityOrdered);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (quantityOrdered != null ? quantityOrdered.hashCode() : 0);
        return result;
    }
}
