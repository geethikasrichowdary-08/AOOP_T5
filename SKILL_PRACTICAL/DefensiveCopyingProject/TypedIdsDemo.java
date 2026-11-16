
package DefensiveCopyingProject;

import java.util.Objects;
import java.util.UUID;

public class TypedIdsDemo {

    record UserId(long value) {}

    record OrderId(UUID value) {
        public OrderId {
            Objects.requireNonNull(value);
        }

        public static OrderId random() {
            return new OrderId(UUID.randomUUID());
        }
    }

    static String findOrder(UserId userId, OrderId orderId) {
        return "Order found for User ID: " + userId.value()
            + "\nOrder ID: " + orderId.value();
    }

    public static void main(String[] args) {

        System.out.println("TYPED IDS DEMO");

        UserId user = new UserId(101);
        OrderId order = OrderId.random();

        System.out.println("User ID: " + user.value());
        System.out.println("Order ID: " + order.value());

        System.out.println("\n" + findOrder(user, order));

        System.out.println("\nTyped IDs prevent ID mixing.");
    }
}
