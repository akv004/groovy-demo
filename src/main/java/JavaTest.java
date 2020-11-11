import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaTest {

    public static void main(String args[]){
        List<String> list = Stream.of("abc","efg").collect(Collectors.toList());
        System.out.println(list);
        IntStream.range(1,10).skip(5).forEach(System.out::print);

    }
}
