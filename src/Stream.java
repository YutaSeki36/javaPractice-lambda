import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.*;

public class Stream<S> {
    public static void main(String[] args){
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd", "ahhhg");

        java.util.stream.Stream<String> stringStream = list.stream();
        java.util.stream.Stream<String> stringStream1 = stringStream.filter(s -> s.contains("a"));

        java.util.stream.Stream<String> stringStream2 = stringStream1.map(String::toUpperCase);

        stringStream2.forEach(System.out::println);

        list.stream()
                .filter(s -> s.contains("a"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        IntSummaryStatistics stat = IntStream.range(0, 20).collect(IntSummaryStatistics::new,
                IntSummaryStatistics::accept,
                IntSummaryStatistics::combine);

//        System.out.printf("%d  %d  %d  %d  %f", stat.getCount(), stat.getSum(), stat.getMin(), stat.getMax(), stat.getAverage());

        java.util.stream.Stream<String> stream = Arrays.asList("zzz", "aa", "bbb", "x").stream();
        int min = stream.reduce(Integer.MAX_VALUE, (n1, s)->{int n2 = s.length(); System.out.println(s);
        return Integer.min(n1, n2);}, (n1, s)-> Integer.min(n1, s));

        System.out.println(min);
    }
}
