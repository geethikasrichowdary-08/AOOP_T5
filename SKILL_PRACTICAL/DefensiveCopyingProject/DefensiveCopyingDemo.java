
package DefensiveCopyingProject;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class DefensiveCopyingDemo {

    static class Period {
        private final Date start;
        private final Date end;

        public Period(Date start, Date end) {
            if (start == null || end == null) {
                throw new IllegalArgumentException("Dates cannot be null");
            }

            this.start = new Date(start.getTime());
            this.end = new Date(end.getTime());

            if (this.start.after(this.end)) {
                throw new IllegalArgumentException(
                    "Start date must be before end date"
                );
            }
        }

        public Date start() {
            return new Date(start.getTime());
        }

        public Date end() {
            return new Date(end.getTime());
        }
    }

    public static void main(String[] args) {

        System.out.println("DEFENSIVE COPYING DEMO");

        Date start = new Date(1000000);
        Date end = new Date(2000000);

        Period period = new Period(start, end);

        System.out.println("Before modification:");
        System.out.println("Start: " + period.start());
        System.out.println("End: " + period.end());

        end.setTime(500000);

        System.out.println("\nAfter modification:");
        System.out.println("Start: " + period.start());
        System.out.println("End: " + period.end());

        List<String> products =
            Collections.unmodifiableList(
                Arrays.asList("Laptop", "Mouse", "Keyboard")
            );

        System.out.println("\nImmutable collection:");
        System.out.println(products);

        System.out.println("\nDefensive copying completed.");
    }
}
