import java.util.List;

public class DataTypes {
    public static long sum(List<Integer> numbers) {
        int a = 0;
        int s = 0;
        int b =0;
        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            s += x;
        }
        return (long) s;
    }
}
