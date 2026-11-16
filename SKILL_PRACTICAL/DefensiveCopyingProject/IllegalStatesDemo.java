
package DefensiveCopyingProject;

import java.time.Instant;

public class IllegalStatesDemo {

    sealed interface Payment
        permits Pending, Paid, Failed {}

    record Pending(int id, double amount)
        implements Payment {}

    record Paid(int id, double amount, Instant paidAt)
        implements Payment {}

    record Failed(int id, double amount, String reason)
        implements Payment {}

    static String describe(Payment payment) {

        if (payment instanceof Pending) {
            return "Payment is waiting.";
        }

        if (payment instanceof Paid p) {
            return "Payment completed at: " + p.paidAt();
        }

        if (payment instanceof Failed f) {
            return "Payment failed: " + f.reason();
        }

        throw new IllegalStateException("Unknown payment state");
    }

    public static void main(String[] args) {

        System.out.println("ILLEGAL STATES DEMO");

        Payment p1 = new Pending(101, 5000);
        Payment p2 = new Paid(102, 2500, Instant.now());
        Payment p3 = new Failed(103, 1000, "Insufficient balance");

        System.out.println("\nPayment 1: " + describe(p1));
        System.out.println("Payment 2: " + describe(p2));
        System.out.println("Payment 3: " + describe(p3));
    }
}
