class NumberChecker {
    void check(int num) {
        System.out.println((num % 2 == 0) && (num > 10));
    }
}

public class main2 {
    public static void main(String[] args) {
        NumberChecker obj = new NumberChecker();
        obj.check(14);
    }
}
