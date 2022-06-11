public class AdvancedJMM_07_ArrayVolatility {

    static volatile int[] arr = new int[2];

    static void thread1() {
        int[] a = arr;
        a[0] = 1;
        a[1] = 1;
    }

    static void thread2() {
        int[] a = arr;
        System.out.println(a[1]);
        System.out.println(a[0]);
    }

    public static void main(String[] args) {
        thread1();
        thread2();
    }
}
