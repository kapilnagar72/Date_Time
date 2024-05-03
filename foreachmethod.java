package Date_Time;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class foreachmethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(2);
        list.add(12);
        list.add(5);
        list.add(8);
        System.out.println(list);

        List<Integer> list1 = Arrays.asList(10, 2, 12, 5, 8); //same work as above code and this code your try both
        System.out.println(list1);
        
        Consumer<Integer> cons = new Consumer<Integer>() {
            public void accept(Integer i) {
                System.out.println(i);
            }
        };
        list1.forEach(cons);

    }
}
