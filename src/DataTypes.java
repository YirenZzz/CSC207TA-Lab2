import java.util.List;

public class DataTypes {
    // TASK 1: fix this code so that it passes the test in DataTypesTest.java
    public static void main(String[] args) {
    }

    public static long sum(List<Integer> numbers) {

        long s = 0;
        // below is a "foreach" loop which iterates through numbers
        for (long x : numbers) {
            s += x;
        }
        return s;
    }
}
