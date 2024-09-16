import java.util.List;

public class DataTypes {
    public static long sum(List<Integer> numbers) {

        long s = 0;
        // below is a "foreach" loop which iterates through numbers
        for (Integer number : numbers) {
            s += number;
        }

        return s;
    }
}
