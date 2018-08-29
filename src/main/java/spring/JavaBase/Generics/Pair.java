package spring.JavaBase.Generics;

import java.util.Objects;

class Pair <T, S> {

    private final T value1;
    private final S value2;

    private Pair(T value1, S value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

      static <T, S> Pair of(T value1, S value2) {
        return new Pair<>(value1, value2);
    }

    T getFirst() {
        return value1;
    }

    S getSecond() {
        return value2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair))
            return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(value1, pair.value1) && Objects.equals(value2, pair.value2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value1, value2);
    }
}