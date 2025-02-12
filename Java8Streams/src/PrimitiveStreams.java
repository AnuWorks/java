import java.util.Random;
import java.util.stream.IntStream;

public class PrimitiveStreams {

    public static void main(String[] args) {


        IntStream intStream = new Random().ints().limit(10);
        System.out.println(intStream.boxed().toList());
    }
}
