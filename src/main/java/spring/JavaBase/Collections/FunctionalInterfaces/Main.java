package spring.JavaBase.Collections.FunctionalInterfaces;

import java.util.function.Function;
import java.util.function.Predicate;

class Main {

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {

        return s -> condition.test(s) ? ifFalse.apply(s) : ifTrue.apply(s);

    }
}
