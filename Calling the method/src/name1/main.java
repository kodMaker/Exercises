package name1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        firstMethod();
        secoundMethod();
        thirdMethod();
        fourthMethod();
        fifthMethod();
    }

    public static void firstMethod() {
        int[] a = {1, 2, 3};
        System.out.println(Arrays.toString(a));
    }

    public static void secoundMethod() {
        int[] a = {2, 1, 3};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void thirdMethod() {
        int[] a = {1, 2, 3};
        System.out.println(Arrays.binarySearch(a, 2));
    }

    public static void fourthMethod() {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = Arrays.copyOf(a, a.length); //
        System.out.println(Arrays.toString(b));
    }

    public static void fifthMethod() {
        int[] a = {1, 2, 3};
        int[] b = new int[a.length];
        System.arraycopy(a, 0, b, 0, 3);
    }
}
