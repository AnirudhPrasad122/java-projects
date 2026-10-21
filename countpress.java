import java.util.*;

public class countpress {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of vertices
        int n = sc.nextInt();

        // Input wall vertices
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        // Input brush size
        int m = sc.nextInt();

        // Calculate the bounding box of the wall
        int minX = Arrays.stream(x).min().getAsInt();
        int maxX = Arrays.stream(x).max().getAsInt();
        int minY = Arrays.stream(y).min().getAsInt();
        int maxY = Arrays.stream(y).max().getAsInt();

        // Calculate dimensions of the bounding box
        int width = maxX - minX + 1;
        int height = maxY - minY + 1;

        // Calculate the number of MxM blocks needed to cover the bounding box
        int presses = (int) Math.ceil((double) width / m) * (int) Math.ceil((double) height / m);

        // Output the result
        System.out.println(presses);
    }
}
