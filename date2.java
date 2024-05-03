package Date_Time;

import java.util.*;
//import java.util.ArrayList;
import java.util.stream.*;;
public class date2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 1, 3, 6, 4);
        Stream<Integer> streamdata = list.stream();

        Stream<Integer> sortedStream = streamdata.sorted();
        Stream<Integer> mapStream = sortedStream.map(n -> n * 2);

        mapStream.forEach(n -> System.out.println(n));
        //streamdata.forEach(n -> System.out.println(n));
    }
}
