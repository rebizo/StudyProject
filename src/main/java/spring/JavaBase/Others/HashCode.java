package spring.JavaBase.Others;

import java.util.Objects;

public final class HashCode {

        private static double re;
        private static double im;

        public HashCode (double re, double im) {
            this.re = re;
            this.im = im;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashCode hashCode = (HashCode) o;
        return Double.compare(hashCode.re, re) == 0 && Double.compare(hashCode.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }

    public static class Main {
        public static void main(String[] args) {
            System.out.println(re);
            System.out.println(im);
        }
    }
}

