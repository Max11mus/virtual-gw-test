public class Task1 {
    public static void main(String[] args) {
        var task1 = new Task1();
        task1.count(5);
    }

    public void count(int n) {
        if (n < 1) return;

        count(n - 1);

        System.out.println(n);
    }
}
