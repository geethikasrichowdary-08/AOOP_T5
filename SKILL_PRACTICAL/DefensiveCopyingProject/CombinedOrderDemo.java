
import java.util.*;

public class CombinedOrderDemo {

    record UserId(long value) {}

    record OrderId(long value) {}

    record Item(String name, int quantity) {

        public Item {
            Objects.requireNonNull(name);

            if (name.isBlank() || quantity <= 0) {
                throw new IllegalArgumentException(
                    "Invalid item details"
                );
            }
        }
    }

    record Order(
        OrderId id,
        UserId owner,
        List<Item> items
    ) {
        public Order {
            Objects.requireNonNull(id);
            Objects.requireNonNull(owner);
            Objects.requireNonNull(items);

            items = List.copyOf(items);

            if (items.isEmpty()) {
                throw new IllegalArgumentException(
                    "Order must contain at least one item"
                );
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("COMBINED ORDER DEMO");

        UserId user = new UserId(101);
        OrderId orderId = new OrderId(501);

        List<Item> itemList = new ArrayList<>();

        itemList.add(new Item("Laptop", 1));
        itemList.add(new Item("Mouse", 2));

        Order order = new Order(orderId, user, itemList);

        Map<OrderId, Order> orders = new HashMap<>();
        orders.put(orderId, order);

        System.out.println("\nOrder ID: " + order.id().value());
        System.out.println("User ID: " + order.owner().value());

        System.out.println("\nOrder Items:");

        for (Item item : order.items()) {
            System.out.println(
                item.name() + " - Quantity: " + item.quantity()
            );
        }

        System.out.println("\nTotal Orders: " + orders.size());

        System.out.println("Original list size: " + itemList.size());

        itemList.add(new Item("Keyboard", 1));

        System.out.println("Modified original list size: " + itemList.size());

        System.out.println(
            "Stored order item count: " + order.items().size()
        );

        System.out.println("\nAll four concepts demonstrated successfully.");
    }
}
