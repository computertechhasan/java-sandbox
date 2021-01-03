import java.util.HashMap;

public class Main {

    public static HashMap<Integer, Integer> fibAnswers = new HashMap<Integer, Integer>();
    public static Integer zero = new Integer(0);
    public static Integer one = new Integer(1);
    public static Integer two = new Integer (2);
    public static void main(String[] args) {
        int fibInt = 7000;


        final long startTime = System.currentTimeMillis();
        // System.out.println(fib(fibInt));
        final long endTime = System.currentTimeMillis();
        // System.out.println("scrub way took " + (endTime-startTime) + "ms to run");

        final long anotherStart = System.currentTimeMillis();
        System.out.println(memoFib(fibInt));
        final long anotherEnd = System.currentTimeMillis();
        System.out.println("fast way took " + (anotherEnd-anotherStart) + "ms to run");
    }

    public static int fib(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }

    public static Integer memoFib(Integer n) {
        Integer checkInt = new Integer(n);
        // checkInt = Integer.valueOf(n);
        if (fibAnswers.containsKey(checkInt)) {
            return fibAnswers.get(checkInt);
        } else {
            if (n.equals(one)) {
                fibAnswers.put(checkInt, zero);
                return zero;
            } else if (n.equals(two)) {
                fibAnswers.put(checkInt, one);
                return one;
            } else {
                int tmp = memoFib(checkInt.intValue() -1) + memoFib(checkInt.intValue() -2);
                Integer temp = new Integer(tmp);
                fibAnswers.put(checkInt, temp);
                return temp;
            }
        }
    }
}