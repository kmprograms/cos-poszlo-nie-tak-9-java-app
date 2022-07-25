import java.math.BigDecimal;
import java.util.Objects;

public class Order {
    private final Product product;
    private final int quantity;

    public Order(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public BigDecimal totalPrice() {
        return product.totalPrice().multiply(BigDecimal.valueOf(quantity));
    }

    @Override
    public String toString() {
        return "%s Quantity: %d". formatted(product.toString(), quantity);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return quantity == order.quantity && Objects.equals(product, order.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, quantity);
    }
}
