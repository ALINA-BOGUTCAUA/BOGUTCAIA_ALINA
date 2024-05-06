package homework_nr_12;

import java.util.function.Function;
import java.util.function.Predicate;

public enum CheckInteger {
    CHECK_IF_ODD((e)->{return e%2==1;} ),
    CHECK_IF_EVEN((e)->{return e%2==0;}),
    CHECK_IF_NEGATIVE((e)->{return e<0;}),
    CHECK_IF_POSITIVE((e)->{return e>=0;});
   public Predicate<Integer> Check;

    CheckInteger(Predicate<Integer> check) {
        Check = check;
    }
}
