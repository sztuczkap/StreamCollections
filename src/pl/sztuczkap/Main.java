package pl.sztuczkap;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // kolekcje wyników strumieni

        Stream<String> names = Stream.of("Maciej", "Bożena", "Adam", "Marta");
/*        Object[] objects = names.toArray(String[]::new);
        String[] nameArray = names.toArray(String[]::new);

        // tworzymy liste ze strumienia
//        List<String> collect = names.collect(Collectors.toList());
        Set<String> collect = names.collect(Collectors.toSet());*/

/*        // tworzymy TreeSeta
        TreeSet<String> result = names.collect(Collectors.toCollection(TreeSet::new));*/
/*        // zwracamy imiona polaczone przecinkami
        String allNames = names.collect(Collectors.joining(", "));
        System.out.println(allNames);*/

        IntSummaryStatistics summary = names
                .collect(Collectors.summarizingInt(name -> name.length()));
        double average = summary.getAverage();
        long sum = summary.getSum();
        int max = summary.getMax();
        System.out.println(max);


        Stream<Integer> stream = Stream.of(87, 4, 76, 12);
        IntSummaryStatistics summary2 = stream
                .collect(Collectors.summarizingInt(value -> value));
        long sum2 = summary2.getSum();
        int max2 = summary2.getMax();
        System.out.println(sum2);
    }
}
