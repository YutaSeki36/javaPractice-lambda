import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class Lamda {

    public static <T> long elapsedTime(Consumer<T> proc, T arg){
        long start = System.nanoTime();
        proc.accept(arg);
        return System.nanoTime() - start;
    }

    Consumer<String> createProc(String paramValue){
        String localValue = "local";

        // ラムダ式内で使えるのは実質finalの変数およびパラメータ変数(パラメータ変数とは引数のこと)
        Consumer<String> proc = s -> System.out.println(s + paramValue + localValue);
        return proc;
    }

    public static void main(String[] args){
        Lamda lamda = new Lamda();
        // consumerにはメソッドの参照が保存される．メソッドが格納されているポインタ？
        Consumer<String> consumer = lamda.createProc("");
        // consumerにあるメソッドの実行
        consumer.accept("ffff");
        BinaryOperator<Integer> binaryOperator = (i, i2) -> i + i2;
        BinaryOperator<Integer> binaryOperator1 =
                (i, i2) -> {
                    if(i > i2){
                        return i;
                    }else{
                        return i2;
                    }
                };
        System.out.println(binaryOperator1.apply(34,3));

        Function<String, Integer> strLength = String::length;
        Function<Integer, String> itoHex = i -> Integer.toString(i, 16);
        Function<String, String> inc = n -> n+1;

        Function<Integer, String> test = i -> {
            i++;
            return i.toString();
        };
        System.out.println(test.apply(19));
        // strLengthを実行した後にitoHex. and then ⇨　英語直訳でもなんとなく順番わかる
        Function<String, String> newFn = strLength.andThen(itoHex);
        System.out.println(newFn.apply("0123456789fasdfasdfjkljlkfffffffffffasdfasdfasdfasdfasdfasdf"));

        long ela = elapsedTime(s->{System.out.println(s.toUpperCase());}, "abcfsdfasdfasdfsadfasdfasdfas");
        System.out.println(ela);
    }
}
