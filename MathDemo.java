public class MathDemo {
    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int sum(int[] args) {
        int sum = 0;
        for (int val : args) {
            sum += val;
        }

        return sum;
    }

    public static void main() {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(MathDemo.sum(arr));
    }
}
