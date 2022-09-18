package lang.print.gaps.task6;

public class IntegerTypeCasting {
    public static void main(String[] args) {
        long first = 1000l;
        long second = 1000l;
        first = (int) second;
        System.out.printf("%d\n%d\n", first, second);
    }
}
