import java.util.function.Consumer;
import java.util.function.Function;

public class Rensyu {

    @FunctionalInterface
    interface Creater<E> {
        public E createInSAM(int capasity);
    }

    @FunctionalInterface
    interface Appender{
        public StringBuilder appendInSAM(String string);
    }

    @FunctionalInterface
    interface Appender2 {
        public void appendInSAM(StringBuilder sb, String s);
    }

    public static void main(String[] args){
        Creater<StringBuilder> creater = StringBuilder::new;
        StringBuilder sb = creater.createInSAM(8);

        Appender appender = sb::append;
        appender.appendInSAM("sbc");

        Appender2 appender2 = StringBuilder::append;
        appender2.appendInSAM(sb, "def");

        System.out.println(sb);
        Consumer function = System.out::println;
        function.accept("fsdaf");
        Function<Integer, StringBuilder> consumer = StringBuilder::new;
        StringBuilder st = consumer.apply(10);
        st.append("dsfjasdlfkjasdfla");
        System.out.println(st);

        Consumer<String> consumer1 = s -> System.out.println(s);
        consumer1.accept("ラムダ式だよ");
    }
}
