import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 23, 6, 0, 12, 123, 6, 5, 1, 99, 3, 4, 1, 2);
        int sum = list.stream().reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum / list.size());
        System.out.println("Repeats: " + (list.size() - list.stream().distinct().count()));
    }
}