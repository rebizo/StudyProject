package spring.JavaBase.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RectangleExclude {

    public static void main(String[] args) {

        Set<String> set1 = new LinkedHashSet<>();
        set1.add("1");
        set1.add("2");
        set1.add("3");
        Set<String> set2 = new LinkedHashSet<>();
        set2.add("0");
        set2.add("1");
        set2.add("2");

        System.out.println(symmetricDifference(set1, set2)); // {0, 3}
    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {

        Set<T> temporary = new HashSet<>();
        temporary.addAll(set1);
        temporary.addAll(set2);

        /*Set<T> words1 = new HashSet<T>(set1);
        words1.removeAll(set2);//retainAll(set2)
        Set<T> words2 = new HashSet<T>(set2);
        words2.removeAll(set1);//retainAll(set2)
        words1.addAll(words2);
        return words1;*/
        temporary.removeIf(item -> set1.contains(item) && set2.contains(item));
        return temporary;

        //Аналог
/*        Iterator<T> iter = temporary.iterator();
        while (iter.hasNext()) {
            T item = iter.next();
            if (set1.contains(item) && set2.contains(item)) {
                iter.remove();
            }
        return temporary;*/
    }
}