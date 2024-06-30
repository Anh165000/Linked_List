import java.util.Scanner;

public class Question2 {
    public static int list[] = new int[100];
    public static int n;
    private static Scanner scanner = new Scanner(System.in);

    public Question2() {
    }

    public static void insert_foward() {
        n = Integer.parseInt(scanner.nextLine());
        while (true) {
            try {
                for (int i = 0; i < n; i++) {
                    list[i] = scanner.nextInt();
                }
                break;
            } catch (Exception e) {

            }
        }
    }

    public static void insert_backward() {
        n = Integer.parseInt(scanner.nextLine());
        while (true) {
            try {
                for (int i = n - 1; i >= 0; i--) {
                    list[i] = scanner.nextInt();
                }
                break;
            } catch (Exception e) {

            }
        }
    }

    public static void print_list() {
        for(int i = 0; i < n; i++) {
            System.out.printf("%d ", list[i]);
        }
    }
    public static void main(String[] args) throws Exception {
        // insert_foward();
        // insert_backward();
    }
}
